import PropTypes from 'prop-types';
import { Paper, Box } from '@mui/material';

import ReactSplit, { SplitDirection } from '@devbookhq/splitter';
import '../../general/splitter/custom-splitter.css';

import CodeEditor from '../../general/code-editor/CodeEditor';
import CodeTabs from './code-tabs/CodeTabs';
import ValidationInvocation from '../../blf-invocation/ValidationInvocation';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function StepFour(props: any) {
  const {
    formId,
    settingsCode,
    extractionCode,
    setExtractionCode,
    contracts,
    handleSubmit,
  } = props;

  const onEditorChange = (newEditorValue: string) => {
    const newExtractionCode = newEditorValue.replace(settingsCode, '');
    setExtractionCode(newExtractionCode);
  };

  return (
    <form id={formId} onSubmit={handleSubmit}>
      {/* <StepInstructions
          heading="Specify the content of the Manifest File"
          details="Copy and paste code blocks from the right side."
        /> */}
      <Box
        sx={{
          width: '100%',
          borderRadius: 2,
          height: '82vh',
        }}
      >
        <ReactSplit
          direction={SplitDirection.Vertical}
          initialSizes={[85, 15]}
          minHeights={[500, 50]}
          gutterClassName="custom-splitter-vertical"
        >
          <ReactSplit
            direction={SplitDirection.Horizontal}
            initialSizes={[70, 30]}
            minWidths={[500, 16]}
            gutterClassName="custom-splitter-horizontal"
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
                isManifestEditor
                value={[settingsCode, extractionCode].join('')}
                onChange={onEditorChange}
                minLines={10}
              />
            </Paper>

            <Paper
              variant="outlined"
              square
              sx={{
                borderRadius: '0px 2px 2px 0px',
                height: '100%',
                overflowY: 'auto',
              }}
            >
              <CodeTabs contracts={contracts} />
            </Paper>
          </ReactSplit>
          <ValidationInvocation code={[settingsCode, extractionCode].join('')} />
        </ReactSplit>
      </Box>
    </form>
  );
}

StepFour.propTypes = {
  formId: PropTypes.string.isRequired,
  settingsCode: PropTypes.string.isRequired,
  extractionCode: PropTypes.string.isRequired,
  setExtractionCode: PropTypes.func.isRequired,
  // eslint-disable-next-line react/forbid-prop-types
  contracts: PropTypes.arrayOf(PropTypes.object).isRequired,
  handleSubmit: PropTypes.func.isRequired,
};

export default StepFour;
