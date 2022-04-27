# Ethereum Logging Tool
A prototype of a desktop application that allows the extraction of transaction-related data from an Ethereum node.

## Blockchain Logging Framework
<p>
The extraction capabilities are provided by the <a href="https://github.com/TU-ADSP/Blockchain-Logging-Framework">Blockchain Logging Framework</a>. The compiled executable is executed via Node.js's child processes. The output and results of these executions is shown in the user interface.

License: MIT Licence Agreement. Details can be found [LICENSE.md](https://github.com/TU-ADSP/Blockchain-Logging-Framework)

The Ethereum Logging Tool deploys an <a href="https://github.com/LucasDueh/Blockchain-Logging-Framework">extension of the Blockchain Logging Framework</a> that additionally supports the extraction of decoded transaction input data. It also allows the invocation of public member queries for arbitrary block numbers, in particular, for `currentBlockNumber-1`, to access the state previous to the currently examined block.
</p>

## Electron React Boilerplate
<p>
The project is built upon the Electron React Boilerplate which uses <a href="https://electron.atom.io/">Electron</a>, <a href="https://facebook.github.io/react/">React</a>, <a href="https://github.com/reactjs/react-router">React Router</a>, <a href="https://webpack.js.org/">Webpack</a> and <a href="https://www.npmjs.com/package/react-refresh">React Fast Refresh</a>.

License: MIT © [Electron React Boilerplate](https://github.com/electron-react-boilerplate)
</p>

## Build

1. Ensure Java 13 or higher is installed locally and the env var JAVA_HOME is properly set
2. Run `npm run package` to package the application for the local platform
3. The executable can be found in `release/build`

## Usage

There is two main features.

### Creating a new manifest file

This process is divided into four steps.
1. Specify contracts by entering contract addresses and contracs ABIs.
2. Select functions and events which are used for the extraction process.
3. Change settings (e.g., specify connection to Ethereum node).
4. Write the manifest file. The proposed code blocks on the right-hand side facilitate this step. Make sure to validate the written manifest. Only validated files can be used for the following extraction process. 

### Extracting data from the Ethereum blockchain

1. Open a manifest file.
2. Press the button at the bottom to initiate the extraction process.
3. Once the process is done, the written output is saved to the user data folder (platform-dependent).

## TODO

- Feature to edit a manifest file after creation
- Comprehensive guidance and instructions for writing the manifest file
- Stability improvements
- UI improvements
- Code refactoring
