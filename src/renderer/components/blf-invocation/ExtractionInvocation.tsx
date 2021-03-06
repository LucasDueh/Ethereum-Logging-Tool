import React from 'react';
import PropTypes from 'prop-types';
import { Box, Stack, Typography } from '@mui/material';
import ArrowForwardIcon from '@mui/icons-material/ArrowForward';
import ReactSplit, { SplitDirection } from '@devbookhq/splitter';
import Terminal from './terminal/Terminal';
import ProgressButton from '../general/buttons/ProgressButton';
import '../general/splitter/custom-splitter.css';

import reduceToMaxLines from './terminal/terminal-output';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function ExtractionInvocation(props: any) {
  const { filePath } = props;

  const [stderr, setStderr] = React.useState<Array<string>>([]);
  const [stdout, setStdout] = React.useState<Array<string>>([]);
  const [processing, setProcessing] = React.useState(false);
  const [extractionCompleted, setExtractionCompleted] = React.useState(false);
  const [outputFolderPath, setOutputFolderPath] = React.useState('');

  React.useEffect(() => {
    let temp: Array<string> = [];
    window.electron.ipcRenderer.on('blf-extraction-stderr', (out: string) => {
      temp.push(out);
      temp = reduceToMaxLines(temp);
      setStderr([...temp]);
    });
    return () => {
      window.electron.ipcRenderer.removeAllListeners('blf-extraction-stderr');
    };
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [processing]);

  React.useEffect(() => {
    let temp: Array<string> = [];
    window.electron.ipcRenderer.on('blf-extraction-stdout', (out: string) => {
      temp.push(out);
      temp = reduceToMaxLines(temp);
      setStdout([...temp]);
    });
    return () => {
      window.electron.ipcRenderer.removeAllListeners('blf-extraction-stdout');
    };
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [processing]);

  React.useEffect(() => {
    window.electron.ipcRenderer.once(
      'blf-extraction-closed',
      (code: number) => {
        setProcessing(false);
        if (code === 0) {
          setExtractionCompleted(true);
        }
      }
    );
    return () => {
      window.electron.ipcRenderer.removeAllListeners('blf-extraction-closed');
    };
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, []);

  React.useEffect(() => {
    const fetchOutputFolderPath = async () => {
      const path = await window.electron.ipcRenderer.getOutputFolderPath();
      setOutputFolderPath(path);
    };

    fetchOutputFolderPath();
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, []);

  const handleExtractionInit = async () => {
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
      sx={{ height: '100%', overflow: 'hidden' }}
    >
      <ReactSplit
        direction={SplitDirection.Horizontal}
        initialSizes={[50, 50]}
        minWidths={[100, 100]}
        gutterClassName="custom-splitter-horizontal"
      >
        <Terminal name="stderr" output={stderr} />
        <Terminal name="stdout" output={stdout} />
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
          <Box
            sx={{
              p: 1,
              border: 1,
              borderRadius: 1,
            }}
          >
            <Typography align="center">
              Extraction process has terminated.
            </Typography>
            <Typography align="center">
              If successful, the output is located in
            </Typography>
            <Typography align="center" color="primary">
              {outputFolderPath}
            </Typography>
          </Box>
        ) : (
          <Stack direction="row" justifyContent="center" sx={{ p: 1 }}>
            <ProgressButton
              value="Initiate Extraction"
              onClick={handleExtractionInit}
              icon={<ArrowForwardIcon />}
              loading={processing}
            />
          </Stack>
        )}
      </Box>
    </Stack>
  );
}

ExtractionInvocation.propTypes = {
  filePath: PropTypes.string.isRequired,
};

export default ExtractionInvocation;
