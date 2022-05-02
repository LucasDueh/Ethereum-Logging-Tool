// This is a copy of abi-types.ts in src/main/ipc/abi
// TODO: import from single source
export enum AbiTypes {
  Empty = '',
  Event = 'event',
  Function = 'function',
}

export enum AccessorTypes {
  EventLog = 'event log',
  PublicMemberQuery = 'public member query',
  DecodableFunctionInput = 'decodable function input',
}
