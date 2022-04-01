import { ISolidityFunctionParam } from 'types/types';

const paramsToString = (parameters: Array<ISolidityFunctionParam>) => {
  let paramString = '';
  parameters.forEach((input: ISolidityFunctionParam, index: number) => {
    if (index !== 0) paramString += '\t';
    paramString += `${input.type} ${input.name}`;
    if (index < parameters.length - 1) paramString += ',\n';
  });
  return paramString;
};

export default paramsToString;
