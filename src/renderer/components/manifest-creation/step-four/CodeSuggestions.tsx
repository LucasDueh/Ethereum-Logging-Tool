import PropTypes from 'prop-types';
import { Stack, Box } from '@mui/material';

import { IActivity } from 'types/types';
import AbiTypes from 'renderer/constants/abi-types';
import AbiEventBlock from './code-blocks/AbiEventBlock';
import AbiFunctionBlock from './code-blocks/AbiFunctionBlock';
import AbiDecodableFunctionBlock from './code-blocks/AbiDecodableFunctionBlock';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function CodeSuggestions(props: any) {
  const { contractAddress, contractActivities } = props;

  return (
    <Stack spacing={1} sx={{ overflow: 'auto' }}>
      {contractActivities.map((activity: IActivity) => {
        switch (activity.type) {
          case AbiTypes.Event:
            return (
              <AbiEventBlock
                contractAddress={contractAddress}
                name={activity.name}
                inputs={activity.inputs}
                activityName={activity.activityName}
              />
            );
          case AbiTypes.Function:
            return (
              <AbiFunctionBlock
                contractAddress={contractAddress}
                name={activity.name}
                inputs={activity.inputs}
                outputs={activity.outputs}
                activityName={activity.activityName}
              />
            );
          case AbiTypes.DecodableFunction:
            return (
              <AbiDecodableFunctionBlock
                contractAddress={contractAddress}
                name={activity.name}
                inputs={activity.inputs}
                activityName={activity.activityName}
              />
            );
          default:
            return <Box />;
        }
      })}
    </Stack>
  );
}

CodeSuggestions.propTypes = {
  contractAddress: PropTypes.string.isRequired,
  contractActivities: PropTypes.arrayOf(PropTypes.object).isRequired,
};

export default CodeSuggestions;
