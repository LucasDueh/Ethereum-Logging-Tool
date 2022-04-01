import PropTypes from 'prop-types';
import { MenuItem, TextField } from '@mui/material';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function SelectInput(props: any) {
  const { items, name, label, value, helperText, onChange } = props;

  return (
    <TextField
      select
      name={name}
      value={value}
      label={label}
      onChange={onChange}
      helperText={helperText}
      fullWidth
    >
      {
        // eslint-disable-next-line @typescript-eslint/no-explicit-any
        Object.values(items).map((entry: any) => {
          return (
            <MenuItem key={entry} value={entry}>
              {entry}
            </MenuItem>
          );
        })
      }
    </TextField>
  );
}

SelectInput.propTypes = {
  // eslint-disable-next-line react/forbid-prop-types
  items: PropTypes.object.isRequired,
  name: PropTypes.string.isRequired,
  label: PropTypes.string.isRequired,
  value: PropTypes.string.isRequired,
  helperText: PropTypes.string.isRequired,
  onChange: PropTypes.func.isRequired,
};

export default SelectInput;
