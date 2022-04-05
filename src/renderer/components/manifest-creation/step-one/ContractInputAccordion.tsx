import {
  TextField,
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
    contractName,
    contractAddress,
    contractAbi,
    deleteContract,
    handleChange,
  } = props;

  const handleChangeId = (event: React.ChangeEvent<HTMLTextAreaElement>) => {
    handleChange(event, id);
  };

  const deleteContractId = () => {
    deleteContract(id);
  };

  return (
    <Accordion
      sx={{
        '&: .Mui-focusVisible': {
          outline: 'none',
          background: 'transparent',
        },
      }}
      defaultExpanded
    >
      <AccordionSummary expandIcon={<ExpandMoreIcon />}>
        <Stack
          direction="row"
          alignItems="center"
          justifyContent="space-between"
          style={{ width: '100%' }}
        >
          <TextField
            name="name"
            label="Contract Name"
            onClick={(event) => {
              event.stopPropagation();
            }}
            onChange={handleChangeId}
            value={contractName}
          />
          <IconButton onClick={deleteContractId}>
            <DeleteIcon />
          </IconButton>
        </Stack>
      </AccordionSummary>
      <AccordionDetails>
        <Stack spacing={2}>
          <TextField
            name="address"
            label="Contract Address"
            placeholder="Enter Contract Address"
            onChange={handleChangeId}
            value={contractAddress}
            fullWidth
          />

          <TextField
            name="rawAbi"
            label="Contract ABI"
            placeholder="Enter Contract ABI"
            onChange={handleChangeId}
            value={contractAbi}
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
  contractName: PropTypes.string.isRequired,
  contractAddress: PropTypes.string.isRequired,
  contractAbi: PropTypes.string.isRequired,
  deleteContract: PropTypes.func.isRequired,
  handleChange: PropTypes.func.isRequired,
};

export default ContractInputAccordion;
