import {
  Typography,
  Accordion,
  AccordionSummary,
  AccordionDetails,
  Stack,
} from '@mui/material';

import PropTypes from 'prop-types';
import ExpandMoreIcon from '@mui/icons-material/ExpandMore';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function CodeBlockAccordion(props: any) {
  const { type, name, children } = props;

  return (
    <Accordion disableGutters sx={{ backgroundColor: 'rgba(0, 0, 0, .03)' }}>
      <AccordionSummary expandIcon={<ExpandMoreIcon />}>
        <Stack direction="row" alignItems="center" spacing={1}>
          <Typography variant="body2">{type}</Typography>
          <Typography>{name}</Typography>
        </Stack>
      </AccordionSummary>
      <AccordionDetails sx={{ p: 0, position: 'relative' }}>
        {children}
      </AccordionDetails>
    </Accordion>
  );
}

CodeBlockAccordion.propTypes = {
  type: PropTypes.string.isRequired,
  name: PropTypes.string.isRequired,
  children: PropTypes.node.isRequired,
};

export default CodeBlockAccordion;
