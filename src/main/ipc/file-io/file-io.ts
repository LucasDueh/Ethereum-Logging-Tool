/* eslint-disable no-console */
import { ipcMain, dialog } from 'electron';

const fs = require('fs');

const saveManifestFile = async (content: string) => {
  const dialogOptions = {};
  try {
    const result = await dialog.showSaveDialog(dialogOptions);
    const { filePath } = result;
    fs.writeFile(filePath, content, (err: Error) => {
      let options;
      if (err) {
        options = {
          buttons: ['Close'],
          title: 'Error',
          type: 'error',
          message: err.name || 'Export Error',
          detail: err.toString(),
        };
      } else {
        options = {
          buttons: ['Close'],
          title: 'Success',
          type: 'info',
          message: `Saved to ${filePath}`,
        };
      }
      dialog.showMessageBox(options);
    });
  } catch (e) {
    console.log(e);
  }
};

const openManifestFile = async (filename: string) => {};

module.exports = {
  saveManifestFile: ipcMain.handle(
    'save-manifest-file',
    async (_event, content) => {
      console.log('Saving manifest file');
      saveManifestFile(content);
    }
  ),
  openManifestFile: ipcMain.handle(
    'open-manifest-file',
    async (_event, filename) => {
      console.log('Opening manifest file ', filename);
      openManifestFile(filename);
    }
  ),
};
