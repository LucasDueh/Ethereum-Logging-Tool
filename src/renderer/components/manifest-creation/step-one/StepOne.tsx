import * as React from 'react';
import PropTypes from 'prop-types';
import { Stack, Button } from '@mui/material';
import { IContract } from 'types/types';
import AddIcon from '@mui/icons-material/Add';
import ContractInputAccordion from './ContractInputAccordion';
import StepInstructions from '../StepInstructions';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function StepOne(props: any) {
  const {
    formId,
    contracts,
    addContract,
    deleteContract,
    setContractAddress,
    setRawAbi,
    setAbiEntries,
    handleSubmit,
  } = props;

  const handleChangeAddress = (
    event: React.ChangeEvent<HTMLTextAreaElement>,
    id: number
  ) => {
    setContractAddress(event.target.value, id);
  };

  const handleChangeAbi = async (
    event: React.ChangeEvent<HTMLTextAreaElement>,
    id: number
  ) => {
    const newAbiEntries = event.target.value;
    setRawAbi(newAbiEntries, id);

    const abiJson = await window.electron.ipcRenderer.reduceAbi(newAbiEntries);
    setAbiEntries(JSON.parse(abiJson), id);
  };

  return (
    <form id={formId} onSubmit={handleSubmit}>
      <Stack spacing={2} justifyContent="center" alignItems="space-between">
        <Stack direction="row" justifyContent="space-between" spacing={2}>
          <StepInstructions
            heading="Enter Contract Address and ABI of Solidity Smart Contract"
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
            key={[contract.address, index.toString()].join('')}
            contractAddress={contract.address}
            contractAbi={contract.rawAbi}
            deleteContract={deleteContract}
            handleChangeAbi={handleChangeAbi}
            handleChangeAdress={handleChangeAddress}
          />
        ))}
      </Stack>
    </form>
  );
}

StepOne.propTypes = {
  formId: PropTypes.string.isRequired,
  contracts: PropTypes.arrayOf(PropTypes.object).isRequired,
  addContract: PropTypes.func.isRequired,
  deleteContract: PropTypes.func.isRequired,
  setContractAddress: PropTypes.func.isRequired,
  setRawAbi: PropTypes.func.isRequired,
  setAbiEntries: PropTypes.func.isRequired,
  handleSubmit: PropTypes.func.isRequired,
};

export default StepOne;
