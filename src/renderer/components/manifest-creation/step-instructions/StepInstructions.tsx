import PropTypes from 'prop-types';
import { Box, Typography } from '@mui/material';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function StepInstructions(props: any) {
  const { heading, details } = props;

  return (
    <Box>
      <Typography>{heading}</Typography>
      <Typography variant="body2">{details}</Typography>
    </Box>
  );
}

StepInstructions.propTypes = {
  heading: PropTypes.string.isRequired,
  details: PropTypes.string.isRequired,
};

export default StepInstructions;
