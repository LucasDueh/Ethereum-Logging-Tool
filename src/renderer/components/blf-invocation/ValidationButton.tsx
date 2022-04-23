import React from 'react';
import PropTypes from 'prop-types';
import {
  Box,
  Alert,
  Stack,
  Button,
  CircularProgress,
  AlertColor,
  Divider,
} from '@mui/material';
import GradingIcon from '@mui/icons-material/Grading';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function ValidationButton(props: any) {
  const { code } = props;

  const [stdout, setStdout] = React.useState('');
  const [stderr, setStderr] = React.useState('');
  const [validated, setValidated] = React.useState<boolean | null>(null);
  const [loading, setLoading] = React.useState(false);
  const [color, setColor] = React.useState<'warning' | 'error' | 'success'>(
    'warning'
  );

  window.electron.ipcRenderer.on('blf-stdout', (out: string) => {
    setValidated(false);
    setColor('error');
    setStdout(out);
    setLoading(false);
  });

  window.electron.ipcRenderer.on('blf-stderr', (out: string) => {
    let msg = 'The validation did not find errors.';
    if (out.includes(msg)) {
      setValidated(true);
      setColor('success');
      setStderr(msg);
    }

    msg = 'The validation detected the following errors:';
    if (out.includes(msg)) {
      setStderr(msg);
    }

    setLoading(false);
  });

  const handleButtonClick = async () => {
    if (!loading) {
      window.electron.ipcRenderer.validateTempManifest(code);
      setLoading(true);
    }
  };

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
        overflowY: 'auto',
      }}
    >
      <Alert
        variant="outlined"
        severity={color as AlertColor}
        sx={{ py: 0, width: '100%', border: 0 }}
      >
        {validated === null && (
          <>
            <strong>Validation Required</strong> - Verify that your manifest
            does not contain any syntactical or semantic errors.
          </>
        )}
        {validated === true && (
          <>
            <strong>Validation Successful</strong> - {stderr}
          </>
        )}
        {validated === false && (
          <>
            <strong>Validation Error</strong> - {stderr}
            <Box>{stdout}</Box>
          </>
        )}
      </Alert>

      <Box
        sx={{
          m: 0,
          position: 'relative',
          display: 'flex',
          flexDirection: 'column',
          justifyContent: 'center',
        }}
      >
        <Button
          sx={{ color: 'white', boxShadow: 0 }}
          startIcon={<GradingIcon />}
          variant="contained"
          onClick={handleButtonClick}
          disabled={loading}
          color={color}
        >
          Validate
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

ValidationButton.propTypes = {
  code: PropTypes.string.isRequired,
};

export default ValidationButton;
