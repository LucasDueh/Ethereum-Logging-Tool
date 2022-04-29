/* eslint-disable react/forbid-prop-types */
import * as React from 'react';
import PropTypes from 'prop-types';
import Box from '@mui/material/Box';
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableRow from '@mui/material/TableRow';
import Paper from '@mui/material/Paper';
import Checkbox from '@mui/material/Checkbox';

import { IAbiEntry, IActivity } from 'types/types';
import { ITableHeadCell } from './table-types';
import SelectionTableToolbar from './SelectionTableToolbar';
import SelectionTableHead from './SelectionTableHead';
import SelectionTableCell from './SelectionTableCell';

import { getComparator } from './table-util';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function EventSelectionTable(props: any) {
  const { id, rows, selected, handleSelectionChange } = props;

  const [order, setOrder] = React.useState<string>('asc');
  const [orderBy, setOrderBy] = React.useState<string>('name');

  const headCells: Array<ITableHeadCell> = [
    {
      id: 'name',
      numeric: false,
      label: 'Name',
    },
    {
      id: 'type',
      numeric: false,
      label: 'Type',
    },
    {
      id: 'stateMutability',
      numeric: false,
      label: 'State Mutability',
    },
    {
      id: 'inputs',
      numeric: false,
      label: 'Inputs',
    },
    {
      id: 'outputs',
      numeric: false,
      label: 'Outputs',
    },
  ];

  const handleRequestSort = (
    _event: React.ChangeEvent<HTMLInputElement>,
    property: string
  ) => {
    const isAsc = orderBy === property && order === 'asc';
    setOrder(isAsc ? 'desc' : 'asc');
    setOrderBy(property);
  };

  const handleSelectAllClick = (event: React.ChangeEvent<HTMLInputElement>) => {
    if (event.target.checked) {
      const newSelecteds = rows;
      handleSelectionChange(newSelecteds, id);
      return;
    }
    handleSelectionChange([], id);
  };

  const handleClick = (_event: React.MouseEvent, row: IAbiEntry) => {
    const selectedIndex = selected.findIndex(
      (entry: IAbiEntry | IActivity) =>
        entry.name === row.name && entry.type === row.type
    );
    let newSelected: IAbiEntry[] = [];

    if (selectedIndex === -1) {
      newSelected = newSelected.concat(selected, row);
    } else if (selectedIndex === 0) {
      newSelected = newSelected.concat(selected.slice(1));
    } else if (selectedIndex === selected.length - 1) {
      newSelected = newSelected.concat(selected.slice(0, -1));
    } else if (selectedIndex > 0) {
      newSelected = newSelected.concat(
        selected.slice(0, selectedIndex),
        selected.slice(selectedIndex + 1)
      );
    }

    handleSelectionChange(newSelected, id);
  };

  const isSelected = (row: IAbiEntry) =>
    selected.filter(
      (entry: IAbiEntry | IActivity) =>
        entry.name === row.name && entry.type === row.type
    ).length > 0;

  return (
    <Box sx={{ width: '100%' }}>
      <Paper sx={{ width: '100%', mb: 2 }} variant="outlined" elevation={0}>
        <SelectionTableToolbar title="ABI Entries" />
        <TableContainer>
          <Table sx={{ minWidth: 600 }} size="small" padding="none">
            <SelectionTableHead
              headCells={headCells}
              numSelected={selected.length}
              order={order}
              orderBy={orderBy}
              onSelectAllClick={handleSelectAllClick}
              onRequestSort={handleRequestSort}
              rowCount={rows.length}
            />
            <TableBody>
              {rows
                .slice()
                .sort(getComparator(order, orderBy))
                .map((row: IAbiEntry, index: number) => {
                  const isItemSelected = isSelected(row);
                  console.log(selected);

                  return (
                    <TableRow
                      hover
                      onClick={(event) => handleClick(event, row)}
                      role="checkbox"
                      tabIndex={-1}
                      key={[row.name, index].join()}
                      selected={isItemSelected}
                    >
                      <TableCell padding="checkbox">
                        <Checkbox color="primary" checked={isItemSelected} />
                      </TableCell>

                      <SelectionTableCell data={row.name} />
                      <SelectionTableCell data={row.type} />
                      <SelectionTableCell data={row.stateMutability} />
                      <SelectionTableCell data={row.inputs} />
                      <SelectionTableCell data={row.outputs} />
                    </TableRow>
                  );
                })}
            </TableBody>
          </Table>
        </TableContainer>
      </Paper>
    </Box>
  );
}

EventSelectionTable.propTypes = {
  id: PropTypes.number.isRequired,
  rows: PropTypes.arrayOf(PropTypes.object).isRequired,
  selected: PropTypes.arrayOf(PropTypes.object).isRequired,
  handleSelectionChange: PropTypes.func.isRequired,
};

export default EventSelectionTable;
