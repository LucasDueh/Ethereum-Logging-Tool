import { ABIEntry } from 'types/types';

const reduce = (entry: ABIEntry) => {
  if (entry.type !== 'function' && entry.type !== 'event') return null;

  const out: ABIEntry = { type: '', name: '', inputs: [], outputs: [] };

  out.type = entry.type;
  out.type = entry.type;
  out.name = entry.name;

  entry.inputs.forEach((element) => {
    out.inputs.push({ type: element.type, name: element.name });
  });

  if (entry.outputs && entry.outputs.length > 0) {
    // Throw out ABI variables that have { type: function }
    if (!entry.outputs[0].name) return null;

    entry.outputs.forEach((element) => {
      out.outputs.push({ type: element.type, name: element.name });
    });
  }
  return out;
};

function reduceABI(abi: string) {
  const jsonABI = JSON.parse(abi);
  const out = [];
  for (let i = 0; i < jsonABI.length; i += 1) {
    const entry = jsonABI[i];
    const abiEntry = reduce(entry);
    if (abiEntry) {
      out.push(abiEntry);
    }
  }
  return JSON.stringify(out);
}

export default reduceABI;
