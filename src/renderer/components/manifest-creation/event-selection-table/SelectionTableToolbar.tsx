import Typography from '@mui/material/Typography';
import Toolbar from '@mui/material/Toolbar';
import PropTypes from 'prop-types';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function SelectionTableToolbar(props: any) {
  const { title } = props;

  return (
    <Toolbar
      sx={{
        pl: { sm: 2 },
        pr: { xs: 1, sm: 1 },
      }}
    >
      <Typography
        sx={{ flex: '1 1 100%' }}
        variant="h6"
        id="tableTitle"
        component="div"
      >
        {title}
      </Typography>
    </Toolbar>
  );
}

SelectionTableToolbar.propTypes = {
  title: PropTypes.string.isRequired,
};

export default SelectionTableToolbar;
