import * as React from 'react';
import PropTypes from 'prop-types';
import { Grid, Typography, Button } from '@mui/material';

import { IAbiEntry, IContract } from 'types/types';
import EventSelectionAccordion from './EventSelectionAccordion';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function StepTwo(props: any) {
  const { contracts, setActivities, handleBack, handleSubmit } = props;
  const [selected, setSelected] = React.useState<Array<Array<IAbiEntry>>>([]);

  const initSelected: Array<Array<IAbiEntry>> = [];

  React.useEffect(() => {
    contracts.forEach(() => {
      initSelected.push(new Array<IAbiEntry>());
    });
    setSelected(initSelected);
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, []);

  const handleSelectionChange = (
    newSelection: Array<IAbiEntry>,
    id: number
  ) => {
    const updatedSelected = [...selected];
    updatedSelected[id] = newSelection;
    setSelected(updatedSelected);
  };

  const confirmSelection = async (event: React.FormEvent) => {
    event.preventDefault();
    await setActivities(selected);
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

        {selected.length === contracts.length ? (
          contracts.map((contract: IContract, index: number) => (
            <EventSelectionAccordion
              key={contract.address}
              id={index}
              contractAddress={contract.address}
              contractAbi={contract.abiEntries}
              selected={selected[index]}
              handleSelectionChange={handleSelectionChange}
            />
          ))
        ) : (
          <div />
        )}

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
  contracts: PropTypes.arrayOf(PropTypes.object).isRequired,
  setActivities: PropTypes.func.isRequired,
  handleBack: PropTypes.func.isRequired,
  handleSubmit: PropTypes.func.isRequired,
};

export default StepTwo;
