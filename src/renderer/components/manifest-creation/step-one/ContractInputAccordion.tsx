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

  const handleChangeById = (event: React.ChangeEvent<HTMLTextAreaElement>) => {
    handleChange(event, id);
  };

  const deleteContractById = () => {
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
          sx={{ width: '100%' }}
          spacing={1}
        >
          <TextField
            name="name"
            label="Contract Name"
            onClick={(event) => {
              event.stopPropagation();
            }}
            onChange={handleChangeById}
            value={contractName}
            sx={{ width: '50%' }}
          />
          <IconButton
            onClick={(event) => {
              event.stopPropagation();
              deleteContractById();
            }}
          >
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
            onChange={handleChangeById}
            value={contractAddress}
            fullWidth
          />

          <TextField
            name="rawAbi"
            label="Contract ABI"
            placeholder="Enter Contract ABI"
            onChange={handleChangeById}
            value={contractAbi}
            multiline
            minRows={4}
            maxRows={6}
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
