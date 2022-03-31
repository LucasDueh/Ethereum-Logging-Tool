import * as React from 'react';
import PropTypes from 'prop-types';
import { Paper, Tabs, Tab, Stack, Grid } from '@mui/material';
import { IContract } from 'types/types';

import StepInstructions from '../StepInstructions';
import CodeEditor from '../../code-editor/CodeEditor';
import TabPanel from './TabPanel';
import CodeSuggestions from './CodeSuggestions';

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

  const [selectedTab, setSelectedTab] = React.useState(0);

  const handleTabChange = (_event: React.SyntheticEvent, newTab: number) => {
    setSelectedTab(newTab);
  };

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
          <Grid item xs={8}>
            <Paper variant="outlined" square style={{ height: '69vh' }}>
              <CodeEditor
                value={[settingsCode, extractionCode].join('')}
                onChange={onEditorChange}
                readOnly={false}
              />
            </Paper>
          </Grid>

          <Grid item xs={4}>
            <Paper variant="outlined" square style={{ height: '69vh' }}>
              <Tabs
                value={selectedTab}
                onChange={handleTabChange}
                variant="scrollable"
                scrollButtons="auto"
                centered
              >
                {contracts.map((contract: IContract, index: number) => {
                  return <Tab label={`Contract ${index + 1}`} />;
                })}
              </Tabs>
              {contracts.map((contract: IContract, index: number) => {
                return (
                  <TabPanel value={selectedTab} index={index}>
                    <CodeSuggestions
                      id={index}
                      contractAddress={contract.address}
                      contractActivities={contract.activities}
                    />
                  </TabPanel>
                );
              })}
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
