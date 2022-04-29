import PropTypes from 'prop-types';
import { Box, Button, CircularProgress } from '@mui/material';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function ProgessButton(props: any) {
  const { value, onClick, loading, icon, color } = props;

  return (
    <Box
      sx={{
        m: 0,
        position: 'relative',
        display: 'flex',
        flexDirection: 'column',
        justifyContent: 'center',
      }}
    >
      <Button
        sx={{ color: 'white', boxShadow: 0, minWidth: '30%', mr: 1 }}
        startIcon={icon}
        variant="contained"
        onClick={onClick}
        disabled={loading}
        color={color}
      >
        {value}
      </Button>
      {loading && (
        <CircularProgress
          size={24}
          sx={{
            position: 'absolute',
            top: '50%',
            left: '50%',
            marginTop: '-12px',
            marginLeft: '-12px',
          }}
        />
      )}
    </Box>
  );
}

ProgessButton.defaultProps = {
  color: 'primary',
};

ProgessButton.propTypes = {
  value: PropTypes.string.isRequired,
  onClick: PropTypes.func.isRequired,
  loading: PropTypes.bool.isRequired,
  icon: PropTypes.element.isRequired,
  color: PropTypes.string,
};

export default ProgessButton;
