import PropTypes from 'prop-types';
import { Paper, Stack, Box } from '@mui/material';

import ReactSplit, { SplitDirection } from '@devbookhq/splitter';
import './custom-splitter.css';

import StepInstructions from '../StepInstructions';
import CodeEditor from '../../code-editor/CodeEditor';
import CodeTabs from './code-tabs/CodeTabs';
import ValidationButton from '../../blf-invocation/ValidationButton';

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
      <Stack spacing={1} justifyContent="space-between" alignItems="stretch">
        <StepInstructions
          heading="Specify the content of the Manifest File"
          details="Copy and paste code blocks from the right side."
        />

        <Box
          sx={{
            width: '100%',
            borderRadius: 2,
            height: '65vh',
          }}
        >
          <ReactSplit
            direction={SplitDirection.Horizontal}
            initialSizes={[70, 30]}
            minWidths={[400, 16]}
            gutterClassName="custom-splitter"
          >
            <Paper
              variant="outlined"
              square
              sx={{
                borderRadius: '2px 0px 0px 2px',
                height: '65vh',
                position: 'relative',
              }}
            >
              <CodeEditor
                isManifestEditor
                value={[settingsCode, extractionCode].join('')}
                onChange={onEditorChange}
              />
            </Paper>

            <Paper
              variant="outlined"
              square
              sx={{
                borderRadius: '0px 2px 2px 0px',
                height: '65vh',
                overflowY: 'auto',
              }}
            >
              <CodeTabs contracts={contracts} />
            </Paper>
          </ReactSplit>
        </Box>

        <ValidationButton code={[settingsCode, extractionCode].join('')} />
      </Stack>
    </form>
  );
}

StepFour.propTypes = {
  formId: PropTypes.string.isRequired,
  settingsCode: PropTypes.string.isRequired,
  extractionCode: PropTypes.string.isRequired,
  setExtractionCode: PropTypes.func.isRequired,
  contracts: PropTypes.arrayOf(PropTypes.object).isRequired,
  handleSubmit: PropTypes.func.isRequired,
};

export default StepFour;
