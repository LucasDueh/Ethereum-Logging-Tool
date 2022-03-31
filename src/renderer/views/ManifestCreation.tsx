import React from 'react';
import { makeStyles } from '@mui/styles';
import {
  Button,
  Box,
  Stack,
  Stepper,
  Step,
  StepLabel,
  Divider,
} from '@mui/material';

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

const useStyles = makeStyles({
  stepLabel: {
    fontSize: '15px',
  },
});

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function ManifestCreation(props: any) {
  const classes = useStyles(props);

  const stepLabels = [
    'Enter Contract ABI',
    'Select Events',
    'Mandatory Settings',
    'Define Extraction',
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
  const [settingsCode, setSettingsCode] = React.useState<string>('');
  const [extractionCode, setExtractionCode] = React.useState<string>('\n\n');

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

  const updateSettingsCode = () => {
    const newSettingsCode = `SET BLOCKCHAIN "${
      settings.blockchain
    }";\nSET OUTPUT FOLDER "./${settings.outputFolder}";\nSET ${
      settings.connectionMode === ConnectionMode.IPCSocket ? 'IPC ' : ''
    }CONNECTION "${settings.connection}";\nSET ABORT ON EXCEPTION "${
      settings.abortOnException
    }";\nSET EMISSION MODE "${settings.emissionMode}";`;

    setSettingsCode(newSettingsCode);
  };

  React.useEffect(() => {
    updateSettingsCode();
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [settings]);

  const updateExtractionCode = (newExtractionCode: string) => {
    setExtractionCode(newExtractionCode);
  };

  const finishCreation = () => {
    // TODO
  };

  const handleNext = () => {
    setActiveStep((prevActiveStep) => prevActiveStep + 1);
  };

  const handleBack = () => {
    if (activeStep === 0) return;
    setActiveStep((prevActiveStep) => prevActiveStep - 1);
  };

  return (
    <Stack
      sx={{ py: 1 }}
      spacing={1}
      justifyContent="space-between"
      alignItems="space-between"
    >
      <Box sx={{ px: 3, py: 1 }}>
        <Stepper activeStep={activeStep}>
          {stepLabels.map((label) => {
            return (
              <Step key={label}>
                <StepLabel classes={{ label: classes.stepLabel }}>
                  {label}
                </StepLabel>
              </Step>
            );
          })}
        </Stepper>
      </Box>
      <Divider />

      <Box sx={{ px: 3, py: 1, overflowY: 'auto', height: '80vh' }}>
        {(() => {
          switch (activeStep) {
            case 0:
              return (
                <StepOne
                  formId={stepLabels[0]}
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
                  formId={stepLabels[1]}
                  contracts={contracts}
                  setActivities={updateActivities}
                  handleSubmit={handleNext}
                />
              );
            case 2:
              return (
                <StepThree
                  formId={stepLabels[2]}
                  settings={settings}
                  setSettings={updateSettings}
                  handleSubmit={handleNext}
                />
              );
            default:
              return (
                <StepFour
                  formId={stepLabels[3]}
                  settingsCode={settingsCode}
                  extractionCode={extractionCode}
                  setExtractionCode={updateExtractionCode}
                  contracts={contracts}
                  handleSubmit={finishCreation}
                />
              );
          }
        })()}
      </Box>

      <Divider />
      <Stack direction="row" justifyContent="center">
        <Button
          disabled={activeStep <= 0}
          type="button"
          variant="outlined"
          onClick={handleBack}
          sx={{ mr: 1 }}
        >
          Back
        </Button>

        <Button form={stepLabels[activeStep]} type="submit" variant="outlined">
          Next
        </Button>
      </Stack>
    </Stack>
  );
}

export default ManifestCreation;
