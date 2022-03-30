import {
  TextField,
  Typography,
  Accordion,
  AccordionSummary,
  AccordionDetails,
  Stack,
  IconButton,
} from '@mui/material';

import * as React from 'react';
import PropTypes from 'prop-types';
import ExpandMoreIcon from '@mui/icons-material/ExpandMore';
import DeleteIcon from '@mui/icons-material/Delete';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function ContractInputAccordion(props: any) {
  const {
    id,
    contractAddress,
    contractAbi,
    deleteContract,
    handleChangeAbi,
    handleChangeAdress,
  } = props;

  const handleChangeAddressId = (
    event: React.ChangeEvent<HTMLTextAreaElement>
  ) => {
    handleChangeAdress(event, id);
  };

  const handleChangeAbiId = (event: React.ChangeEvent<HTMLTextAreaElement>) => {
    handleChangeAbi(event, id);
  };

  const deleteContractId = () => {
    deleteContract(id);
  };

  return (
    <Accordion defaultExpanded>
      <AccordionSummary expandIcon={<ExpandMoreIcon />}>
        <Stack
          direction="row"
          alignItems="center"
          justifyContent="space-between"
          style={{ width: '100%' }}
        >
          <Typography>Contract {id + 1}</Typography>
          <IconButton onClick={deleteContractId}>
            <DeleteIcon />
          </IconButton>
        </Stack>
      </AccordionSummary>
      <AccordionDetails>
        <Stack spacing={2}>
          <TextField
            label="Contract Address"
            placeholder="Enter Contract Address"
            onChange={handleChangeAddressId}
            defaultValue={contractAddress}
            fullWidth
          />

          <TextField
            label="Contract ABI"
            placeholder="Enter Contract ABI"
            onChange={handleChangeAbiId}
            defaultValue={contractAbi}
            multiline
            minRows={4}
            maxRows={8}
            fullWidth
          />
        </Stack>
      </AccordionDetails>
    </Accordion>
  );
}

ContractInputAccordion.propTypes = {
  id: PropTypes.number.isRequired,
  contractAddress: PropTypes.string.isRequired,
  contractAbi: PropTypes.string.isRequired,
  deleteContract: PropTypes.func.isRequired,
  handleChangeAbi: PropTypes.func.isRequired,
  handleChangeAdress: PropTypes.func.isRequired,
};

export default ContractInputAccordion;
