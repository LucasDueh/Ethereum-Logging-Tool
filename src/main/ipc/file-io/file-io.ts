/* eslint-disable no-console */
import { ipcMain, dialog } from 'electron';

const fs = require('fs');

const saveManifestFile = async (content: string) => {
  const dialogOptions = {};
  const result = await dialog.showSaveDialog(dialogOptions);
  const { filePath } = result;

  let messageOptions;
  return new Promise<void>((resolve, reject) => {
    fs.writeFile(filePath, content, (err: Error) => {
      if (err) {
        messageOptions = {
          buttons: ['Close'],
          title: 'Error',
          type: 'error',
          message: err.name || 'Write Error',
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

const openManifestFile = async () => {
  const dialogOptions = {
    filters: [{ name: 'Blockchain Query Language', extensions: ['bcql'] }],
  };
  const result = await dialog.showOpenDialog(dialogOptions);
  const { canceled, filePaths } = result;
  const filePath = filePaths[0];

  let messageOptions;
  return new Promise((resolve, reject) => {
    fs.readFile(filePath, 'utf8', (err: Error, data: string | Buffer) => {
      if (err) {
        messageOptions = {
          buttons: ['Close'],
          title: 'Error',
          type: 'error',
          message: err.name || 'Read Error',
          detail: err.toString(),
        };
        dialog.showMessageBox(messageOptions);
        return reject(err);
      }
      messageOptions = {
        buttons: ['Close'],
        title: 'Success',
        type: 'info',
        message: `Successfully opened file ${filePath}`,
      };
      dialog.showMessageBox(messageOptions);
      const fileData = { filePath, data };

      return resolve(fileData);
    });
  });
};

module.exports = {
  saveManifestFile: ipcMain.handle(
    'save-manifest-file',
    async (_event, content) => {
      console.log('Saving manifest file');
      return saveManifestFile(content);
    }
  ),
  openManifestFile: ipcMain.handle('open-manifest-file', async (_event) => {
    console.log('Attempting to open manifest file ');
    return openManifestFile();
  }),
};
