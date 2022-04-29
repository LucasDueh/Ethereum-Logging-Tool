import React from 'react';
import PropTypes from 'prop-types';
import { Box, Stack, Divider, Typography, Paper } from '@mui/material';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function Terminal(props: any) {
  const { name, output } = props;

  const terminal = React.useRef<typeof Box>(null);

  React.useEffect(() => {
    if (terminal.current) {
      // eslint-disable-next-line @typescript-eslint/ban-ts-comment
      // @ts-ignore
      terminal.current.scrollTop = terminal.current.scrollHeight;
    }
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [output]);

  return (
    <Paper
      sx={{ py: 0.5, height: '100%', width: '100%', overflowY: 'auto' }}
      variant="outlined"
      square
    >
      <Stack sx={{ height: '100%' }}>
        <Typography sx={{ px: 1 }} variant="body2">
          TERMINAL (${name})
        </Typography>
        <Divider />
        <Box
          ref={terminal}
          sx={{
            p: 1,
            height: '100%',
            overflowY: 'auto',
          }}
        >
          {output.map((out: string, index: number) => {
            return (
              <Typography key={[out, index].join('')} fontSize={12}>
                {out}
              </Typography>
            );
          })}
        </Box>
      </Stack>
    </Paper>
  );
}

Terminal.propTypes = {
  name: PropTypes.string.isRequired,
  output: PropTypes.arrayOf(PropTypes.string).isRequired,
};

export default Terminal;
