import React from 'react';
import {
  Box,
  List,
  ListItemButton,
  ListItemText,
  ListSubheader,
  ListItemIcon,
  Collapse,
  Divider,
} from '@mui/material';
import { Article, Folder } from '@mui/icons-material';
import ExpandLess from '@mui/icons-material/ExpandLess';
import ExpandMore from '@mui/icons-material/ExpandMore';

import Sidebar from 'renderer/components/general/sidebar/Sidebar';

const drawerWidth = 320;

function FileListSidebar() {
  const [open, setOpen] = React.useState(true);
  const [open2, setOpen2] = React.useState(true);

  const handleClick = () => {
    setOpen(!open);
  };

  const handleClick2 = () => {
    setOpen2(!open2);
  };

  const FileList = () => {
    return (
      <Box sx={{ overflow: 'auto' }}>
        <List
          sx={{
            width: '100%',
            maxWidth: drawerWidth,
            bgcolor: 'background.paper',
          }}
          component="nav"
          subheader={
            <ListSubheader component="div" id="nested-list-subheader">
              Manifests
            </ListSubheader>
          }
        >
          <Divider />
          <ListItemButton>
            <ListItemIcon>
              <Article />
            </ListItemIcon>
            <ListItemText primary="Cargox.bcql" />
          </ListItemButton>
          <Divider />
          <ListItemButton>
            <ListItemIcon>
              <Article />
            </ListItemIcon>
            <ListItemText primary="KryptoKitties.bcql" />
          </ListItemButton>
          <Divider />
          <ListItemButton onClick={handleClick}>
            <ListItemIcon>
              <Folder />
            </ListItemIcon>
            <ListItemText primary="Augur" />
            {open ? <ExpandLess /> : <ExpandMore />}
          </ListItemButton>
          <Collapse in={open} timeout="auto" unmountOnExit>
            <List component="div" disablePadding>
              <ListItemButton sx={{ pl: 4 }}>
                <ListItemIcon>
                  <Article />
                </ListItemIcon>
                <ListItemText primary="Augur.bcql" />
              </ListItemButton>
              <ListItemButton sx={{ pl: 4 }}>
                <ListItemIcon>
                  <Article />
                </ListItemIcon>
                <ListItemText primary="Augur2.bcql" />
              </ListItemButton>
              <ListItemButton sx={{ pl: 4 }}>
                <ListItemIcon>
                  <Article />
                </ListItemIcon>
                <ListItemText primary="Augur3.bcql" />
              </ListItemButton>
            </List>
          </Collapse>
          <Divider />
          <ListItemButton onClick={handleClick2}>
            <ListItemIcon>
              <Folder />
            </ListItemIcon>
            <ListItemText primary="Forsage" />
            {open2 ? <ExpandLess /> : <ExpandMore />}
          </ListItemButton>
          <Collapse in={open2} timeout="auto" unmountOnExit>
            <List component="div" disablePadding>
              <ListItemButton sx={{ pl: 4 }}>
                <ListItemIcon>
                  <Article />
                </ListItemIcon>
                <ListItemText primary="Forsage.bcql" />
              </ListItemButton>
              <ListItemButton sx={{ pl: 4 }}>
                <ListItemIcon>
                  <Article />
                </ListItemIcon>
                <ListItemText primary="Forsage2.bcql" />
              </ListItemButton>
              <ListItemButton sx={{ pl: 4 }}>
                <ListItemIcon>
                  <Article />
                </ListItemIcon>
                <ListItemText primary="Forsage3.bcql" />
              </ListItemButton>
            </List>
          </Collapse>
        </List>
      </Box>
    );
  };

  return (
    <Sidebar content={<FileList />} anchor="left" drawerWidth={drawerWidth} />
  );
}

export default FileListSidebar;
