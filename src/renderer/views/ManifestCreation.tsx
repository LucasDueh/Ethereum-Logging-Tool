import React from 'react';
import { Box, Grid, Stepper, Step, StepLabel } from '@mui/material';

import { ABIEntry } from 'types/types';
import StepOne from '../components/manifest-creation/StepOne';
import StepTwo from '../components/manifest-creation/StepTwo';

function TutorialCreation() {
  const stepLabels = [
    'Enter Contract ABI',
    'Select Events',
    'Mandatory Settings',
    'Extraction Commands',
  ];

  const [ABIEntries, setABIEntries] = React.useState<Array<ABIEntry>>([]);
  const [activeStep, setActiveStep] = React.useState(0);

  const changeABIEntries = (convertedABI: Array<ABIEntry>) => {
    setABIEntries(convertedABI);
  };

  const handleNext = () => {
    setActiveStep((prevActiveStep) => prevActiveStep + 1);
  };

  const handleBack = () => {
    setActiveStep((prevActiveStep) => prevActiveStep - 1);
  };

  const SwitchStep = () => {
    switch (activeStep) {
      case 0:
        return (
          <StepOne setABIEntries={changeABIEntries} handleSubmit={handleNext} />
        );
      case 1:
        return (
          <StepTwo
            rows={ABIEntries}
            handleBack={handleBack}
            handleSubmit={handleNext}
          />
        );
      case 2:
        return <Box />;
      default:
        return <Box />;
    }
  };

  return (
    <Box sx={{ p: 1 }}>
      <Grid container spacing={4} justifyContent="center" alignItems="center">
        <Grid item xs={12}>
          <Stepper activeStep={activeStep} alternativeLabel>
            {stepLabels.map((label) => {
              return (
                <Step key={label}>
                  <StepLabel>{label}</StepLabel>
                </Step>
              );
            })}
          </Stepper>
        </Grid>

        <Grid item xs={12}>
          <SwitchStep />
        </Grid>
      </Grid>
    </Box>
  );
}

export default TutorialCreation;
