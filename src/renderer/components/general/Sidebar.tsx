import PropTypes from 'prop-types';
import { Drawer, Box, Toolbar } from '@mui/material';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function Sidebar(props: any) {
  const { content, anchor, drawerWidth } = props;

  return (
    <Drawer
      variant="permanent"
      anchor={anchor}
      sx={{
        width: drawerWidth,
        flexShrink: 0,
        '& .MuiDrawer-paper': { width: drawerWidth, boxSizing: 'border-box' },
      }}
    >
      <Toolbar />
      <Box sx={{ overflow: 'auto' }}>{content}</Box>
    </Drawer>
  );
}

Sidebar.propTypes = {
  content: PropTypes.element.isRequired,
  anchor: PropTypes.string.isRequired,
  drawerWidth: PropTypes.number.isRequired,
};

export default Sidebar;
