import PropTypes from 'prop-types';
import { Paper, Stack, Grid } from '@mui/material';

import StepInstructions from '../StepInstructions';
import CodeEditor from '../../code-editor/CodeEditor';
import CodeTabs from './code-tabs/CodeTabs';

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
      <Stack spacing={2} justifyContent="space-between" alignItems="stretch">
        <StepInstructions
          heading="Specify the content of the Manifest File"
          details="Copy and paste code blocks from the right side."
        />

        <Grid container>
          <Grid item xs={7}>
            <Paper
              variant="outlined"
              square
              sx={{ height: '69vh', position: 'relative' }}
            >
              <CodeEditor
                isManifestEditor
                value={[settingsCode, extractionCode].join('')}
                onChange={onEditorChange}
              />
            </Paper>
          </Grid>

          <Grid item xs={5}>
            <Paper variant="outlined" square style={{ height: '69vh' }}>
              <CodeTabs contracts={contracts} />
            </Paper>
          </Grid>
        </Grid>
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
