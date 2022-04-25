import PropTypes from 'prop-types';
import { Box, Paper } from '@mui/material';

import ReactSplit, { SplitDirection } from '@devbookhq/splitter';
import '../general/splitter/custom-splitter.css';
import CodeEditor from '../general/code-editor/CodeEditor';
import ExtractionButton from '../blf-invocation/ExtractionButton';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function ExtractionInvocation(props: any) {
  const { manifestCode, filePath } = props;

  return (
    <Box
      sx={{
        width: '100%',
        borderRadius: 2,
        height: '92vh',
      }}
    >
      <ReactSplit
        direction={SplitDirection.Vertical}
        initialSizes={[50, 50]}
        minHeights={[50, 50]}
        gutterClassName="custom-splitter-vertical"
      >
        <Paper
          variant="outlined"
          square
          sx={{
            borderRadius: '2px 0px 0px 2px',
            height: '100%',
            position: 'relative',
            overflowY: 'auto',
          }}
        >
          <CodeEditor
            value={manifestCode}
            minLines={80}
            highlightActiveLine={false}
          />
        </Paper>

        <ExtractionButton filePath={filePath} />
      </ReactSplit>
    </Box>
  );
}

ExtractionInvocation.propTypes = {
  manifestCode: PropTypes.string.isRequired,
  filePath: PropTypes.string.isRequired,
};

export default ExtractionInvocation;
