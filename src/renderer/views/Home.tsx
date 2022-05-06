import { Stack, Button } from '@mui/material';
import { Link } from 'react-router-dom';
import NodeAddIcon from '@mui/icons-material/NoteAdd';
import OutputIcon from '@mui/icons-material/Output';

function Home() {
  return (
    <Stack
      sx={{ height: '100%', width: '100%' }}
      direction="row"
      justifyContent="center"
      alignItems="center"
      spacing={2}
    >
      <Link style={{ textDecoration: 'none' }} to="/manifest-creation">
        <Button
          sx={{ height: '15vh', width: '25vw', fontSize: '20px' }}
          variant="contained"
          startIcon={<NodeAddIcon />}
        >
          New Manifest
        </Button>
      </Link>
      <Link style={{ textDecoration: 'none' }} to="/data-extraction">
        <Button
          sx={{ height: '15vh', width: '25vw', fontSize: '20px' }}
          variant="contained"
          startIcon={<OutputIcon />}
        >
          Extract Data
        </Button>
      </Link>
    </Stack>
  );
}

export default Home;
