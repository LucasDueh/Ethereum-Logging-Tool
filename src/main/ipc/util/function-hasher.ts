import { IAbiEntry, ISolidityFunctionParam } from 'types/types';

const { ethers } = require('ethers');

const hashFunction = (entry: IAbiEntry) => {
  const functionSignature: string = entry.name;

  const functionParamTypes: Array<string> = [];
  entry.inputs.forEach((param: ISolidityFunctionParam) => {
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
