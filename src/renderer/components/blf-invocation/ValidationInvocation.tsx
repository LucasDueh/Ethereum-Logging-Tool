import React from 'react';
import PropTypes from 'prop-types';
import { Box, Alert, Stack, AlertColor, Divider } from '@mui/material';
import GradingIcon from '@mui/icons-material/Grading';
import Terminal from './terminal/Terminal';
import ProgressButton from '../general/buttons/ProgressButton';

import reduceToMaxLines from './terminal/terminal-output';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function ValidationInvocation(props: any) {
  const { code } = props;

  const [stderr, setStderr] = React.useState<Array<string>>([]);
  const [stdout, setStdout] = React.useState<Array<string>>([]);
  const [alertSubHeader, setAlertSubHeader] = React.useState<string>('');
  const [validated, setValidated] = React.useState<boolean | null>(null);
  const [loading, setLoading] = React.useState(false);
  const [color, setColor] = React.useState<'warning' | 'error' | 'success'>(
    'warning'
  );

  const handleButtonClick = async () => {
    if (!loading) {
      setStderr([]);
      setStdout([]);
      window.electron.ipcRenderer.validateTempManifest(code);
      setLoading(true);
    }
  };

  React.useEffect(() => {
    let temp: Array<string> = [];
    window.electron.ipcRenderer.on('blf-validation-stderr', (out: string) => {
      temp.push(out);
      temp = reduceToMaxLines(temp);
      setStderr([...temp]);
    });
    return () => {
      window.electron.ipcRenderer.removeAllListeners('blf-validation-stderr');
    };
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [loading]);

  React.useEffect(() => {
    let temp: Array<string> = [];
    window.electron.ipcRenderer.on('blf-validation-stdout', (out: string) => {
      setValidated(false);
      setColor('error');
      temp.push(out);
      temp = reduceToMaxLines(temp);
      setStdout([...temp]);
    });

    return () => {
      window.electron.ipcRenderer.removeAllListeners('blf-validation-stdout');
    };
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [loading]);

  React.useEffect(() => {
    let msg = 'The validation did not find errors.';
    if (stderr.join().includes(msg)) {
      setValidated(true);
      setColor('success');
      setAlertSubHeader(msg);
    } else {
      msg = 'The validation detected the following errors:';
      if (stderr.join().includes(msg)) {
        setAlertSubHeader(msg);
      }
    }
    setLoading(false);
  }, [stdout, stderr]);

  return (
    <Stack
      direction="row"
      divider={<Divider orientation="vertical" flexItem />}
      justifyContent="space-between"
      spacing={1}
      sx={{
        p: 0.5,
        border: 1,
        borderColor: `${color}.main`,
        borderRadius: 0.3,
        height: '100%',
        overflow: 'hidden',
      }}
    >
      <Stack
        alignItems="stretch"
        justifyContent="flex-start"
        sx={{ width: '100%' }}
      >
        <Alert
          variant="outlined"
          severity={color as AlertColor}
          sx={{
            py: 0,
            border: 0,
          }}
        >
          {validated === null && (
            <>
              <strong>Validation Required</strong> - Verify that your manifest
              does not contain any syntax errors.
            </>
          )}
          {validated === true && (
            <>
              <strong>Validation Successful</strong> - {alertSubHeader}
            </>
          )}
          {validated === false && (
            <>
              <strong>Validation Error</strong> - {alertSubHeader}
            </>
          )}
        </Alert>
        {validated === false && <Terminal name="stdout" output={stdout} />}
      </Stack>

      <Box
        sx={{
          m: 0,
          position: 'relative',
          display: 'flex',
          flexDirection: 'column',
          justifyContent: 'center',
        }}
      >
        <ProgressButton
          value="validate"
          icon={<GradingIcon />}
          onClick={handleButtonClick}
          loading={loading}
          color={color}
        />
      </Box>
    </Stack>
  );
}

ValidationInvocation.propTypes = {
  code: PropTypes.string.isRequired,
};

export default ValidationInvocation;
