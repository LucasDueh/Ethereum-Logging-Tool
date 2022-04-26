/* eslint-disable no-console */
import { app, ipcMain, BrowserWindow } from 'electron';
import path from 'path';
import { spawn } from 'child_process';

import { writeTempManifest, dailyTempFolderUri } from './temp-files';

const blfBinary = path.join(
  __dirname,
  '../../../../assets',
  'blf/jar/blf-cmd.jar'
);

const javaPath = '/usr/bin/java';

const spawnBLFProcess = (mode: string, filePath: string) => {
  const BLF = spawn(javaPath, ['-jar', blfBinary, mode, filePath], {
    cwd: app.getPath('userData'),
  });

  BLF.stdout.setEncoding('utf-8');
  BLF.stderr.setEncoding('utf-8');

  const mainWindow = BrowserWindow.getFocusedWindow();

  BLF.stdout.on('data', (data) => {
    if (mode === 'extract') {
      mainWindow?.webContents.send('blf-extraction-stdout', data.toString());
    } else {
      mainWindow?.webContents.send('blf-validation-stdout', data.toString());
    }

    console.log('stdout:', data.toString());
  });

  BLF.stderr.on('data', (data) => {
    if (mode === 'extract') {
      mainWindow?.webContents.send('blf-extraction-stderr', data.toString());
    } else {
      mainWindow?.webContents.send('blf-validation-stderr', data.toString());
    }

    console.log('stderr:', data.toString());
  });

  BLF.on('close', (code: number) => {
    if (mode === 'extract') {
      mainWindow?.webContents.send('blf-extraction-closed', code);
    } else {
      mainWindow?.webContents.send('blf-validation-closed', code);
    }

    console.log(`child process exited with code ${code}`);
  });
};

const validateTempManifest = async (content: string) => {
  await writeTempManifest(content)
    .then((fileName: string) => {
      const filePath = path.join(
        app.getPath('userData'),
        dailyTempFolderUri(),
        fileName
      );
      spawnBLFProcess('validate', filePath);
      return null;
    })
    .catch((err) => {
      console.error(err);
    });
};

module.exports = {
  validateTempManifest: ipcMain.handle(
    'validate-temp-manifest',
    async (_event, content) => {
      console.log('Validating temp manifest');
      validateTempManifest(content);
    }
  ),
  validateManifest: ipcMain.handle(
    'validate-manifest',
    async (_event, filePath) => {
      console.log('Validating manifest ', filePath);
      spawnBLFProcess('validate', filePath);
    }
  ),
  extract: ipcMain.handle('extract', async (_event, filePath) => {
    console.log('Extracting with manifest ', filePath);
    spawnBLFProcess('extract', filePath);
  }),
  getOutputFolderPath: ipcMain.handle('get-output-folder-path', async () => {
    return app.getPath('userData');
  }),
};
