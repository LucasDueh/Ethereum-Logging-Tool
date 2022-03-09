import {
  List,
  ListItem,
  ListItemIcon,
  ListItemText,
  Divider,
} from '@mui/material';
import { Home, Subject, NoteAdd } from '@mui/icons-material';
import { Link } from 'react-router-dom';

import Sidebar from './general/Sidebar';

function NavSidebar() {
  const NavLinks = () => {
    return (
      <>
        <List>
          <Link style={{ textDecoration: 'none' }} to="/">
            <ListItem button key="Home">
              <ListItemIcon>
                <Home />
              </ListItemIcon>
              <ListItemText primary="Home" />
            </ListItem>
          </Link>
        </List>
        <Divider />
        <List>
          <Link style={{ textDecoration: 'none' }} to="/manifest-list">
            <ListItem button key="Manifests">
              <ListItemIcon>
                <Subject />
              </ListItemIcon>
              <ListItemText primary="Manifests" />
            </ListItem>
          </Link>
          <Link style={{ textDecoration: 'none' }} to="/manifest-creation">
            <ListItem button key="Create Manifest">
              <ListItemIcon>
                <NoteAdd />
              </ListItemIcon>
              <ListItemText primary="Create Manifest" />
            </ListItem>
          </Link>
        </List>
      </>
    );
  };

  return <Sidebar content={<NavLinks />} anchor="left" drawerWidth={240} />;
}

export default NavSidebar;
