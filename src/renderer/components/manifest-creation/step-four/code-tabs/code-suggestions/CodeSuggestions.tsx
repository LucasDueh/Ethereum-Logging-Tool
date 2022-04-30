import PropTypes from 'prop-types';
import { Stack, Box, Divider } from '@mui/material';

import { IActivity } from 'types/types';
import AbiEventBlock from './code-blocks/AbiEventBlock';
import AbiPublicQueryBlock from './code-blocks/AbiPublicQueryBlock';
import AbiDecodableFunctionBlock from './code-blocks/AbiDecodableFunctionBlock';
import EmitStatementBlock from './code-blocks/EmitStatementBlock';
import CodeBlockAccordion from './CodeBlockAccordion';
import { AccessorTypes } from './abi-types';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function CodeSuggestions(props: any) {
  const { contractAddress, contractActivities } = props;

  return (
    <Stack sx={{ overflow: 'hidden' }}>
      {contractActivities.map((activity: IActivity, index: number) => {
        switch (activity.accessorType) {
          case AccessorTypes.EventLog:
            return (
              <CodeBlockAccordion
                key={[activity.name, index].join('')}
                type="Event Log Entry"
                name={activity.name}
              >
                <AbiEventBlock
                  contractAddress={contractAddress}
                  name={activity.name}
                  inputs={activity.inputs}
                  activityName={activity.activityName}
                />
                <Divider />
                <EmitStatementBlock
                  name={activity.name}
                  parameters={activity.inputs}
                  activityName={activity.activityName}
                />
              </CodeBlockAccordion>
            );
          case AccessorTypes.PublicMemberQuery:
            return (
              <CodeBlockAccordion
                key={[activity.name, index].join('')}
                type="Public Member Query"
                name={activity.name}
              >
                <AbiPublicQueryBlock
                  contractAddress={contractAddress}
                  name={activity.name}
                  inputs={activity.inputs}
                  outputs={activity.outputs}
                  activityName={activity.activityName}
                />
                <EmitStatementBlock
                  name={activity.name}
                  parameters={activity.outputs}
                  activityName={activity.activityName}
                />
              </CodeBlockAccordion>
            );
          case AccessorTypes.DecodableFunctionInput:
            return (
              <CodeBlockAccordion
                key={[activity.name, index].join('')}
                type="Transaction Input"
                name={activity.name}
              >
                <AbiDecodableFunctionBlock
                  contractAddress={contractAddress}
                  name={activity.name}
                  hash={activity.hash}
                  inputs={activity.inputs}
                  activityName={activity.activityName}
                />
                <EmitStatementBlock
                  name={activity.name}
                  parameters={activity.inputs}
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
  // eslint-disable-next-line react/forbid-prop-types
  contractActivities: PropTypes.arrayOf(PropTypes.object).isRequired,
};

export default CodeSuggestions;
