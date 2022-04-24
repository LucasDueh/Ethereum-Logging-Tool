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
    cwd: path.join(process.cwd(), 'assets/blf/output'),
  });

  BLF.stdout.setEncoding('utf-8');
  BLF.stderr.setEncoding('utf-8');

  BLF.stdout.on('data', (data) => {
    const mainWindow = BrowserWindow.getFocusedWindow();
    mainWindow?.webContents.send('blf-stdout', data.toString());
  });

  BLF.stderr.on('data', (data) => {
    const mainWindow = BrowserWindow.getFocusedWindow();
    mainWindow?.webContents.send('blf-stderr', data.toString());
  });

  BLF.on('close', (code) => {
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
};
