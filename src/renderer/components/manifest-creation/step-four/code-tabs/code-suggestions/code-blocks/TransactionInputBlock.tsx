import PropTypes from 'prop-types';
import { Box } from '@mui/material';
import CodeEditor from '../../../../../general/code-editor/CodeEditor';
import { paramsToString } from './util';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function TransactionInputBlock(props: any) {
  const { contractAddress, name, inputs, activityName } = props;

  const code = () => {
    const inputParameters = paramsToString(inputs);

    return `TRANSACTION INPUT (${contractAddress}) (\n\t${name}(\n\t\t${inputParameters}\n\t)\n){\n\t// Enter your extraction code here\n}`;
  };

  return (
    <Box sx={{ position: 'relative' }}>
      <CodeEditor
        value={code()}
        readOnly
        maxLines={15}
        highlightActiveLine={false}
      />
    </Box>
  );
}

TransactionInputBlock.propTypes = {
  contractAddress: PropTypes.string.isRequired,
  name: PropTypes.string.isRequired,
  // eslint-disable-next-line react/forbid-prop-types
  inputs: PropTypes.arrayOf(PropTypes.object).isRequired,
  activityName: PropTypes.string.isRequired,
};

export default TransactionInputBlock;
