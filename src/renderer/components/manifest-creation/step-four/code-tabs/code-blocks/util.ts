import { ISolidityFunctionParam } from 'types/types';

const inputName = (name: string, index: number) => {
  if (name === null || name === '') {
    return `outputVariable${index}`;
  }
  return name;
};

const paramsToString = (
  parameters: Array<ISolidityFunctionParam>,
  indent = ''
) => {
  let paramString = '';
  parameters.forEach((input: ISolidityFunctionParam, index: number) => {
    if (index !== 0) paramString += `\t${indent}`;
    paramString += `${input.type} ${inputName(input.name, index)}`;
    if (index < parameters.length - 1) paramString += ',\n';
  });
  return paramString;
};

export default paramsToString;
