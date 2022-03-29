import * as React from 'react';
import PropTypes from 'prop-types';
import { Box, Grid, Typography, Button } from '@mui/material';
import { IContract } from 'types/types';

import AceEditor from 'react-ace';

import BcqlMode from './BcqlMode';
import 'ace-builds/src-noconflict/theme-eclipse';
import 'ace-builds/src-min-noconflict/ext-language_tools';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function StepFour(props: any) {
  const { settingsCode, extractionCode, contracts, handleBack, handleSubmit } =
    props;
  const aceEditor = React.useRef<AceEditor>(null);

  React.useEffect(() => {
    if (aceEditor.current != null) {
      const customMode = new BcqlMode();
      aceEditor.current.editor.getSession().setMode(customMode);
    }
  });

  const onChange = (newValue: string) => {
    console.log('change', newValue);
  };

  return (
    <form onSubmit={handleSubmit}>
      <Grid
        container
        spacing={2}
        justifyContent="center"
        style={{ height: '80vh' }}
      >
        <Grid item xs={12}>
          <Typography>
            Enter Contract Address and ABI of Solidity Smart Contract
          </Typography>
          <Typography variant="body2">
            The ABI and Contract Address can be copied from websites like
            etherscan.io.
          </Typography>
        </Grid>

        <Grid item xs={4}>
          {contracts.map((contract: IContract, index: number) => (
            <Box key={contract.address} />
          ))}
        </Grid>

        <Grid item xs={8}>
          <AceEditor
            ref={aceEditor}
            value={[settingsCode, extractionCode].join('')}
            mode="text"
            theme="eclipse"
            onChange={onChange}
            name="ace"
            width="100%"
            editorProps={{ $blockScrolling: true }}
            style={{
              width: '100%',
              borderRadius: '4px',
            }}
            enableBasicAutocompletion
            enableLiveAutocompletion
          />
        </Grid>

        <Grid item>
          <Button
            type="button"
            variant="contained"
            onClick={handleBack}
            sx={{ mr: 2 }}
          >
            Back
          </Button>

          <Button type="submit" variant="contained">
            Finish
          </Button>
        </Grid>
      </Grid>
    </form>
  );
}

StepFour.propTypes = {
  settingsCode: PropTypes.string.isRequired,
  extractionCode: PropTypes.string.isRequired,
  contracts: PropTypes.arrayOf(PropTypes.object).isRequired,
  handleBack: PropTypes.func.isRequired,
  handleSubmit: PropTypes.func.isRequired,
};

export default StepFour;
