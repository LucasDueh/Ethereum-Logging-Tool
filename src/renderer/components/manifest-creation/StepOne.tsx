import * as React from 'react';
import PropTypes from 'prop-types';
import { Grid, Typography, Button, TextareaAutosize } from '@mui/material';
import CircularProgress from '@mui/material/CircularProgress';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function StepOne(props: any) {
  const { setABIEntries, handleSubmit } = props;

  const [loading, setLoading] = React.useState(false);
  const timer = React.useRef<number>();
  const [inputABI, setInputABI] = React.useState<string>('');

  React.useEffect(() => {
    return () => {
      clearTimeout(timer.current);
    };
  }, []);

  const handleChangeInputABI = (
    event: React.ChangeEvent<HTMLTextAreaElement>
  ) => {
    if (event.target.value === '') setInputABI('');
    setInputABI(event.target.value);
  };

  const convertABI = async (event: React.FormEvent) => {
    event.preventDefault();

    if (!loading) {
      setLoading(true);
      const result = await window.electron.ipcRenderer.getABI(inputABI);
      timer.current = window.setTimeout(() => {
        setLoading(false);
        setABIEntries(JSON.parse(result));
        handleSubmit();
      }, 2000);
    }
  };

  return (
    <form onSubmit={convertABI}>
      <Grid container spacing={2} justifyContent="center">
        <Grid item xs={12}>
          <Typography>Paste ABI of Solidity Smart Contract</Typography>
          <Typography variant="body2">
            The ABI can be copied from websites like etherscan.io
          </Typography>
        </Grid>

        <Grid item xs={12}>
          <TextareaAutosize
            placeholder="Enter Contract ABI"
            onChange={handleChangeInputABI}
            minRows={20}
            maxRows={40}
            style={{ width: '100%' }}
          />
        </Grid>

        <Grid item>
          <Button type="submit" variant="contained" disabled={loading}>
            Convert ABI
            {loading && (
              <CircularProgress
                size={24}
                sx={{
                  color: 'success.main',
                  position: 'absolute',
                  top: '50%',
                  left: '50%',
                  marginTop: '-12px',
                  marginLeft: '-12px',
                }}
              />
            )}
          </Button>
        </Grid>
      </Grid>
    </form>
  );
}

StepOne.propTypes = {
  setABIEntries: PropTypes.func.isRequired,
  handleSubmit: PropTypes.func.isRequired,
};

export default StepOne;
