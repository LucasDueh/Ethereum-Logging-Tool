import {
  Typography,
  Accordion,
  AccordionSummary,
  AccordionDetails,
} from '@mui/material';

import PropTypes from 'prop-types';
import ExpandMoreIcon from '@mui/icons-material/ExpandMore';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function CodeBlockAccordion(props: any) {
  const { name, children } = props;

  return (
    <Accordion disableGutters sx={{ backgroundColor: 'rgba(0, 0, 0, .03)' }}>
      <AccordionSummary expandIcon={<ExpandMoreIcon />}>
        <Typography>{name}</Typography>
      </AccordionSummary>
      <AccordionDetails sx={{ p: 0, position: 'relative' }}>
        {children}
      </AccordionDetails>
    </Accordion>
  );
}

CodeBlockAccordion.propTypes = {
  name: PropTypes.string.isRequired,
  children: PropTypes.node.isRequired,
};

export default CodeBlockAccordion;
