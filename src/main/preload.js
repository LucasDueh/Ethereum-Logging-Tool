const { contextBridge, ipcRenderer } = require('electron');

window.require = require;

contextBridge.exposeInMainWorld('electron', {
  ipcRenderer: {
    myPing() {
      ipcRenderer.send('ipc-example', 'ping');
    },
    validateManifest(filename) {
      ipcRenderer.invoke('validate-manifest', filename);
    },
    extractManifest(filename) {
      ipcRenderer.invoke('extract-manifest', filename);
    },
    reduceAbi: async (input) => {
      return ipcRenderer.invoke('reduce-abi', input);
    },
    transformAbiToActivities: async (abiEntries) => {
      return ipcRenderer.invoke('transform-abi-to-activities', abiEntries);
    },
    on(channel, func) {
      const validChannels = ['ipc-example'];
      if (validChannels.includes(channel)) {
        // Deliberately strip event as it includes `sender`
        ipcRenderer.on(channel, (event, ...args) => func(...args));
      }
    },
    once(channel, func) {
      const validChannels = ['ipc-example'];
      if (validChannels.includes(channel)) {
        // Deliberately strip event as it includes `sender`
        ipcRenderer.once(channel, (event, ...args) => func(...args));
      }
    },
  },
});
