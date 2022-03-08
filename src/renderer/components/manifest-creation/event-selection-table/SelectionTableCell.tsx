import PropTypes from 'prop-types';
import TableCell from '@mui/material/TableCell';
import Box from '@mui/material/Box';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function SelectionTableCell(props: any) {
  const { data } = props;

  return (
    <TableCell align="left" sx={{ fontSize: '0.9rem' }}>
      {!Array.isArray(data)
        ? data
        : // eslint-disable-next-line @typescript-eslint/no-explicit-any
          data.map((element: any) => {
            return (
              <Box key={element.name}>
                {element.name}: {element.type}
              </Box>
            );
          })}
    </TableCell>
  );
}

SelectionTableCell.propTypes = {
  data: PropTypes.oneOfType([
    PropTypes.string,
    PropTypes.number,
    PropTypes.array,
  ]).isRequired,
};

export default SelectionTableCell;
