import React from 'react';
import { Box, Grid, Stepper, Step, StepLabel } from '@mui/material';

import { IAbiEntry, IActivity, IContract } from 'types/types';
import asyncForEach from 'renderer/util/util';
import StepOne from '../components/manifest-creation/step-one/StepOne';
import StepTwo from '../components/manifest-creation/step-two/StepTwo';
import StepThree from '../components/manifest-creation/step-three/StepThree';

function ManifestCreation() {
  const stepLabels = [
    'Enter Contract ABI',
    'Select Events',
    'Mandatory Settings',
    'Extraction Commands',
  ];

  const [activeStep, setActiveStep] = React.useState(0);
  const [contracts, setContracts] = React.useState<Array<IContract>>([
    {
      address: '',
      rawAbi: '',
      abiEntries: [],
      activities: [],
    },
  ]);

  const addContract = () => {
    const contract: IContract = {
      address: '',
      rawAbi: '',
      abiEntries: [],
      activities: [],
    } as IContract;
    const updatedContracts = [...contracts];
    updatedContracts.push(contract);
    setContracts(updatedContracts);
  };

  const deleteContract = (id: number) => {
    const updatedContracts = [...contracts];
    updatedContracts.splice(id, 1);
    setContracts(updatedContracts);
  };

  const updateContractAddress = (newAddress: string, id: number) => {
    const updatedContracts = [...contracts];
    updatedContracts[id].address = newAddress;
    setContracts(updatedContracts);
  };

  const updateRawAbi = (newAbi: string, id: number) => {
    const updatedContracts = [...contracts];
    updatedContracts[id].rawAbi = newAbi;
    setContracts(updatedContracts);
  };

  const updateAbiEntries = (newEntries: Array<IAbiEntry>, id: number) => {
    const updatedContracts = [...contracts];
    updatedContracts[id].abiEntries = newEntries;
    setContracts(updatedContracts);
  };

  const updateActivities = async (selection: Array<Array<IAbiEntry>>) => {
    await asyncForEach(
      selection,
      async (selected: Array<IAbiEntry>, index: number) => {
        const selectedActivities: Array<IActivity> =
          await window.electron.ipcRenderer.transformAbiToActivities(selected);

        const updatedContracts = [...contracts];
        updatedContracts[index].activities = selectedActivities;
        setContracts(updatedContracts);
      }
    );
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
          <StepOne
            contracts={contracts}
            addContract={addContract}
            deleteContract={deleteContract}
            setContractAddress={updateContractAddress}
            setRawAbi={updateRawAbi}
            setAbiEntries={updateAbiEntries}
            handleSubmit={handleNext}
          />
        );
      case 1:
        return (
          <StepTwo
            contracts={contracts}
            setActivities={updateActivities}
            handleBack={handleBack}
            handleSubmit={handleNext}
          />
        );
      case 2:
        return <StepThree contracts={contracts} />;
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

export default ManifestCreation;
