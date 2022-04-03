import PropTypes from 'prop-types';
import { Stack, Box } from '@mui/material';

import { IActivity } from 'types/types';
import AbiTypes from 'renderer/constants/abi-types';
import AbiEventBlock from './code-blocks/AbiEventBlock';
import AbiFunctionBlock from './code-blocks/AbiFunctionBlock';
import AbiDecodableFunctionBlock from './code-blocks/AbiDecodableFunctionBlock';
import CodeBlockAccordion from './CodeBlockAccordion';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function CodeSuggestions(props: any) {
  const { contractAddress, contractActivities } = props;

  return (
    <Stack sx={{ overflow: 'auto' }}>
      {contractActivities.map((activity: IActivity, index: number) => {
        switch (activity.type) {
          case AbiTypes.Event:
            return (
              <CodeBlockAccordion
                key={[activity.name, index].join('')}
                type="Solidity Event Log"
                name={activity.name}
              >
                <AbiEventBlock
                  contractAddress={contractAddress}
                  name={activity.name}
                  inputs={activity.inputs}
                  activityName={activity.activityName}
                />
              </CodeBlockAccordion>
            );
          case AbiTypes.Function:
            return (
              <CodeBlockAccordion
                key={[activity.name, index].join('')}
                type="Public Member Query"
                name={activity.name}
              >
                <AbiFunctionBlock
                  contractAddress={contractAddress}
                  name={activity.name}
                  inputs={activity.inputs}
                  outputs={activity.outputs}
                  activityName={activity.activityName}
                />
              </CodeBlockAccordion>
            );
          case AbiTypes.DecodableFunction:
            return (
              <CodeBlockAccordion
                key={[activity.name, index].join('')}
                type="Transaction Input Decoding"
                name={activity.name}
              >
                <AbiDecodableFunctionBlock
                  contractAddress={contractAddress}
                  name={activity.name}
                  hash={activity.hash}
                  inputs={activity.inputs}
                  activityName={activity.activityName}
                />
              </CodeBlockAccordion>
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
