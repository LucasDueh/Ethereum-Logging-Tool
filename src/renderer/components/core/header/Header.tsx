import {
  Stack,
  Typography,
  Button,
  AppBar,
  Toolbar,
  Container,
} from '@mui/material';
import { Cancel } from '@mui/icons-material';
import { Link, useLocation } from 'react-router-dom';

function Header() {
  const killRunningProcess = async () => {
    window.electron.ipcRenderer.killRunningProcess();
  };

  return (
    <AppBar
      position="fixed"
      sx={{ zIndex: (theme) => theme.zIndex.drawer + 1 }}
    >
      <Container maxWidth="xl">
        <Toolbar disableGutters>
          <Stack
            direction="row"
            alignItems="center"
            justifyContent="space-between"
            spacing={3}
            sx={{ width: '100%' }}
          >
            <Typography variant="h6" component="div">
              Ethereum Logging Tool
            </Typography>

            {useLocation().pathname !== '/' && (
              <Link style={{ textDecoration: 'none' }} to="/">
                <Button
                  variant="outlined"
                  color="info"
                  startIcon={<Cancel />}
                  onClick={killRunningProcess}
                >
                  Cancel
                </Button>
              </Link>
            )}
          </Stack>
        </Toolbar>
      </Container>
    </AppBar>
  );
}

export default Header;
