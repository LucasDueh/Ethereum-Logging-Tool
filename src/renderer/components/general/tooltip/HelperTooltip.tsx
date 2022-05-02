import PropTypes from 'prop-types';
import { Tooltip, Typography } from '@mui/material';
import HelpIcon from '@mui/icons-material/HelpOutline';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function HelperTooltip(props: any) {
  const { text } = props;

  return (
    <Tooltip
      title={
        <Typography sx={{ color: 'white', fontSize: 14 }}>{text}</Typography>
      }
      arrow
    >
      <HelpIcon sx={{ color: '#8c8c8cff', mx: 0.3, fontSize: 18 }} />
    </Tooltip>
  );
}

HelperTooltip.propTypes = {
  text: PropTypes.string.isRequired,
};

export default HelperTooltip;
