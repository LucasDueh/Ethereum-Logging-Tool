/* eslint-disable no-console */
import { ipcMain, dialog } from 'electron';

const fs = require('fs');

const saveManifestFile = async (content: string) => {
  const dialogOptions = {};
  let messageOptions;

  const result = await dialog.showSaveDialog(dialogOptions);
  const { filePath } = result;

  return new Promise<void>((resolve, reject) => {
    fs.writeFile(filePath, content, (err: Error) => {
      if (err) {
        messageOptions = {
          buttons: ['Close'],
          title: 'Error',
          type: 'error',
          message: err.name || 'Export Error',
          detail: err.toString(),
        };
        dialog.showMessageBox(messageOptions);
        return reject(err);
      }
      messageOptions = {
        buttons: ['Close'],
        title: 'Success',
        type: 'info',
        message: `Saved to ${filePath}`,
      };
      dialog.showMessageBox(messageOptions);
      return resolve();
    });
  });
};

const openManifestFile = async (filename: string) => {};

module.exports = {
  saveManifestFile: ipcMain.handle(
    'save-manifest-file',
    async (_event, content) => {
      console.log('Saving manifest file');
      return saveManifestFile(content);
    }
  ),
  openManifestFile: ipcMain.handle(
    'open-manifest-file',
    async (_event, filename) => {
      console.log('Opening manifest file ', filename);
      return openManifestFile(filename);
    }
  ),
};
