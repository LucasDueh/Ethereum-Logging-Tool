import PropTypes from 'prop-types';
import { Stack, Card, CardContent, TextField } from '@mui/material';

import { EmissionMode, ConnectionMode } from '../../../constants/settings';

import SelectInput from './SelectInput';
import StepInstructions from '../StepInstructions';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function StepThree(props: any) {
  const { formId, settings, setSettings, handleSubmit } = props;

  return (
    <form id={formId} onSubmit={handleSubmit}>
      <Stack spacing={1} justifyContent="space-between" alignItems="stretch">
        <StepInstructions
          heading="Choose Mandatory Settings for the Extraction"
          details="The extraction behaviour is controlled through the options set here."
        />

        <Card>
          <CardContent>
            <Stack style={{ width: '100%' }} spacing={4}>
              <Stack direction="row">
                <TextField
                  sx={{ mr: 2 }}
                  value={settings.blockScopeFrom}
                  name="blockScopeFrom"
                  label="From Block"
                  helperText="Specify the starting block of the block scope."
                  onChange={(event: React.ChangeEvent<HTMLInputElement>) => {
                    setSettings(event, false);
                  }}
                  fullWidth
                />

                <TextField
                  value={settings.blockScopeTo}
                  name="blockScopeTo"
                  label="To"
                  helperText="Specify the end block of the block scope."
                  onChange={(event: React.ChangeEvent<HTMLInputElement>) => {
                    setSettings(event, false);
                  }}
                  fullWidth
                />
              </Stack>

              <SelectInput
                items={{ true: 'true', false: 'false' }}
                name="abortOnException"
                label="Abort On Exception"
                value={settings.abortOnException ? 'true' : 'false'}
                helperText="By default, the BLF will not abort when encountering an exception. It will instead try to carry on the rest of its work as best as it can. Let's say you are analyzing 1000 blocks of a blockchain. Just because there was an error extracting information from one block, the BLF might still be able to extract information from the rest of them. If you instead want it to directly abort the mission with an error code, you can set this option to true."
                onChange={(event: React.ChangeEvent<HTMLSelectElement>) => {
                  setSettings(event, true);
                }}
              />

              <SelectInput
                items={EmissionMode}
                name="emissionMode"
                label="Emission Mode"
                value={settings.emissionMode}
                helperText="Normally, the BLF will output all of its extracted data at once at the very end of the currently running extraction. This emission mode is called default batching. It can however be a bit inconvenient to not have any partially extracted data from a run when the BLF fails before it finished, especially when ABORT ON EXCEPTION is set. The second emission mode therefore is safe batching, which will output the information that it has extracted up to this point at the end of each analyzed block. The data is still all written to one big file, like in default batching. The third emission mode is the streaming mode. This mode behaves similar to the safe batching mode in that it writes the currently gathered data after each block is analyzed. But instead of writing everything to one file, it will create one output file for each block."
                onChange={(event: React.ChangeEvent<HTMLSelectElement>) => {
                  setSettings(event, false);
                }}
              />

              <SelectInput
                items={ConnectionMode}
                name="connectionMode"
                label="Connection Mode"
                value={settings.connectionMode}
                helperText="All you need is a running node in the Ethereum network, to which you have access either through its websocket port or through an ipc socket."
                onChange={(event: React.ChangeEvent<HTMLSelectElement>) => {
                  setSettings(event, false);
                }}
              />

              <TextField
                value={settings.connection}
                name="connection"
                label="Connection"
                helperText="Specify the connection here (e.g.: ws://localhost:8546/ for websockets, or: /path/to/geth.ipc, for ipc sockets)."
                onChange={(event: React.ChangeEvent<HTMLInputElement>) => {
                  setSettings(event, false);
                }}
                fullWidth
              />
            </Stack>
          </CardContent>
        </Card>
      </Stack>
    </form>
  );
}

StepThree.propTypes = {
  formId: PropTypes.string.isRequired,
  // eslint-disable-next-line react/forbid-prop-types
  settings: PropTypes.object.isRequired,
  setSettings: PropTypes.func.isRequired,
  handleSubmit: PropTypes.func.isRequired,
};

export default StepThree;
