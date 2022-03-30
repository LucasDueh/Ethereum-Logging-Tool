import { Stack, Box, Grid, Button, Typography } from '@mui/material';

import FileListSidebar from 'renderer/components/manifest-list/FileListSidebar';

function ManifestList() {
  const labelSpace = 2;

  return (
    <Stack direction="row" spacing={1}>
      <FileListSidebar />
      <Grid container spacing={2}>
        <Grid item xs={12}>
          <Typography variant="h4">Augur.bcql</Typography>
        </Grid>

        <Grid item xs={12}>
          <Typography variant="h5">Mandatory Settings</Typography>
        </Grid>

        <Grid item xs={labelSpace}>
          <Box sx={{ fontWeight: 'bold' }}>Blockchain</Box>
        </Grid>
        <Grid item xs={12 - labelSpace}>
          Ethereum
        </Grid>
        <Grid item xs={labelSpace}>
          <Box sx={{ fontWeight: 'bold' }}>Output Folder</Box>
        </Grid>
        <Grid item xs={12 - labelSpace}>
          ./test_output
        </Grid>
        <Grid item xs={labelSpace}>
          <Box sx={{ fontWeight: 'bold' }}>Abort on Exception</Box>
        </Grid>
        <Grid item xs={12 - labelSpace}>
          true
        </Grid>
        <Grid item xs={labelSpace}>
          <Box sx={{ fontWeight: 'bold' }}>Error Output Folder</Box>
        </Grid>
        <Grid item xs={12 - labelSpace}>
          ./test_error_output
        </Grid>
        <Grid item xs={labelSpace}>
          <Box sx={{ fontWeight: 'bold' }}>Emission Mode</Box>
        </Grid>
        <Grid item xs={12 - labelSpace}>
          default batching
        </Grid>
        <Grid item xs={labelSpace}>
          <Box sx={{ fontWeight: 'bold' }}>Connection</Box>
        </Grid>
        <Grid item xs={12 - labelSpace}>
          wss://mainnet.infura.io/ws/v3/ecc103e7c4f4426ab15fb39e38176d67
        </Grid>

        <Grid item xs={12} sx={{ mt: 5 }}>
          <Typography variant="h5">Extraction Pipeline</Typography>
        </Grid>

        <Grid item xs={12}>
          TODO
        </Grid>

        <Grid item xs={12} sx={{ mt: 5 }}>
          <Button
            variant="contained"
            onClick={async () => {
              window.electron.ipcRenderer.validateManifest(
                'NetworkStatistics.bcql'
              );
            }}
            sx={{ mr: 3 }}
          >
            Validate Manifest
          </Button>
          <Button
            variant="contained"
            onClick={async () => {
              window.electron.ipcRenderer.extractManifest(
                'NetworkStatistics.bcql'
              );
            }}
          >
            Extract Manifest
          </Button>
        </Grid>
      </Grid>
    </Stack>
  );
}

export default ManifestList;
