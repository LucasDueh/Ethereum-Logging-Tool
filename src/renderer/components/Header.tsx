import { Typography, AppBar, Toolbar, Container } from '@mui/material';

function Header() {
  return (
    <AppBar
      position="fixed"
      sx={{ zIndex: (theme) => theme.zIndex.drawer + 1 }}
    >
      <Container maxWidth="xl">
        <Toolbar disableGutters sx={{ justifyContent: 'start' }}>
          <Typography variant="h6" component="div">
            Ethereum Logging Tool
          </Typography>
        </Toolbar>
      </Container>
    </AppBar>
  );
}

export default Header;
