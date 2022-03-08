import PropTypes from 'prop-types';
import { Grid, Typography, Button } from '@mui/material';

import Sidebar from 'renderer/components/general/Sidebar';
import EventSelectionTable from './event-selection-table/EventSelectionTable';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function StepTwo(props: any) {
  const { rows, handleBack, handleSubmit } = props;

  return (
    <form onSubmit={handleSubmit}>
      <Grid container spacing={1} justifyContent="center">
        <Grid item xs={12}>
          <Typography>Select ABI Entries for Process Mining</Typography>
          <Typography variant="body2">
            Every selected entry can later be mapped to an event.
          </Typography>
        </Grid>

        <Grid item xs={12}>
          <EventSelectionTable rows={rows} />
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
  handleBack: PropTypes.func.isRequired,
  handleSubmit: PropTypes.func.isRequired,
};

export default StepTwo;
