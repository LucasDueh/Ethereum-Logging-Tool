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
import ArrowForwardIcon from '@mui/icons-material/ArrowForward';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function ExtractionButton(props: any) {
  const { filePath } = props;

  const [stderr, setStderr] = React.useState<Array<string>>([]);
  const [processing, setProcessing] = React.useState(false);
  const [extractionCompleted, setExtractionCompleted] = React.useState(false);
  const [outputFolderPath, setOutputFolderPath] = React.useState('');

  const terminal = React.useRef<typeof Box>(null);

  React.useEffect(() => {
    window.electron.ipcRenderer.on('blf-extraction-stderr', (out: string) => {
      setStderr([...stderr, out]);
      if (terminal.current) {
        // eslint-disable-next-line @typescript-eslint/ban-ts-comment
        // @ts-ignore
        terminal.current.scrollTop = terminal.current.scrollHeight;
      }
    });
    return () => {
      window.electron.ipcRenderer.removeAllListeners('blf-extraction-stderr');
    };
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [stderr]);

  React.useEffect(() => {
    const fetchPath = async () => {
      const path = await window.electron.ipcRenderer.getOutputFolderPath();
      setOutputFolderPath(path);
    };

    fetchPath();
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, []);

  window.electron.ipcRenderer.once('blf-extraction-closed', (code: number) => {
    // console.log('Exited with code ', code);
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
      <Paper
        sx={{ py: 0.5, height: '100%', width: '100%', overflowY: 'auto' }}
        variant="outlined"
        square
      >
        <Stack sx={{ height: '100%' }}>
          <Typography sx={{ px: 1 }} variant="body2">
            TERMINAL
          </Typography>
          <Divider />
          <Box
            ref={terminal}
            sx={{
              p: 1,
              height: '100%',
              overflowY: 'auto',
            }}
          >
            {stderr.map((out: string, index: number) => {
              return (
                <Typography key={[out, index].join('')} fontSize={12}>
                  {out}
                </Typography>
              );
            })}
          </Box>
        </Stack>
      </Paper>

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
          <Box
            sx={{
              p: 1,
              border: 1,
              borderRadius: 1,
            }}
          >
            <Typography align="center">
              Extraction process completed.
            </Typography>
            <Typography align="center">
              Output stored in ${outputFolderPath}.
            </Typography>
          </Box>
        ) : (
          <>
            <Button
              sx={{ color: 'white', boxShadow: 0, minWidth: '30%' }}
              startIcon={<ArrowForwardIcon />}
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
