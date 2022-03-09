/* eslint-disable no-console */
import { app, ipcMain } from 'electron';
import path from 'path';
import { spawn } from 'child_process';

const BLFBinary = path.join(
  __dirname,
  '../../../assets',
  'java/Blockchain-Logging-Framework/target/blf-cmd.jar'
);

const spawnBLFProcess = (mode: string, filename: string) => {
  const manifestFile = path.join(
    app.getPath('userData'),
    'Manifests',
    filename
  );

  const BLF = spawn('/usr/bin/java', ['-jar', BLFBinary, mode, manifestFile], {
    cwd: path.join(
      process.cwd(),
      'assets/java/Blockchain-Logging-Framework/target'
    ),
  });

  BLF.stdout.on('data', (data) => {
    console.log(`stdout: ${data}`);
  });

  BLF.stderr.on('data', (data) => {
    console.error(`stderr: ${data}`);
  });

  BLF.on('close', (code) => {
    console.log(`child process exited with code ${code}`);
  });
};

module.exports = {
  validateManifest: ipcMain.handle(
    'validate-manifest',
    async (_event, filename) => {
      console.log('Validating manifest from backend', filename);
      spawnBLFProcess('validate', filename);
    }
  ),
  extractManifest: ipcMain.handle(
    'extract-manifest',
    async (_event, filename) => {
      console.log('Extracting manifest from backend', filename);
      spawnBLFProcess('extract', filename);
    }
  ),
};
