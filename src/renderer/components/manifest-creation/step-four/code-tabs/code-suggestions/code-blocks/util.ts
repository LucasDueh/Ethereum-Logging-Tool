import { ISolidityEventParam, ISolidityFunctionParam } from 'types/types';

const inputName = (name: string, index: number) => {
  if (name === null || name === '') {
    return `output${index}`;
  }
  return name;
};

export const paramsToString = (
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

const solToXesType = (type: string) => {
  if (type.includes('int')) return 'int';

  switch (type) {
    case 'bool':
      return 'boolean';
    case 'string':
    case 'address':
    case 'byte':
    case 'bytes':
      return 'string';
    default:
      return 'string';
  }
  return '';
};

export const xesEventAttributes = (
  activityName: string,
  parameters: Array<ISolidityFunctionParam>,
  indent = ''
) => {
  let attributes = `"${activityName}" as xs:string concept:name,\n\t`;
  attributes += 'block.timestamp as xs:date time:timestamp,\n\t';
  attributes += 'block.number as xs:int blockNumber,\n\t';
  parameters.forEach(
    (input: ISolidityFunctionParam | ISolidityEventParam, index: number) => {
      if (index !== 0) attributes += `\t${indent}`;
      attributes += `${inputName(input.name, index)} as xs:${solToXesType(
        input.type
      )} ${inputName(input.name, index)}`;
      if (index < parameters.length - 1) attributes += ',\n';
    }
  );
  return attributes;
};
