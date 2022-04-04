/* eslint-disable no-console */
import { app, ipcMain, BrowserWindow } from 'electron';
import path from 'path';
import { spawn } from 'child_process';

import { writeTempManifest, dailyTempFolderUri } from './temp-files';

const BLFBinary = path.join(
  __dirname,
  '../../../../assets',
  'java/Blockchain-Logging-Framework/target/blf-cmd.jar'
);

const spawnBLFProcess = (mode: string, folder: string, filename: string) => {
  const manifestFile = path.join(app.getPath('userData'), folder, filename);

  const BLF = spawn('/usr/bin/java', ['-jar', BLFBinary, mode, manifestFile], {
    cwd: path.join(
      process.cwd(),
      'assets/java/Blockchain-Logging-Framework/target'
    ),
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
      spawnBLFProcess('validate', dailyTempFolderUri(), fileName);
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
    async (_event, filename) => {
      console.log('Validating manifest ', filename);
      spawnBLFProcess('validate', 'manifests', filename);
    }
  ),
  extractManifest: ipcMain.handle(
    'extract-manifest',
    async (_event, filename) => {
      console.log('Extracting manifest ', filename);
      spawnBLFProcess('extract', 'manifests', filename);
    }
  ),
};
