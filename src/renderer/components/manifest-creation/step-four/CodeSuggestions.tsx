import PropTypes from 'prop-types';
import { Typography, Stack, Box } from '@mui/material';

import { IActivity } from 'types/types';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function CodeSuggestions(props: any) {
  const { id, contractAddress, contractActivities } = props;

  return (
    <Stack spacing={2}>
      <Typography>{contractAddress}</Typography>

      {contractActivities.map((activity: IActivity) => {
        return <Box>{activity.hash}</Box>;
      })}
    </Stack>
  );
}

CodeSuggestions.propTypes = {
  id: PropTypes.number.isRequired,
  contractAddress: PropTypes.string.isRequired,
  contractActivities: PropTypes.arrayOf(PropTypes.object).isRequired,
};

export default CodeSuggestions;
