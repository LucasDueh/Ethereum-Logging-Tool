import React from 'react';
import PropTypes from 'prop-types';
import { Box } from '@mui/material';

import FileOpenIcon from '@mui/icons-material/FileOpen';

import ProgessButton from '../general/buttons/ProgressButton';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function OpenFileButton(props: any) {
  const { updateManifestCode, updateFilePath, updateFileOpened } = props;

  const [loading, setLoading] = React.useState(false);

  const handleButtonClick = async () => {
    let isError = false;
    if (!loading) {
      setLoading(true);
      await window.electron.ipcRenderer
        .openManifestFile()
        // eslint-disable-next-line @typescript-eslint/no-explicit-any
        .then((fileData: any) => {
          updateFilePath(fileData.filePath);
          updateManifestCode(fileData.data);
          return null;
        })
        // eslint-disable-next-line @typescript-eslint/no-unused-vars
        .catch((_error: Error) => {
          isError = true;
          return null;
        });
      setLoading(false);
      updateFileOpened(!isError);
    }
  };

  return (
    <Box
      sx={{
        m: 0,
        p: 2,
        position: 'relative',
        display: 'flex',
        flexDirection: 'column',
        justifyContent: 'center',
        alignItems: 'center',
      }}
    >
      <ProgessButton
        value={'Open Manifest File'}
        icon={<FileOpenIcon />}
        onClick={handleButtonClick}
        loading={loading}
      ></ProgessButton>
    </Box>
  );
}

OpenFileButton.propTypes = {
  updateManifestCode: PropTypes.func.isRequired,
  updateFilePath: PropTypes.func.isRequired,
  updateFileOpened: PropTypes.func.isRequired,
};

export default OpenFileButton;
