import React from 'react';
import { Box, Grid, Stepper, Step, StepLabel } from '@mui/material';

import {
  IAbiEntry,
  IActivity,
  IContract,
  IExtractionSettings,
} from 'types/types';

import asyncForEach from 'renderer/util/util';

import {
  Blockchain,
  EmissionMode,
  ConnectionMode,
} from '../constants/settings';

import StepOne from '../components/manifest-creation/step-one/StepOne';
import StepTwo from '../components/manifest-creation/step-two/StepTwo';
import StepThree from '../components/manifest-creation/step-three/StepThree';
import StepFour from '../components/manifest-creation/step-four/StepFour';

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
  const [settings, setSettings] = React.useState<IExtractionSettings>({
    blockchain: Blockchain.Ethereum,
    outputFolder: 'test_output',
    abortOnException: false,
    emissionMode: EmissionMode.DefaultBatching,
    connectionMode: ConnectionMode.WebSocket,
    connection:
      'wss://eth-mainnet.alchemyapi.io/v2/43UD7sDV0NX1hgJIZZms5btltccfFqqN',
  });

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

  const updateSettings = (
    event:
      | React.ChangeEvent<HTMLSelectElement>
      | React.ChangeEvent<HTMLInputElement>,
    booleanValue = false
  ) => {
    let newValue: string | boolean = event.target.value;

    if (booleanValue) newValue = event.target.value === 'true';

    setSettings({
      ...settings,
      [event.target.name]: newValue,
    });
  };

  const finishCreation = () => {
    // TODO
  };

  const handleNext = () => {
    setActiveStep((prevActiveStep) => prevActiveStep + 1);
  };

  const handleBack = () => {
    setActiveStep((prevActiveStep) => prevActiveStep - 1);
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
          {(() => {
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
                return (
                  <StepThree
                    settings={settings}
                    setSettings={updateSettings}
                    handleBack={handleBack}
                    handleSubmit={handleNext}
                  />
                );
              default:
                return (
                  <StepFour
                    settings={settings}
                    contracts={contracts}
                    handleBack={handleBack}
                    handleSubmit={finishCreation}
                  />
                );
            }
          })()}
        </Grid>
      </Grid>
    </Box>
  );
}

export default ManifestCreation;
