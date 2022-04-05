import { AppTheme } from './themetypes';

/* SCSS HEX */
const jet = '#393939ff';
const battleshipGrey = '#8c8c8cff';

const main = '#197bbdff'; // blue
const hanPurple = '#5438dcff'; // secondary
const error = '#D41C1C';
const warning = '#EBA937'; // warning
const info = '#F4FAFFff'; // info
const success = '#2d936cff'; // success

const themeindependent = {
  typography: {
    fontFamily: ['Source Code Sans', 'sans-serif'].join(','),
    h1: {
      color: jet,
      fontSize: 50,
    },
    body1: {
      color: jet,
      fontSize: 17,
    },
    body2: {
      color: battleshipGrey,
      fontSize: 15,
    },
  },
};

const AppThemeOptions = {
  [AppTheme.LIGHT]: {
    palette: {
      type: 'light',
      primary: {
        light: main,
        main,
        dark: main,
      },
      secondary: {
        light: hanPurple,
        main: hanPurple,
        dark: hanPurple,
      },
      error: {
        light: error,
        main: error,
        dark: error,
      },
      warning: {
        light: warning,
        main: warning,
        dark: warning,
      },
      info: {
        light: info,
        main: info,
        dark: info,
      },
      success: {
        light: success,
        main: success,
        dark: success,
      },
      background: {
        paper: '#fff',
        default: '#fafafa',
      },
    },
    ...themeindependent,
  },
};

export default AppThemeOptions;
