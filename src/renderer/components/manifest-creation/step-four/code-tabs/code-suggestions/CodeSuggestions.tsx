import PropTypes from 'prop-types';
import { Stack, Box, Typography } from '@mui/material';

import { IActivity } from 'types/types';
import HelperTooltip from '../../../../general/tooltip/HelperTooltip';
import LogEntryBlock from './code-blocks/LogEntryBlock';
import PublicMemberQueryBlock from './code-blocks/PublicMemberQueryBlock';
import TransactionInputBlock from './code-blocks/TransactionInputBlock';
import TransactionReplayBlock from './code-blocks/TransactionReplayBlock';
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
                <LogEntryBlock
                  contractAddress={contractAddress}
                  name={activity.name}
                  inputs={activity.inputs}
                />
                <EmitStatementBlock
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
                <PublicMemberQueryBlock
                  contractAddress={contractAddress}
                  name={activity.name}
                  inputs={activity.inputs}
                  outputs={activity.outputs}
                />
                <EmitStatementBlock
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
                <TransactionInputBlock
                  contractAddress={contractAddress}
                  name={activity.name}
                  inputs={activity.inputs}
                />
                <EmitStatementBlock
                  parameters={activity.inputs}
                  activityName={activity.activityName}
                />
                {activity.outputs && activity.outputs.length > 0 ? (
                  <Box>
                    <Stack
                      justifyContent="center"
                      alignItems="center"
                      direction="row"
                    >
                      <Typography
                        sx={{ fontSize: 15 }}
                        variant="body2"
                        align="center"
                      >
                        Transaction Output
                      </Typography>
                      <HelperTooltip text="The TRANSACTION REPLAY scope is used to capture the output of the function that was executed as part of the transaction. This scope has to be nested inside the TRANSACTION INPUT scope." />
                    </Stack>

                    <TransactionReplayBlock outputs={activity.outputs} />
                    <EmitStatementBlock
                      parameters={activity.outputs}
                      activityName={activity.activityName}
                    />
                  </Box>
                ) : (
                  <></>
                )}
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
