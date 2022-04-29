import React from 'react';
import { Box } from '@mui/material';

import OpenFileButton from '../components/manifest-extraction/OpenFileButton';
import ExtractionWithEditor from '../components/manifest-extraction/ExtractionWithEditor';

function DataExtraction() {
  const [manifestCode, setManifestCode] = React.useState('');
  const [filePath, setFilePath] = React.useState('');
  const [fileOpened, setFileOpened] = React.useState(false);

  const updateManifestCode = (code: string) => {
    setManifestCode(code);
  };

  const updateFilePath = (path: string) => {
    setFilePath(path);
  };

  const updateFileOpened = (value: boolean) => {
    setFileOpened(value);
  };

  return (
    <Box
      sx={{
        height: '100%',
        display: 'flex',
        flexDirection: 'column',
        justifyContent: fileOpened ? 'flex-start' : 'center',
      }}
    >
      {!fileOpened ? (
        <OpenFileButton
          updateManifestCode={updateManifestCode}
          updateFilePath={updateFilePath}
          updateFileOpened={updateFileOpened}
        />
      ) : (
        <ExtractionWithEditor manifestCode={manifestCode} filePath={filePath} />
      )}
    </Box>
  );
}

export default DataExtraction;
