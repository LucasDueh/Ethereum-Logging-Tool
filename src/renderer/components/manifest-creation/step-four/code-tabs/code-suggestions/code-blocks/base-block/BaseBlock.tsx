import PropTypes from 'prop-types';
import { Box } from '@mui/material';
import CodeEditor from '../../../../../../general/code-editor/CodeEditor';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function BaseBlock(props: any) {
  const { code } = props;

  return (
    <Box
      sx={{
        px: 0.6,
        pb: 0.4,
        height: '100%',
      }}
    >
      <Box
        sx={{
          position: 'relative',
          border: '1px solid',
          borderColor: 'rgba(0, 0, 0, .25)',
          borderRadius: '2px',
          height: '10vh',
          width: '100%',
        }}
      >
        <CodeEditor value={code} readOnly highlightActiveLine={false} />
      </Box>
    </Box>
  );
}

BaseBlock.propTypes = {
  code: PropTypes.string.isRequired,
};

export default BaseBlock;
