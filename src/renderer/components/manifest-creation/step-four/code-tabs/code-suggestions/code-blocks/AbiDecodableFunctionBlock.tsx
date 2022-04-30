import PropTypes from 'prop-types';
import { Box } from '@mui/material';
import CodeEditor from '../../../../../general/code-editor/CodeEditor';
import { paramsToString } from './util';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function AbiDecodableFunctionBlock(props: any) {
  const { contractAddress, name, hash, inputs, activityName } = props;

  const code = () => {
    const inputParameters = paramsToString(inputs, '\t');
    const functionIdentifier = hash.substring(0, 10);

    return `TRANSACTIONS () (${contractAddress}) {\n\tTRANSACTION INPUT (${functionIdentifier}) (\n\t\t${inputParameters}\n\t){\n\t\t// Enter your extraction code here\n\t}\n}`;
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

AbiDecodableFunctionBlock.defaultProps = {
  hash: null,
};

AbiDecodableFunctionBlock.propTypes = {
  contractAddress: PropTypes.string.isRequired,
  name: PropTypes.string.isRequired,
  hash: PropTypes.string,
  // eslint-disable-next-line react/forbid-prop-types
  inputs: PropTypes.arrayOf(PropTypes.object).isRequired,
  activityName: PropTypes.string.isRequired,
};

export default AbiDecodableFunctionBlock;
