import * as React from 'react';
import PropTypes from 'prop-types';
import { Grid, Typography, Button } from '@mui/material';

import { ABIEntry } from 'types/types';
import EventSelectionTable from './event-selection-table/EventSelectionTable';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function StepTwo(props: any) {
  const { rows, confirmActivities, handleBack, handleSubmit } = props;
  const [selected, setSelected] = React.useState<Array<ABIEntry>>([]);

  const handleSelectionChange = (newSelection: Array<ABIEntry>) => {
    setSelected(newSelection);
  };

  const confirmSelection = async (event: React.FormEvent) => {
    event.preventDefault();
    confirmActivities(selected);
    handleSubmit();
  };

  return (
    <form onSubmit={confirmSelection}>
      <Grid container spacing={1} justifyContent="center">
        <Grid item xs={12}>
          <Typography>Select ABI Entries for Process Mining</Typography>
          <Typography variant="body2">
            Every selected entry can later be mapped to an event.
          </Typography>
        </Grid>

        <Grid item xs={12}>
          <EventSelectionTable
            rows={rows}
            selected={selected}
            handleSelectionChange={handleSelectionChange}
          />
        </Grid>

        <Grid item>
          <Button
            type="button"
            variant="contained"
            onClick={handleBack}
            sx={{ mr: 2 }}
          >
            Back
          </Button>

          <Button type="submit" variant="contained">
            Next
          </Button>
        </Grid>
      </Grid>
    </form>
  );
}

StepTwo.propTypes = {
  rows: PropTypes.arrayOf(PropTypes.object).isRequired,
  confirmActivities: PropTypes.func.isRequired,
  handleBack: PropTypes.func.isRequired,
  handleSubmit: PropTypes.func.isRequired,
};

export default StepTwo;
