const { contextBridge, ipcRenderer } = require('electron');

window.require = require;

contextBridge.exposeInMainWorld('electron', {
  ipcRenderer: {
    validateTempManifest(content) {
      ipcRenderer.invoke('validate-temp-manifest', content);
    },
    validateManifest(filePath) {
      ipcRenderer.invoke('validate-manifest', filePath);
    },
    extract(filePath) {
      ipcRenderer.invoke('extract', filePath);
    },
    getOutputFolderPath: async () => {
      return ipcRenderer.invoke('get-output-folder-path');
    },
    reduceAbi: async (input) => {
      return ipcRenderer.invoke('reduce-abi', input);
    },
    transformAbiToActivities: async (abiEntries) => {
      return ipcRenderer.invoke('transform-abi-to-activities', abiEntries);
    },
    saveManifestFile: (content) => {
      return ipcRenderer.invoke('save-manifest-file', content);
    },
    openManifestFile: () => {
      return ipcRenderer.invoke('open-manifest-file');
    },
    on(channel, func) {
      const validChannels = ['blf-extraction-stdout', 'blf-extraction-stderr'];
      if (validChannels.includes(channel)) {
        ipcRenderer.on(channel, (event, ...args) => func(...args));
      }
    },
    once(channel, func) {
      const validChannels = [
        'blf-validation-stdout',
        'blf-validation-stderr',
        'blf-validation-closed',
        'blf-extraction-closed',
      ];
      if (validChannels.includes(channel)) {
        ipcRenderer.once(channel, (event, ...args) => func(...args));
      }
    },
    removeAllListeners(channel) {
      const validChannels = [
        'blf-validation-stdout',
        'blf-validation-stderr',
        'blf-validation-closed',
        'blf-extraction-stdout',
        'blf-extraction-stderr',
        'blf-extraction-closed',
      ];
      if (validChannels.includes(channel)) {
        ipcRenderer.removeAllListeners(channel);
      }
    },
  },
});
