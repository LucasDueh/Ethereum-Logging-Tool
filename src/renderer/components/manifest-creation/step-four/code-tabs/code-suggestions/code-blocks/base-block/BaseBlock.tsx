import PropTypes from 'prop-types';
import { Box } from '@mui/material';
import CodeEditor from '../../../../../../general/code-editor/CodeEditor';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function BaseBlock(props: any) {
  const { code } = props;

  return (
    <Box
      sx={{
        px: 0.8,
        pb: 0.4,
      }}
    >
      <Box
        sx={{
          position: 'relative',
          border: '1px solid',
          borderColor: 'rgba(0, 0, 0, .20)',
        }}
      >
        <CodeEditor
          value={code}
          readOnly
          maxLines={20}
          highlightActiveLine={false}
        />
      </Box>
    </Box>
  );
}

BaseBlock.propTypes = {
  code: PropTypes.string.isRequired,
};

export default BaseBlock;
