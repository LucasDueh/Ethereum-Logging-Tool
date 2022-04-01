import {
  Stack,
  Typography,
  Button,
  AppBar,
  Toolbar,
  Container,
} from '@mui/material';
import { Cancel, NoteAdd } from '@mui/icons-material';
import { Link, useLocation } from 'react-router-dom';

function Header() {
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

            {useLocation().pathname === '/manifest-creation' ? (
              <Link style={{ textDecoration: 'none' }} to="/">
                <Button variant="outlined" color="info" startIcon={<Cancel />}>
                  Cancel
                </Button>
              </Link>
            ) : (
              <Link style={{ textDecoration: 'none' }} to="/manifest-creation">
                <Button variant="outlined" color="info" startIcon={<NoteAdd />}>
                  New Manifest
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
