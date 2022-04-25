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

  const [stdout, setStdout] = React.useState<Array<string>>(['-']);
  const [stderr, setStderr] = React.useState<Array<string>>([]);
  const [processing, setProcessing] = React.useState(false);
  const [extractionCompleted, setExtractionCompleted] = React.useState(false);

  React.useEffect(() => {
    window.electron.ipcRenderer.on('blf-extraction-stdout', (out: string) => {
      setStdout([...stdout, out]);
    });
    return () => {
      window.electron.ipcRenderer.removeAllListeners('blf-extraction-stdout');
    };
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [stdout]);

  React.useEffect(() => {
    window.electron.ipcRenderer.on('blf-extraction-stderr', (out: string) => {
      setStderr([...stderr, out]);
    });
    return () => {
      window.electron.ipcRenderer.removeAllListeners('blf-extraction-stderr');
    };
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [stderr]);

  window.electron.ipcRenderer.once('blf-extraction-closed', (code: number) => {
    console.log('Exited with code ', code);
    setProcessing(false);
    setExtractionCompleted(true);
  });

  const handleButtonClick = async () => {
    if (!processing) {
      window.electron.ipcRenderer.extract(filePath);
      setProcessing(true);
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
        initialSizes={[10, 90]}
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
          {stdout.map((out: string, index: number) => {
            return (
              <Typography key={[out, index].join('')} fontSize={12}>
                {out}
              </Typography>
            );
          })}
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
          {stderr.map((out: string, index: number) => {
            return (
              <Typography key={[out, index].join('')} fontSize={12}>
                {out}
              </Typography>
            );
          })}
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
        {extractionCompleted ? (
          <Typography>Extraction process completed.</Typography>
        ) : (
          <>
            <Button
              sx={{ color: 'white', boxShadow: 0, minWidth: '30%' }}
              startIcon={<GradingIcon />}
              variant="contained"
              onClick={handleButtonClick}
              disabled={processing}
            >
              Initiate Extraction
            </Button>
            {processing && (
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
          </>
        )}
      </Box>
    </Stack>
  );
}

ExtractionButton.propTypes = {
  filePath: PropTypes.string.isRequired,
};

export default ExtractionButton;
