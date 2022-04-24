import React from 'react';
import PropTypes from 'prop-types';
import { Box, Button, CircularProgress } from '@mui/material';

import FileOpenIcon from '@mui/icons-material/FileOpen';

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
      <Button
        sx={{ color: 'white', boxShadow: 0, minWidth: '30%' }}
        startIcon={<FileOpenIcon />}
        variant="contained"
        onClick={handleButtonClick}
        disabled={loading}
      >
        Open Manifest File
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
  );
}

OpenFileButton.propTypes = {
  updateManifestCode: PropTypes.func.isRequired,
  updateFilePath: PropTypes.func.isRequired,
  updateFileOpened: PropTypes.func.isRequired,
};

export default OpenFileButton;
