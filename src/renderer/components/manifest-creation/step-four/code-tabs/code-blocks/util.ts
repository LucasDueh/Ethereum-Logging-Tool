import { ISolidityEventParam, ISolidityFunctionParam } from 'types/types';

const inputName = (name: string, index: number) => {
  if (name === null || name === '') {
    return `output${index}`;
  }
  return name;
};

const paramsToString = (
  parameters: Array<ISolidityFunctionParam>,
  indent = ''
) => {
  let paramString = '';
  parameters.forEach(
    (input: ISolidityFunctionParam | ISolidityEventParam, index: number) => {
      let indexed = '';
      if ('indexed' in input) {
        indexed = 'indexed ';
      }

      if (index !== 0) paramString += `\t${indent}`;
      paramString += `${input.type} ${indexed}${inputName(input.name, index)}`;
      if (index < parameters.length - 1) paramString += ',\n';
    }
  );
  return paramString;
};

export default paramsToString;
