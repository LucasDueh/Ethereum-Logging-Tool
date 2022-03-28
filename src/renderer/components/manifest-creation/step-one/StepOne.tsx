import * as React from 'react';
import PropTypes from 'prop-types';
import { Box, Stack, Grid, Typography, Button } from '@mui/material';
import { IContract } from 'types/types';
import AddIcon from '@mui/icons-material/Add';
import ContractInputAccordion from './ContractInputAccordion';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function StepOne(props: any) {
  const {
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
    <form onSubmit={handleSubmit}>
      <Grid container spacing={2} justifyContent="center" alignItems="flex-end">
        <Grid item xs={12}>
          <Stack direction="row" justifyContent="space-between" spacing={2}>
            <Box>
              <Typography>
                Enter Contract Address and ABI of Solidity Smart Contract
              </Typography>
              <Typography variant="body2">
                The ABI and Contract Address can be copied from websites like
                etherscan.io.
              </Typography>
            </Box>

            <Button
              startIcon={<AddIcon />}
              variant="outlined"
              onClick={addContract}
            >
              Add Contract
            </Button>
          </Stack>
        </Grid>

        {contracts.map((contract: IContract, index: number) => (
          <ContractInputAccordion
            id={index}
            contractAddress={contract.address}
            contractAbi={contract.rawAbi}
            deleteContract={deleteContract}
            handleChangeAbi={handleChangeAbi}
            handleChangeAdress={handleChangeAddress}
          />
        ))}

        <Grid item>
          <Button type="submit" variant="contained">
            Confirm
          </Button>
        </Grid>
      </Grid>
    </form>
  );
}

StepOne.propTypes = {
  contracts: PropTypes.arrayOf(PropTypes.object).isRequired,
  addContract: PropTypes.func.isRequired,
  deleteContract: PropTypes.func.isRequired,
  setContractAddress: PropTypes.func.isRequired,
  setRawAbi: PropTypes.func.isRequired,
  setAbiEntries: PropTypes.func.isRequired,
  handleSubmit: PropTypes.func.isRequired,
};

export default StepOne;
