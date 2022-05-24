import * as React from 'react';
import PropTypes from 'prop-types';
import { Tabs, Tab } from '@mui/material';
import { IContract } from 'types/types';

// eslint-disable-next-line @typescript-eslint/naming-convention
import _ from 'lodash';

import TabPanel from '../../../general/tab-panel/TabPanel';
import CodeSuggestions from './code-suggestions/CodeSuggestions';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function CodeTabs(props: any) {
  const { contracts } = props;

  const [selectedTab, setSelectedTab] = React.useState(0);

  const handleTabChange = (_event: React.SyntheticEvent, newTab: number) => {
    setSelectedTab(newTab);
  };

  return (
    <>
      <Tabs
        value={selectedTab}
        onChange={handleTabChange}
        variant="scrollable"
        scrollButtons="auto"
      >
        {contracts.map((contract: IContract, index: number) => {
          return (
            <Tab
              sx={{ textTransform: 'none' }}
              key={[contract.address, index.toString()].join('')}
              label={contract.name}
            />
          );
        })}
      </Tabs>
      {contracts.map((contract: IContract, index: number) => {
        return (
          <TabPanel
            key={[contract.address, index.toString()].join('')}
            value={selectedTab}
            index={index}
          >
            <CodeSuggestions
              contractAddress={contract.address}
              contractActivities={contract.activities}
            />
          </TabPanel>
        );
      })}
    </>
  );
}

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function areEqual(prevProps: any, nextProps: any) {
  if (_.isEqual(prevProps.contracts, nextProps.contracts)) {
    return true;
  }
  return false;
}

CodeTabs.propTypes = {
  // eslint-disable-next-line react/forbid-prop-types
  contracts: PropTypes.arrayOf(PropTypes.object).isRequired,
};

export default React.memo(CodeTabs, areEqual);
