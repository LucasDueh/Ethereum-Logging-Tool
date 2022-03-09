import { ABIEntry, SolidityFunctionParam } from 'types/types';

const { ethers } = require('ethers');

const hashFunction = (entry: ABIEntry) => {
  const functionSignature: string = entry.name;

  const functionParamTypes: Array<string> = [];
  entry.inputs.forEach((param: SolidityFunctionParam) => {
    functionParamTypes.push(param.type);
  });

  const hash = ethers.utils.keccak256(
    ethers.utils.toUtf8Bytes(
      `${functionSignature}(${functionParamTypes.join()})`
    )
  );

  return hash;
};

export default hashFunction;
