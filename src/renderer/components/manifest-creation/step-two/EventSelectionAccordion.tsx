import {
  Grid,
  Typography,
  Accordion,
  AccordionSummary,
  AccordionDetails,
  Stack,
} from '@mui/material';

import PropTypes from 'prop-types';
import ExpandMoreIcon from '@mui/icons-material/ExpandMore';
import EventSelectionTable from './event-selection-table/EventSelectionTable';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function EventSelectionAccordion(props: any) {
  const {
    id,
    contractName,
    contractAddress,
    contractAbi,
    selected,
    handleSelectionChange,
  } = props;

  return (
    <Grid item xs={12}>
      <Accordion defaultExpanded>
        <AccordionSummary expandIcon={<ExpandMoreIcon />}>
          <Stack
            direction="row"
            alignItems="center"
            justifyContent="flex-start"
            style={{ width: '100%' }}
          >
            <Typography sx={{ mr: 1 }}>{contractName}</Typography>
            <Typography variant="body2">{contractAddress}</Typography>
          </Stack>
        </AccordionSummary>
        <AccordionDetails>
          <EventSelectionTable
            id={id}
            rows={contractAbi}
            selected={selected}
            handleSelectionChange={handleSelectionChange}
          />
        </AccordionDetails>
      </Accordion>
    </Grid>
  );
}

EventSelectionAccordion.propTypes = {
  id: PropTypes.number.isRequired,
  contractName: PropTypes.string.isRequired,
  contractAddress: PropTypes.string.isRequired,
  contractAbi: PropTypes.arrayOf(PropTypes.object).isRequired,
  selected: PropTypes.arrayOf(PropTypes.object).isRequired,
  handleSelectionChange: PropTypes.func.isRequired,
};

export default EventSelectionAccordion;
