import React from 'react';
import PropTypes from 'prop-types';
import {
  Box,
  Stack,
  Divider,
  Button,
  CircularProgress,
  Typography,
  Paper,
} from '@mui/material';
import GradingIcon from '@mui/icons-material/Grading';

import ReactSplit, { SplitDirection } from '@devbookhq/splitter';
import '../general/splitter/custom-splitter.css';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function ExtractionButton(props: any) {
  const { filePath } = props;

  const [stdout, setStdout] = React.useState('');
  const [stderr, setStderr] = React.useState('');
  const [loading, setLoading] = React.useState(false);

  window.electron.ipcRenderer.on('blf-stdout', (out: string) => {
    setStdout(out);
  });

  window.electron.ipcRenderer.on('blf-stderr', (out: string) => {
    const msg = 'The extraction was interrupted due to the following errors:';
    setStderr(out);
  });

  const handleButtonClick = async () => {
    if (!loading) {
      window.electron.ipcRenderer.extract(filePath);
      setLoading(true);
    }
  };

  return (
    <Stack
      direction="column"
      justifyContent="flex-start"
      alignItems="center"
      sx={{ height: '100%' }}
    >
      <ReactSplit
        direction={SplitDirection.Horizontal}
        initialSizes={[50, 50]}
        minHeights={[50, 50]}
        gutterClassName="custom-splitter-horizontal"
      >
        <Paper
          variant="outlined"
          square
          sx={{
            p: 1,
            height: '100%',
            overflowY: 'auto',
          }}
        >
          <Typography variant="body2">Stdout</Typography>
          <Divider />
          <Typography>{stdout}</Typography>
        </Paper>

        <Paper
          variant="outlined"
          square
          sx={{
            p: 1,
            height: '100%',
            overflowY: 'auto',
          }}
        >
          <Typography variant="body2">Stderr</Typography>
          <Divider />
          <Typography>{stderr}</Typography>
        </Paper>
      </ReactSplit>

      <Box
        sx={{
          m: 2,
          position: 'relative',
          display: 'flex',
          flexDirection: 'column',
          justifyContent: 'center',
        }}
      >
        <Button
          sx={{ color: 'white', boxShadow: 0, minWidth: '30%' }}
          startIcon={<GradingIcon />}
          variant="contained"
          onClick={handleButtonClick}
          disabled={loading}
        >
          Initiate Extraction
        </Button>
        {loading && (
          <CircularProgress
            size={24}
            sx={{
              position: 'absolute',
              top: '50%',
              left: '50%',
              marginTop: '-12px',
              marginLeft: '-12px',
            }}
          />
        )}
      </Box>
    </Stack>
  );
}

ExtractionButton.propTypes = {
  filePath: PropTypes.string.isRequired,
};

export default ExtractionButton;
