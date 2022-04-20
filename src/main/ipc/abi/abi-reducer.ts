import { IAbiEntry } from 'types/types';
import { AbiTypes } from './abi-types';

// eslint-disable-next-line @typescript-eslint/naming-convention
const _ = require('lodash');

const reduce = (entry: IAbiEntry) => {
  if (entry.type !== AbiTypes.Function && entry.type !== AbiTypes.Event)
    return null;

  const out: IAbiEntry = {
    type: '',
    name: '',
    inputs: [],
    outputs: [],
    stateMutability: '',
  };

  out.type = entry.type;
  out.name = entry.name;
  out.stateMutability = _.has(entry, 'stateMutability')
    ? entry.stateMutability
    : '';

  entry.inputs.forEach((element) => {
    out.inputs.push({ type: element.type, name: element.name });
  });

  if (_.has(entry, 'outputs') && entry.outputs.length > 0) {
    entry.outputs.forEach((element) => {
      out.outputs.push({ type: element.type, name: element.name });
    });
  }
  return out;
};

function reduceAbiToJson(abi: string) {
  try {
    const jsonAbi = JSON.parse(abi);
    const out = [];
    for (let i = 0; i < jsonAbi.length; i += 1) {
      const entry = jsonAbi[i];
      const abiEntry = reduce(entry);
      if (abiEntry) {
        out.push(abiEntry);
      }
    }
    return JSON.stringify(out);
  } catch (e) {
    return null;
  }
}

export default reduceAbiToJson;
