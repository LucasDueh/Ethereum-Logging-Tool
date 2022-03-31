import PropTypes from 'prop-types';
import Box from '@mui/material/Box';
import CodeEditor from '../../../code-editor/CodeEditor';
import paramsToString from './util';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function AbiEventBlock(props: any) {
  const { contractAddress, name, inputs, activityName } = props;

  const code = () => {
    const parameters = paramsToString(inputs);

    return `LOG ENTRIES (${contractAddress}) (\n\t${name}(${parameters})) {\n\t// Enter your extraction code here\n}`;
  };

  return (
    <Box>
      <CodeEditor value={code()} readOnly maxLines={10} />
    </Box>
  );
}

AbiEventBlock.propTypes = {
  contractAddress: PropTypes.string.isRequired,
  name: PropTypes.string.isRequired,
  inputs: PropTypes.arrayOf(PropTypes.object).isRequired,
  activityName: PropTypes.string.isRequired,
};

export default AbiEventBlock;
