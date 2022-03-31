import AbiType from 'constants/abi-type';
import { IAbiEntry } from 'types/types';

const reduce = (entry: IAbiEntry) => {
  if (entry.type !== 'function' && entry.type !== 'event') return null;

  const out: IAbiEntry = {
    type: AbiType.Empty,
    name: '',
    inputs: [],
    outputs: [],
  };

  out.type = entry.type;
  out.type = entry.type;
  out.name = entry.name;

  entry.inputs.forEach((element) => {
    out.inputs.push({ type: element.type, name: element.name });
  });

  if (entry.outputs && entry.outputs.length > 0) {
    entry.outputs.forEach((element) => {
      out.outputs.push({ type: element.type, name: element.name });
    });
  }
  return out;
};

function reduceAbiToJson(abi: string) {
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
}

export default reduceAbiToJson;
