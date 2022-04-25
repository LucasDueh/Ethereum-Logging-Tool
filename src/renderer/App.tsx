import { MemoryRouter as Router, Routes, Route } from 'react-router-dom';
import { ThemeProvider, createTheme } from '@mui/material/styles';
import CssBaseline from '@mui/material/CssBaseline';

import { Box, Toolbar } from '@mui/material';
import routes from './routes';
import Header from './components/manifest-creation/header/Header';
import AppTheme from './theming/themetypes';
import AppThemeOptions from './theming/themes';

declare global {
  interface Window {
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
    electron: any;
  }
}

function App() {
  return (
    <Router>
      <Box sx={{ display: 'flex', height: '100vh' }}>
        <ThemeProvider theme={createTheme(AppThemeOptions[AppTheme.LIGHT])}>
          <CssBaseline />
          <Header />
          <Box
            className="app-box"
            component="main"
            sx={{
              flexGrow: 1,
              display: 'flex',
              flexDirection: 'column',
            }}
          >
            <Toolbar />
            <Routes>
              {routes.map((route) => (
                // eslint-disable-next-line react/jsx-props-no-spreading
                <Route key={route.path} {...route} />
              ))}
            </Routes>
          </Box>
        </ThemeProvider>
      </Box>
    </Router>
  );
}

export default App;
