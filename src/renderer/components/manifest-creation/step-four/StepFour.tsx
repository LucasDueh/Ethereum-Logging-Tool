import * as React from 'react';
import PropTypes from 'prop-types';
import { Box, Stack, Grid, Typography, Button } from '@mui/material';
import { IContract } from 'types/types';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function StepFour(props: any) {
  const { contracts, settings, handleBack, handleSubmit } = props;

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
          </Stack>
        </Grid>

        {contracts.map((contract: IContract, index: number) => (
          <></>
        ))}

        <Grid item>
          <Button type="submit" variant="contained">
            Finish
          </Button>
        </Grid>
      </Grid>
    </form>
  );
}

StepFour.propTypes = {
  // eslint-disable-next-line react/forbid-prop-types
  settings: PropTypes.object.isRequired,
  contracts: PropTypes.arrayOf(PropTypes.object).isRequired,
  handleBack: PropTypes.func.isRequired,
  handleSubmit: PropTypes.func.isRequired,
};

export default StepFour;
