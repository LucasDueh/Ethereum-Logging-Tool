import { MemoryRouter as Router, Routes, Route } from 'react-router-dom';
import { ThemeProvider, createTheme } from '@mui/material/styles';
import CssBaseline from '@mui/material/CssBaseline';

import routes from './routes';
import Header from './components/Header';
import Sidebar from './components/Sidebar';
import AppTheme from './theming/themetypes';
import AppThemeOptions from './theming/themes';
import { Box, Toolbar } from '@mui/material';

declare global {
  interface Window {
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
    electron: any;
  }
}

function App() {
  return (
    <Router>
      <Box sx={{ display: "flex", height: '100vh' }}>
        <ThemeProvider theme={createTheme(AppThemeOptions[AppTheme.LIGHT])}>
          <CssBaseline />
          <Header/>
          <Sidebar/>
          <Box component="main" sx={{ flexGrow: 1, p: 3 }}>
            <Toolbar />
            <Routes>
              {routes.map((route) => (
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
