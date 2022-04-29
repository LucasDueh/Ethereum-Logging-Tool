import PropTypes from 'prop-types';
import { Box, Paper } from '@mui/material';

import ReactSplit, { SplitDirection } from '@devbookhq/splitter';
import '../general/splitter/custom-splitter.css';
import CodeEditor from '../general/code-editor/CodeEditor';
import ExtractionInvocation from '../blf-invocation/ExtractionInvocation';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function ExtractionWithEditor(props: any) {
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
        minHeights={[50, 140]}
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
            readOnly
          />
        </Paper>

        <ExtractionInvocation filePath={filePath} />
      </ReactSplit>
    </Box>
  );
}

ExtractionWithEditor.propTypes = {
  manifestCode: PropTypes.string.isRequired,
  filePath: PropTypes.string.isRequired,
};

export default ExtractionWithEditor;
