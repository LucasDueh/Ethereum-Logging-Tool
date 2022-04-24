import PropTypes from 'prop-types';
import Box from '@mui/material/Box';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function TabPanel(props: any) {
  const { children, value, index } = props;

  return (
    <Box sx={{ overflow: 'auto' }} hidden={value !== index}>
      {value === index && <Box sx={{ overflow: 'auto' }}>{children}</Box>}
    </Box>
  );
}

TabPanel.propTypes = {
  children: PropTypes.node.isRequired,
  index: PropTypes.number.isRequired,
  value: PropTypes.number.isRequired,
};

export default TabPanel;
