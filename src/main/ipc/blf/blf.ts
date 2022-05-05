/* eslint-disable no-console */
import { app, ipcMain, BrowserWindow } from 'electron';
import path from 'path';
import { ChildProcess, spawn } from 'child_process';

import { writeTempManifest, dailyTempFolderUri } from './temp-files';

let blfBinary: string;

if (process.env.NODE_ENV === 'production') {
  blfBinary = path.join(process.resourcesPath, 'assets/blf/jar/blf-cmd.jar');
} else {
  blfBinary = path.join(__dirname, '../../../../assets', 'blf/jar/blf-cmd.jar');
}

let runningProcess: ChildProcess | null = null;

const killRunningProcess = () => {
  runningProcess?.kill();
  runningProcess = null;
};

const spawnBLFProcess = (mode: string, filePath: string) => {
  killRunningProcess();

  const BLF = spawn('java', ['-jar', blfBinary, mode, filePath], {
    cwd: app.getPath('userData'),
  });

  runningProcess = BLF;

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
      validateTempManifest(content);
    }
  ),
  validateManifest: ipcMain.handle(
    'validate-manifest',
    async (_event, filePath) => {
      spawnBLFProcess('validate', filePath);
    }
  ),
  extract: ipcMain.handle('extract', async (_event, filePath) => {
    spawnBLFProcess('extract', filePath);
  }),
  killRunningProcess: ipcMain.handle('kill-running-process', async () => {
    killRunningProcess();
  }),
  getOutputFolderPath: ipcMain.handle('get-output-folder-path', async () => {
    return app.getPath('userData');
  }),
};
