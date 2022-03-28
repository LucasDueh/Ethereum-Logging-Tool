/**
 * General
 */
export interface ISolidityFunctionParam {
  type: string;
  name: string;
}

export interface IAbiEntry {
  type: string;
  name: string;
  inputs: Array<ISolidityFunctionParam>;
  outputs: Array<ISolidityFunctionParam>;
}

export interface IActivity extends IAbiEntry {
  hash: string;
  activityName: string;
}

export interface IContract {
  address: string;
  rawAbi: string;
  abiEntries: Array<IAbiEntry>;
  activities: Array<IActivity>;
}

export interface IExtractionSettings {
  blockchain: string;
  outputFolder: string;
  abortOnException: boolean;
  errorOutputFolder?: string;
  emissionMode: string;
  connectionMode: string;
  connection: string;
}

/**
 * Table-Related
 */
export interface ITableHeadCell {
  id: string;
  numeric: boolean;
  label: string;
}
