import * as React from 'react';
import PropTypes from 'prop-types';
import { Stack, Button } from '@mui/material';
import { IContract } from 'types/types';
import AddIcon from '@mui/icons-material/Add';
import ContractInputAccordion from './ContractInputAccordion';
import StepInstructions from '../step-instructions/StepInstructions';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function StepOne(props: any) {
  const {
    formId,
    contracts,
    addContract,
    deleteContract,
    setContractName,
    setContractAddress,
    setRawAbi,
    setAbiEntries,
    handleSubmit,
  } = props;

  const handleChange = async (
    event: React.ChangeEvent<HTMLTextAreaElement>,
    id: number
  ) => {
    if (event.target.name === 'address') {
      setContractAddress(event.target.value, id);
    } else if (event.target.name === 'name') {
      setContractName(event.target.value, id);
    } else if (event.target.name === 'rawAbi') {
      const newAbiEntries = event.target.value;
      setRawAbi(newAbiEntries, id);

      const abiJson = await window.electron.ipcRenderer.reduceAbi(
        newAbiEntries
      );
      if (abiJson != null) setAbiEntries(JSON.parse(abiJson), id);
    }
  };

  return (
    <form id={formId} onSubmit={handleSubmit}>
      <Stack
        sx={{ p: 2 }}
        spacing={2}
        justifyContent="flex-start"
        alignItems="stretch"
      >
        <Stack direction="row" justifyContent="space-between" spacing={2}>
          <StepInstructions
            heading="Enter Contract Address and ABI of Ethereum Smart Contracts"
            details="The ABI and contract address can be copied from websites like
          etherscan.io."
          />

          <Button
            startIcon={<AddIcon />}
            variant="contained"
            onClick={addContract}
          >
            Add Contract
          </Button>
        </Stack>

        {contracts.map((contract: IContract, index: number) => (
          <ContractInputAccordion
            id={index}
            key={['contract', index.toString()].join('')}
            contractName={contract.name}
            contractAddress={contract.address}
            contractAbi={contract.rawAbi}
            deleteContract={deleteContract}
            handleChange={handleChange}
          />
        ))}
      </Stack>
    </form>
  );
}

StepOne.propTypes = {
  formId: PropTypes.string.isRequired,
  // eslint-disable-next-line react/forbid-prop-types
  contracts: PropTypes.arrayOf(PropTypes.object).isRequired,
  addContract: PropTypes.func.isRequired,
  deleteContract: PropTypes.func.isRequired,
  setContractName: PropTypes.func.isRequired,
  setContractAddress: PropTypes.func.isRequired,
  setRawAbi: PropTypes.func.isRequired,
  setAbiEntries: PropTypes.func.isRequired,
  handleSubmit: PropTypes.func.isRequired,
};

export default StepOne;
