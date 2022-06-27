# Ethereum Logging Tool (ELT)
A prototype of a desktop application that allows the extraction of Ethereum data that can be used for process mining.

The core framework that enables the extraction and transformation of blockchain data is the <a href="https://github.com/TU-ADSP/Blockchain-Logging-Framework">Blockchain Logging Framework</a> (BLF).
The architecture of the framework comprises three main components:
- the Blockchain Query Language (BcQL)
- the validator
- the extractor

The BcQL is used to define the manifest document which declares what type of information to extract from the blockchain, where to extract it from, and how it should be written to a log.
The validator and the extractor are used to process the user-defined manifest documents.
An overview of the BLF architecture can be seen in the figure below.

![Overview of the BLF](https://github.com/LucasDueh/Ethereum-Logging-Tool/blob/master/overview_blf.png?raw=true)

The user interfaces supplied by the Ethereum Logging Tool aim at facilitating the process of writing the manifest document.
This tool invokes the validator and extractor components of the BLF by running its executable JAR file. The compiled executable is located in `assets/blf/jar` and is executed via Node.js's child processes. The output and results of these executions are shown in the user interface. This implies, the Blockchain Logging Framework does not have to be explicitely compiled to make use of this tool.
However, since the two repositories are divided, as it stands right now, whenever the Blockchain Logging Framework is extended, the newly compiled `jar` file needs to manually be placed under `assets/blf/jar`.
An overview of the Ethereum Logging Tool can be seen in the figure below.

![Overview of the Tool](https://github.com/LucasDueh/Ethereum-Logging-Tool/blob/master/overview_tool.png?raw=true)

## Related repositories

#### Blockchain Logging Framework
<p>
The extraction capabilities are provided by the <a href="https://github.com/TU-ADSP/Blockchain-Logging-Framework">Blockchain Logging Framework</a>. The Ethereum Logging Tool makes use of an <a href="https://github.com/LucasDueh/Blockchain-Logging-Framework">extension of the Blockchain Logging Framework</a> that provides further filtering capabilities.

License: MIT Licence Agreement. Details can be found [LICENSE.md](https://github.com/TU-ADSP/Blockchain-Logging-Framework)
</p>

#### Electron React Boilerplate
<p>
The project is built upon the Electron React Boilerplate which uses <a href="https://electron.atom.io/">Electron</a>, <a href="https://facebook.github.io/react/">React</a>, <a href="https://github.com/reactjs/react-router">React Router</a>, <a href="https://webpack.js.org/">Webpack</a> and <a href="https://www.npmjs.com/package/react-refresh">React Fast Refresh</a>.

License: MIT © [Electron React Boilerplate](https://github.com/electron-react-boilerplate)
</p>

## Build

1. Ensure Java 13 or higher is installed locally and the env var JAVA_HOME is properly set.
2. Ensure npm is installed locally.
3. Run `npm install` to install the dependencies.
4. Run `npm run package` to package the application for the local platform.
5. The executable can be found in `release/build`.

## Connection to an Ethereum Node
A connection to an Ethereum node is required. This can be done by setting up an own node or by making use of cloud-based services.
Setting up an own node is a more trustless and sovereign approach but requires lots of disk space and on-going maintenance.
Cloud services are comfortable to use, provide high server uptime and bypass the need of setting up your own large storage solutions. However, the trade off is having to trust the third party, i.e., the server provider.
General information on Ethereum nodes and node types can be found [here](https://ethereum.org/en/developers/docs/nodes-and-clients/).

### Option 1: Setting Up an Own Node
A suitable guide to set up an own node can be found on the [Ethereum website](https://ethereum.org/en/developers/docs/nodes-and-clients/run-a-node/) and on [EthHub](https://docs.ethhub.io/using-ethereum/running-an-ethereum-node/).

Popular Ethereum clients include
* [OpenEthereum](https://github.com/openethereum/openethereum/releases)
  * [OpenEthereum: Setup](https://openethereum.github.io/Setup)
* [Geth](https://geth.ethereum.org/downloads/)
  * [Geth: How to a run a light node](https://ethereum.org/en/developers/tutorials/run-light-node-geth/)

### Option 2: Making Use of a Cloud-Based Service
Usually, cloud services offer a free tier and a premium tier that provide Ethereum nodes with different capabilities.
The free tier provides a full/archive node with the drawback of having limited requests per day, while the premium tier provides additional features and less restrictions.

Popular services are:
* [Alchemy](https://www.alchemy.com)
* [Infura](https://infura.io)
* [QuickNode](https://www.quicknode.com)
* [BlockDaemon](https://blockdaemon.com)

Furthermore, there is [ArchiveNode](https://archivenode.io) which "is an initiative led by DeFi Dude and MysticRyuujin to offer archive node access for Ethereum developers at no cost." Access to the node needs to be requested.

#### Alchemy: Setup

1. Register a new account or login to existing account
2. Navigate to `Apps > Create App`, select `Ethereum` and the chain (Mainnet, etc.) and give the app a name.
3. Navigate to the newly created app. Under `VIEW KEY`, the HTTPS and WebSocket keys can be copied to clipboard.

#### Infura: Setup

1. Register a new account or login to existing account
2. Navigate to `CREATE NEW PROJECT`, select `Ethereum` and give the project a name.
3. Navigate to `PROJECT SETTINGS`. There, the HTTPS and WebSocket keys can be copied to clipboard.

#### Existing Infura and Alchemy Endpoints

To quickly test the functionality of the tool, the following endpoints can be used (provided by Alchemy and Infura):
* ```wss://eth-mainnet.alchemyapi.io/v2/43UD7sDV0NX1hgJIZZms5btltccfFqqN```
* ```wss://mainnet.infura.io/ws/v3/ecc103e7c4f4426ab15fb39e38176d67```

## Contract ABI
For each smart contract, the user has to provide the contract address and the contract ABI, which can be copied from the Ethereum blockchain explorer Etherscan.
The ABI of a contract can be copied from the respective Etherscan page by navigating to `Contract > Contract ABI > Copy ABI to Clipboard`.

Exemplary contract on Etherscan: [Eth2 Deposit Contract](https://etherscan.io/address/0x00000000219ab540356cbb839cbe05303d7705fa).

## Determining a Suitable Block Range
In order to extract meaningful data, it is necessary to find out a block range that holds lots of transactions related to the DApp under scrutiny. A suitable time frame can be inferred by visiting the DApp-related Etherscan page and then navigating to the time series graph under `Analytics > Transactions`. To get the block by date, a suitable npm package is [ethereum-block-by-date](https://www.npmjs.com/package/ethereum-block-by-date).

Example Script (written in JavaScript):

```
const EthDater = require('ethereum-block-by-date');
const provider = new ethers.providers.CloudflareProvider();

const dater = new EthDater(
  provider // Ethers provider, required.
);

const getBlockNumbers = async () => {
  let startBlock = await dater.getDate(
    '2019-03-14T00:00:00Z', // Date, required. Any valid moment.js value: string, milliseconds, Date() object, moment() object.
    true, // Block after, optional. Search for the nearest block before or after the given date. By default true.
    false // Refresh boundaries, optional. Recheck the latest block before request. By default false.
  );

  let endBlock = await dater.getDate(
    '2019-03-17T00:00:00Z',
    true,
    false
  );

  console.log(startBlock);
  console.log(endBlock);
};
```

## Usage

The tool has two main views: one view for creating a new manifest document and a second view to inititate the data extraction process.

### Creating a new manifest file

This process is divided into four steps:
1. Specify contracts by entering contract addresses and contracs ABIs
2. Select functions and events which are used for the extraction process.
3. Configure settings (e.g., specify connection to Ethereum node).
4. Write the content of the manifest.

Note, that, initially, the content of the manifest is empty.
Step four involves manual input from the user.
The proposed code snippets on the right-hand side of the UI can be copy-pasted to quickly compose the main bulk of the manifest.
However, in many cases, in order to create sensible manifest documents, the user has to write additional BcQL code (e.g., variable declarations or additional emit statements).
Thus, basic knowledge wrt. the BcQL syntax is beneficial.
More information regarding BcQL can be found on the wiki pages [Manifest](https://github.com/LucasDueh/Blockchain-Logging-Framework/wiki/Manifest) and [Contributions: Added Features](https://github.com/LucasDueh/Blockchain-Logging-Framework/wiki/Contributions:-Features).

While familiarizing yourself with the tool, you can have a look at this [list of examined DApps](https://github.com/LucasDueh/Blockchain-Logging-Framework/wiki/Examined-Dapps).
For each examined DApp, the contract names and addresses, the links to related Etherscan pages, the path to the manifest document and a link to the documentation/whitepaper/Github are supplied.

Additionally, the [Collection of Resources for Process Mining on Blockchain Data](https://ingo-weber.github.io/dapp-data/index.html) by Klinkmüller et al. could prove to be useful.

To get a grasp of the manifest creation process and to demonstrate these four steps, we cover two examples taken from the [list of examined DApps](https://github.com/LucasDueh/Blockchain-Logging-Framework/wiki/Examined-Dapps).

#### Example 1: Uniswap V2
Uniswap V2 is a decentralized exchange (DEX), that allows swapping two ERC-20 tokens.
The contract _UniswapV2Pair_ is deployed for each registered pair of ERC-20 tokens.
Each pair manages a liquidity pool that contains the reserves of the two respective tokens.
Accounts that provide liquidity to the pools are called liquidity providers.
Every time they provide liquidity (i.e., they create new tokens of the specified pair via a _mint_ function), they receive a fixed amount of liquidity tokens, relative to the amount provided.
Each time a trader interacts with the contract to _swap_ his tokens, Uniswap applies a 0.30% fee to the trades.
The fees are added to a pair-specific reserve that is later distributed to all liquidity providers.
In order to get their deposits back and access the fees accrued, liquidity providers have to _burn_ a portion of their liquidity tokens, i.e., pay a fixed amount that is relative to the reclaimed liquidity.
The contract _UniswapV2Factory_ is a singleton factory contract that is responsible for the creation of pairs.
Each time the reserves of a pool are updated, the two tokens that form the pair are _synced_.
The function _skim_ has to be called by liquidity providers to withdraw tokens, when the amount of deposited tokens gets too high and reaches a certain threshold.

Each process instance is identified by the address of the deployed Pair contract.
For the sake of simplicity, we only consider the Pair contract [UniswapV2Pair: AMPL](https://etherscan.io/address/0xc5be99a02c6857f9eac67bbce58df5572498f40c#code).
The identified process activities are _Pair Created_, _Liquidity Tokens Burned_, _Liquidity Tokens Minted_, _Tokens Swapped_, _Tokens Synced_ and _Tokens Skimmed_.
The required contracts, the process activities and the related ABI entries are summarized below:

* Contract(s):
  * [UniswapV2Factory (0x5C69bEe701ef814a2B6a3EDD4B1652CB9cc5aA6f)](https://etherscan.io/address/0x5C69bEe701ef814a2B6a3EDD4B1652CB9cc5aA6f)
  * [UniswapV2Pair: AMPL (0xc5be99A02C6857f9Eac67BbCE58DF5572498F40c)](https://etherscan.io/address/0xc5be99a02c6857f9eac67bbce58df5572498f40c#code)
* Process Instance: Identified by address of deployed Pair contract
* Process Activities:
  * _Pair Created_
    * Solidity Event: `PairCreated(address indexed token0,address indexed token1,address pair, uint256 noname)` of contract [UniswapV2Factory](https://etherscan.io/address/0x5C69bEe701ef814a2B6a3EDD4B1652CB9cc5aA6f)
  * _Liquidity Tokens Burned_
    * Solidity Event: `Burn(address indexed sender,uint256 amount0,uint256 amount1,address indexed to)` of respective Pair contract
  * _Liquidity Tokens Minted_
    * Solidity Event: `Mint(address indexed sender,uint256 amount0,uint256 amount1)` of respective Pair contract
  * _Tokens Swapped_
    * Solidity Event: `Swap(address indexed sender,uint256 amount0In,uint256 amount1In,uint256 amount0Out,uint256 amount1Out,address indexed to)` of respective Pair contract
  * _Tokens Synced_
    * Solidity Event: `Sync(uint112 reserve0,uint112 reserve1)` of respective Pair contract
  * _Tokens Skimmed_
    * Solidity Function: `skim(address to)` of respective Pair contract

#### Step 1: Specify contracts by entering contract addresses and contracs ABIs
In the first step, we enter the contract address and ABI of the two contracts [UniswapV2Factory](https://etherscan.io/address/0x5C69bEe701ef814a2B6a3EDD4B1652CB9cc5aA6f) and [UniswapV2Pair: AMPL](https://etherscan.io/address/0xc5be99a02c6857f9eac67bbce58df5572498f40c#code).

#### Step 2: Select functions and events which are used for the extraction process
In the second step, for each entered contract, we select the previously identfied ABI entries.
This means, we select `PairCreated` from the list of ABI entries of [UniswapV2Factory](https://etherscan.io/address/0x5C69bEe701ef814a2B6a3EDD4B1652CB9cc5aA6f) and we select `Burn, Swap, Sync, skim` from the list of ABI entries of [UniswapV2Pair: AMPL](https://etherscan.io/address/0xc5be99a02c6857f9eac67bbce58df5572498f40c#code).

#### Step 3: Configure settings
In this step, we specify the settings for _Abort on Exception_, _Emission Mode_, _Connection Mode_ and _Connection_.
The latter two are used to specify the endpoint of the Ethereum Node we connect to.
More information on the other two settings can be found on the [wiki page under "Writing a manifest"](https://github.com/LucasDueh/Blockchain-Logging-Framework/wiki/Manifest).

#### Step 4: Write the content of the manifest
The first thing to do is to specify the block range of the block filter.
This is done by replacing `FROM` and `TO` with the previously identified start and end block number (```BLOCKS (FROM) (TO) { ... }```).
AMPL was created at block 10091499.
Hence, wrt. AMPL, a suitable block range is 10091499-10101499.

Above the block filter, global variables can be defined that are repeatedly needed throughout the manifest.
The need for global variables depends on the DApp under scrutiny.
Let us consider our case.
The contract [UniswapV2Factory](https://etherscan.io/address/0x5C69bEe701ef814a2B6a3EDD4B1652CB9cc5aA6f) emits the `PairCreated` log entry for every token pair.
Since we are only interested in log entries related to a small subset of Pair contract, we need to initialize an array of Pair contract addresses which can later be used for the condition of an IF-statement that ensures that we only perform emit statement data for the considered Pair contracts.
In this simple case, we only append the address of [UniswapV2Pair: AMPL](https://etherscan.io/address/0xc5be99a02c6857f9eac67bbce58df5572498f40c#code) to the array.

```
address ampl = 0xc5be99a02c6857f9eac67bbce58df5572498f40c;
address[] pairs = newAddressArray();
add(pairs, ampl);
BLOCKS (10091499) (10101499 { ... }
```

Then, we can actually start composing the content of the manifest.
For each selected ABI entry, the tool proposes multiple related BcQL code snippet.
Usually, there is one code snippet related to the required filter and another snippet containing an emit statement for writing the specified event to an XES file.
Further information on emit statements can be read on the [wiki page under "Emitting data"](https://github.com/LucasDueh/Blockchain-Logging-Framework/wiki/Manifest).

For instance, for the Solidity event `PairCreated`, we first copy and paste the following code snippet inside the scope of the block filter:

```
LOG ENTRIES (0x5C69bEe701ef814a2B6a3EDD4B1652CB9cc5aA6f) (
  PairCreated(address indexed token0,address indexed token1,address pair,uint256 input3)
){
  // Enter your extraction code here
}
```

Then, inside the scope of the log entry filter, we first check whether the value of the parameter `address pair` is contained in the previously defined array of Pair contract addresses.
As stated above, we first define a variable that holds the boolean value of the condition  (i.e., whether the address of the Pair contract is contained in the global array `pairs`), and then, we evaluate the condition in an IF-statement/generic filter.
Subsequently, we copy and paste the related emit statement, resulting in the following code block:

```
LOG ENTRIES (0x5C69bEe701ef814a2B6a3EDD4B1652CB9cc5aA6f) (
  PairCreated(address indexed token0,address indexed token1,address pair,uint256 noname)
){
  bool contained = contains(pairs, pair);
  IF (contained) {
    EMIT XES EVENT (pid)(piid)(eid)(
      "PairCreated" as xs:string concept:name,
      block.timestamp as xs:date time:timestamp,
      block.number as xs:int blockNumber,
      token0 as xs:string token0,
      token1 as xs:string token1,
      pair as xs:string pair
    );
  }
}
```

It is very important to replace `pid` (process id), `piid` (process instance id), and `eid` (event id) with respective values.
In this case, `EMIT XES EVENT ()(pair)()` is an appropriate choice, since we chose the address of the pair contract as process instance identifier. `pid` and `eid` can be left blank and will therefore be auto-generated.

The code snippets related to the ABI entries of [UniswapV2Pair: AMPL](https://etherscan.io/address/0xc5be99a02c6857f9eac67bbce58df5572498f40c#code) can be copied and pasted in a similar manner.
Here, we do not need to make any use of the generic filter, since we directly extract the data from the AMPl contract.
Notice that we use the globally defined variable `address ampl = 0xc5be99a02c6857f9eac67bbce58df5572498f40c` to set the process instance id in the emit statements.

```
LOG ENTRIES (ampl) (
  Burn(address indexed sender,uint256 amount0,uint256 amount1,address indexed to)
){
  EMIT XES EVENT ()(ampl)()(
    "Tokens Burned" as xs:string concept:name,
    block.timestamp as xs:date time:timestamp,
    block.number as xs:int blockNumber,
    sender as xs:string sender,
    amount0 as xs:int amount0,
    amount1 as xs:int amount1,
    to as xs:string to
  );
}

LOG ENTRIES (ampl) (
  Mint(address indexed sender,uint256 amount0,uint256 amount1)
){
  EMIT XES EVENT ()(ampl)()(
    "Tokens Minted" as xs:string concept:name,
    block.timestamp as xs:date time:timestamp,
    block.number as xs:int blockNumber,
    sender as xs:string sender,
    amount0 as xs:int amount0,
    amount1 as xs:int amount1
  );
}

LOG ENTRIES (ampl) (
  Swap(address indexed sender,uint256 amount0In,uint256 amount1In,uint256 amount0Out,uint256 amount1Out,address indexed to)
){
  EMIT XES EVENT ()(ampl)()(
    "Tokens Swapped" as xs:string concept:name,
    block.timestamp as xs:date time:timestamp,
    block.number as xs:int blockNumber,
    sender as xs:string sender,
    amount0In as xs:int amount0In,
    amount1In as xs:int amount1In,
    amount0Out as xs:int amount0Out,
    amount1Out as xs:int amount1Out,
    to as xs:string to
  );
}

LOG ENTRIES (ampl) (
  Sync(uint112 reserve0,uint112 reserve1)
){
  EMIT XES EVENT ()(ampl)()(
    "Tokens Synced" as xs:string concept:name,
    block.timestamp as xs:date time:timestamp,
    block.number as xs:int blockNumber,
    reserve0 as xs:int reserve0,
    reserve1 as xs:int reserve1
  );
}
	
TRANSACTIONS () () {
  TRANSACTION INPUT (ampl) (
    skim(address to)
  ){
    EMIT XES EVENT ()(ampl)()(
      "Tokens Skimmed" as xs:string concept:name,
      block.timestamp as xs:date time:timestamp,
      block.number as xs:int blockNumber,
      to as xs:string to
    );
  }
}
```

#### Example 2: SportCrypt
SportCrypt is a betting platform that allows users to bet on sports events.
It was the first Ethereum-based sportsbetting exchange launched in 2017.
The next iteration of SportCrypt by the same developers is called [Degens](https://degens.com).
Each process instance corresponds to a sport match that users place their biddings on and is identified by its generated match id.

* Contract(s): [SportCrypt (0x37304b0AB297f13F5520c523102797121182fb5B)](https://etherscan.io/address/0x37304b0ab297f13f5520c523102797121182fb5b#code)
* Process Instance: Each process instance corresponds to a sports match users can bet on and is identified by its match id.
* Process Activities (solely based on Solidity events):
  * _Match Created_: The betting market for the match has opened
    * The contract does not have an explicit log entry that signals the creation of a match. This event is written to the log whenever one of the other log entries is read and the value of `matchId` was read the first time, thus, identifying a new process instance.
  * _Positions Set_: A user sets his positions on the match
    * Solidity Event: `LogTrade(address indexed takerAccount,address indexed makerAccount,uint256 indexed matchId,uint256 orderHash,uint8 orderDirection,uint8 price,uint256 longAmount,int256 newLongPosition,uint256 shortAmount,int256 newShortPosition)`
  * _Positions Set Error_: An error occurred after a user attempted to set his position
    * Solidity Event: `LogTradeError(address indexed takerAccount,address indexed makerAccount,uint256 indexed matchId,uint256 orderHash,uint16 status)`
  * _Position Cancelled_: A user cancels his position
    * Solidity Event: `LogOrderCancel(address indexed account,uint256 indexed matchId,uint256 orderHash)`
  * _Reward Claimed_: A user claims his reward
    * Solidity Event: `LogClaim(address indexed account,uint256 indexed matchId,uint256 amount)`
  * _Match Finalized_: The betting market for the match has closed
    * Solidity Event: `LogFinalizeMatch(uint256 indexed matchId,uint8 finalPrice)`

#### Step 1: Specify contracts by entering contract addresses and contracs ABIs
In the first step, we enter the contract address and ABI of the contract [SportCrypt (0x37304b0AB297f13F5520c523102797121182fb5B)](https://etherscan.io/address/0x37304b0ab297f13f5520c523102797121182fb5b#code).

#### Step 2: Select functions and events which are used for the extraction process
In the second step, we select the previously identfied ABI entries.
This means, we select `LogTrade, LogTradeError, LogOrderCancel, LogClaim, LogFinalizeMatch` from the table of ABI entries.

#### Step 3: Configure settings
In this step, we specify the settings for _Abort on Exception_, _Emission Mode_, _Connection Mode_ and _Connection_.
The latter two are used to specify the endpoint of the Ethereum Node we connect to.
More information on the other two settings can be found on the [wiki page under "Writing a manifest"](https://github.com/LucasDueh/Blockchain-Logging-Framework/wiki/Manifest).

#### Step 4: Write the content of the manifest
The first thing to do is to specify the block range of the block filter.
This is done by replacing `FROM` and `TO` with the previously identified start and end block number (```BLOCKS (FROM) (TO) { ... }```).
An exemplary block range that can be used for here is 9112153-9122153.

Above the block filter, global variables can be defined that are repeatedly needed throughout the manifest.
The need for global variables depends on the DApp under scrutiny.
Let us consider our case.
As stated above, the event `Match Created` is written to the event log whenever a particular match id is identified the first time.
Therefore, for each process instance, we need to keep a reference of the associated match id.
We create a global array of type integer that is initialized above the block filter.

```
int[] matches = newIntArray();
BLOCKS (9112153) (9122153) { ... }
```

For each selected ABI entry, the tool proposes multiple related BcQL code snippet.
Usually, there is one code snippet related to the required filter and another snippet containing an emit statement for writing the specified event to an XES file.
Further information on emit statements can be read on the [wiki page under "Emitting data"](https://github.com/LucasDueh/Blockchain-Logging-Framework/wiki/Manifest).

For instance, for the Solidity event `LogTrade`, we first copy and paste the following code snippet inside the scope of the block filter:

```
LOG ENTRIES (0x37304b0AB297f13F5520c523102797121182fb5B) (
  LogTrade(address indexed takerAccount,address indexed makerAccount,uint256 indexed matchId,uint256 orderHash,uint8 orderDirection,uint8 price,uint256 longAmount,int256 newLongPosition,uint256 shortAmount,int256 newShortPosition)
){
  // Enter your extraction code here
}
```

Then, inside the scope of the log entry filter, we first check whether the value of the parameter `int256 matchId` is contained in the previously defined array of match ids.
We first define a variable that holds the boolean value of the condition (i.e., whether the match id is contained in the gloabl array `matches`), and then, we evaluate the condition in an IF-statement/generic filter.
If the match is not contained yet, we append `matchId` to the array and write an emit statement that writes the event _Match Created_ to the log.
Note, that this emit statement had to be written by the user himself, since it was not related to a specific ABI entry.

Next, from the right-hand side of the UI, we copy and paste the related emit statement of _LogTrade_, resulting in the following code block:

```
LOG ENTRIES (0x37304b0AB297f13F5520c523102797121182fb5B) (
  LogTrade(address indexed takerAccount,address indexed makerAccount,uint256 indexed matchId,uint256 orderHash,uint8 orderDirection,uint8 price,uint256 longAmount,int256 newLongPosition,uint256 shortAmount,int256 newShortPosition)
){
  bool containsMatch = contains(matches, matchId);

  IF(!containsMatch) {
    add(matches, matchId);
    EMIT XES EVENT ()(matchId)()("Match Created" as xs:string concept:name);
  }

  EMIT XES EVENT ()(matchId)()(
    "Positions Set" as xs:string concept:name,
    block.timestamp as xs:date time:timestamp,
    block.number as xs:int blockNumber,
    takerAccount as xs:string takerAccount,
    makerAccount as xs:string makerAccount,
    matchId as xs:int matchId,
    orderHash as xs:int orderHash,
    orderDirection as xs:int orderDirection,
    price as xs:int price,
    longAmount as xs:int longAmount,
    newLongPosition as xs:int newLongPosition,
    shortAmount as xs:int shortAmount,
    newShortPosition as xs:int newShortPosition
  );
}
```

This is analously done with the other ABI entries, resulting in the following final manifest:

```
int[] matches = newIntArray();
BLOCKS (9112153) (9122153) {
  LOG ENTRIES (0x37304b0AB297f13F5520c523102797121182fb5B) (
    LogTrade(address indexed takerAccount,address indexed makerAccount,uint256 indexed matchId,uint256 orderHash,uint8 orderDirection,uint8 price,uint256 longAmount,int256 newLongPosition,uint256 shortAmount,int256 newShortPosition)
	){
    bool containsMatch = contains(matches, matchId);
		
    IF(!containsMatch) {
      add(matches, matchId);
      EMIT XES EVENT ()(matchId)()("Match Created" as xs:string concept:name);
    }
    
    EMIT XES EVENT ()(matchId)()(
      "Positions Set" as xs:string concept:name,
      block.timestamp as xs:date time:timestamp,
      block.number as xs:int blockNumber,
      takerAccount as xs:string takerAccount,
      makerAccount as xs:string makerAccount,
      matchId as xs:int matchId,
      orderHash as xs:int orderHash,
      orderDirection as xs:int orderDirection,
      price as xs:int price,
      longAmount as xs:int longAmount,
      newLongPosition as xs:int newLongPosition,
      shortAmount as xs:int shortAmount,
      newShortPosition as xs:int newShortPosition
    );
  }

  LOG ENTRIES (0x37304b0AB297f13F5520c523102797121182fb5B) (
    LogTradeError(address indexed takerAccount,address indexed makerAccount,uint256 indexed matchId,uint256 orderHash,uint16 status)
  ){
    bool containsMatch = contains(matches, matchId);

    IF(!containsMatch) {
      add(matches, matchId);
      EMIT XES EVENT ()(matchId)()("Match Created" as xs:string concept:name);
    }

    EMIT XES EVENT ()(matchId)()(
      "Positions Set Error" as xs:string concept:name,
      block.timestamp as xs:date time:timestamp,
      block.number as xs:int blockNumber,
      takerAccount as xs:string takerAccount,
      makerAccount as xs:string makerAccount,
      matchId as xs:int matchId,
      orderHash as xs:int orderHash,
      status as xs:int status
    );
  }

  LOG ENTRIES (0x37304b0AB297f13F5520c523102797121182fb5B) (
    LogOrderCancel(address indexed account,uint256 indexed matchId,uint256 orderHash)
  ){
    bool containsMatch = contains(matches, matchId);

    IF(!containsMatch) {
      add(matches, matchId);
      EMIT XES EVENT ()(matchId)()("Match Created" as xs:string concept:name);
    }

    EMIT XES EVENT ()(matchId)()(
      "Position Cancelled" as xs:string concept:name,
      block.timestamp as xs:date time:timestamp,
      block.number as xs:int blockNumber,
      account as xs:string account,
      matchId as xs:int matchId,
      orderHash as xs:int orderHash
    );
  }

  LOG ENTRIES (0x37304b0AB297f13F5520c523102797121182fb5B) (
    LogClaim(address indexed account,uint256 indexed matchId,uint256 amount)
  ){
    EMIT XES EVENT ()(matchId)()(
      "Reward Claimed" as xs:string concept:name,
      block.timestamp as xs:date time:timestamp,
      block.number as xs:int blockNumber,
      account as xs:string account,
      matchId as xs:int matchId,
      amount as xs:int amount
    );
  }

  LOG ENTRIES (0x37304b0AB297f13F5520c523102797121182fb5B) (
    LogFinalizeMatch(uint256 indexed matchId,uint8 finalPrice)
  ){
    EMIT XES EVENT ()(matchId)()(
      "Match Finalized" as xs:string concept:name,
      block.timestamp as xs:date time:timestamp,
      block.number as xs:int blockNumber,
      matchId as xs:int matchId,
      finalPrice as xs:int finalPrice
    );
  }
}
```

Before writing the XES file to disk, make sure to validate the written manifest by pressing the button labeled _Validate_, which checks the manifest for syntantical or semantical errors.
Only validated files can be used to initiate the extraction process.


### Extracting data from the Ethereum blockchain

1. Open a manifest file.
2. Press the button at the bottom to initiate the extraction process.
3. Once the process is done, the written output is saved to the user data folder (platform-dependent).

## Future Work
A list of TODOs for this tool as well as for the extended version of the BLF.

Note, that the BLF is able to function on its own.
The ELT tool, on the other hand, merely provides a user interface on top of the BLF.
In case the ELT is deemed useful, as a consequence, each extension to the BcQL grammar of the BLF would also require a related extension of the ELT tool (in order for the ELT to be able to propose related BcQL code snippets of the newly added grammar rules).
The components related to the propsal of BcQL code snippets are located at `src/renderer/components/manifest-creation/step-four/code-tabs/`.

### Ethereum Logging Tool

TODOs:
- Feature to edit a manifest file after creation
- Comprehensive guidance and instructions for writing the manifest file
  - i.e., provide helper texts and tooltips inside the tool such that new users do not require any additional resources (e.g., the user does not have to look up the [list of transformation capabilities](https://github.com/LucasDueh/Blockchain-Logging-Framework/blob/master/src/main/resources/TransformationCapabilities.bcql) in order to transform blockchain variables inside the manifest document)
- Add validation to user input
  - Right now, the user can enter arbitrary input inside the input fields of contract address, contract ABI, etc. 
  - This does not have any harmful implications. However, it might lead to confusion on behalf of the user.
- UI improvements
- Code refactoring
  - e.g., `src/renderer/views/ManifestCreation.tsx` is bloated since it holds all the state variables related to the manifest creation process

Further considerations:
- Related to code refactoring: Add dedicated state management library (e.g., Redux)
- Implement feature in order to make "Determine a suitable block range" part of the tool
- Add additional features to code editor

### Blockchain Logging Framework

- Add support to process Solidity functions and events that have static array parameters (e.g., `address[7] addresses`)
- Add support to capture internal transactions
- Add BcQL grammar rules that allow looping (i.e., FOR-LOOP instructions)
  - This would reduce the amount of duplicate BcQL code that is required
