import { AppTheme } from './themetypes';

/* SCSS HEX */
const jet = '#393939ff';
const battleshipGrey = '#8c8c8cff';

const starCommandBlue = '#197bbdff'; // primary
const hanPurple = '#5438dcff'; // secondary
const flame = '#ec4e20ff'; // error
const honeyYellow = '#f6ae2dff'; // warning
const aeroBlue = '#F4FAFFff'; // info
const greenCyan = '#2d936cff'; // success

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
        light: starCommandBlue,
        main: starCommandBlue,
        dark: starCommandBlue,
      },
      secondary: {
        light: hanPurple,
        main: hanPurple,
        dark: hanPurple,
      },
      error: {
        light: flame,
        main: flame,
        dark: flame,
      },
      warning: {
        light: honeyYellow,
        main: honeyYellow,
        dark: honeyYellow,
      },
      info: {
        light: aeroBlue,
        main: aeroBlue,
        dark: aeroBlue,
      },
      succcess: {
        light: greenCyan,
        main: greenCyan,
        dark: greenCyan,
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
