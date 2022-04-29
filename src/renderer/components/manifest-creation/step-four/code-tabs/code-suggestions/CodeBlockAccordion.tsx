import {
  Typography,
  Accordion,
  AccordionSummary,
  AccordionDetails,
  Grid,
} from '@mui/material';

import PropTypes from 'prop-types';
import ExpandMoreIcon from '@mui/icons-material/ExpandMore';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function CodeBlockAccordion(props: any) {
  const { type, name, children } = props;

  return (
    <Accordion disableGutters sx={{ backgroundColor: 'rgba(0, 0, 0, .02)' }}>
      <AccordionSummary expandIcon={<ExpandMoreIcon />}>
        <Grid
          container
          direction="row"
          alignItems="center"
          justifyContent="flex-start"
          spacing={1}
        >
          <Grid item xs={5}>
            <Typography sx={{ fontSize: 13 }} variant="body2">
              {type}
            </Typography>
          </Grid>

          <Grid item xs={7}>
            <Typography noWrap sx={{ fontSize: 15 }}>
              {name}
            </Typography>
          </Grid>
        </Grid>
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
