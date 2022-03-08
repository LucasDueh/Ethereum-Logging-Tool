/**
 * General
 */
export interface SolidityFunctionParam {
  type: string;
  name: string;
}

export interface ABIEntry {
  type: string;
  name: string;
  inputs: Array<SolidityFunctionParam>;
  outputs: Array<SolidityFunctionParam>;
}

/**
 * Table-Related
 */
export interface TableHeadCell {
  id: string;
  numeric: boolean;
  label: string;
}
