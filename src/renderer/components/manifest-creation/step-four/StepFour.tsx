import * as React from 'react';
import PropTypes from 'prop-types';
import { Stack, Box, Grid } from '@mui/material';
import { IContract } from 'types/types';

import AceEditor from 'react-ace';
import BcqlMode from './BcqlMode';
import 'ace-builds/src-noconflict/theme-eclipse';
import 'ace-builds/src-min-noconflict/ext-language_tools';

import StepInstructions from '../StepInstructions';

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
  const aceEditor = React.useRef<AceEditor>(null);

  React.useEffect(() => {
    if (aceEditor.current != null) {
      const customMode = new BcqlMode();
      aceEditor.current.editor.getSession().setMode(customMode);
    }
  });

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
          <Grid item xs={9}>
            <Box style={{ height: '67vh' }}>
              <AceEditor
                ref={aceEditor}
                value={[settingsCode, extractionCode].join('')}
                mode="text"
                theme="eclipse"
                onChange={onEditorChange}
                name="ace"
                height="100%"
                editorProps={{ $blockScrolling: true }}
                style={{
                  width: '100%',
                  borderRadius: '4px',
                }}
                enableBasicAutocompletion
                enableLiveAutocompletion
              />
            </Box>
          </Grid>

          <Grid item xs={3}>
            {contracts.map((contract: IContract, index: number) => (
              <Box key={contract.address} />
            ))}
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
