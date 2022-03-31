import PropTypes from 'prop-types';
import Box from '@mui/material/Box';
import { ISolidityFunctionParam } from 'types/types';
import CodeEditor from '../../../code-editor/CodeEditor';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function AbiDecodableFunctionBlock(props: any) {
  const { contractAddress, name, inputs, activityName } = props;

  const code = () => {
    let parameters = '';
    inputs.forEach((input: ISolidityFunctionParam, index: number) => {
      parameters += `${input.type} ${input.name}`;
      if (index < inputs.length - 1) parameters += ', ';
    });

    return `DECODE ETH TX INPUT (${contractAddress}) (${name}(${parameters})) {\n\t// Enter your extraction code here\n}`;
  };

  return (
    <Box>
      <CodeEditor value={code()} readOnly maxLines={4} />
    </Box>
  );
}

AbiDecodableFunctionBlock.propTypes = {
  contractAddress: PropTypes.string.isRequired,
  name: PropTypes.string.isRequired,
  inputs: PropTypes.arrayOf(PropTypes.object).isRequired,
  activityName: PropTypes.string.isRequired,
};

export default AbiDecodableFunctionBlock;
