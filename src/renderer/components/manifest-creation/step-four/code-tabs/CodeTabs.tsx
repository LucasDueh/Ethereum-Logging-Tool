import * as React from 'react';
import PropTypes from 'prop-types';
import { Tabs, Tab } from '@mui/material';
import { IContract } from 'types/types';

import TabPanel from '../../../general/TabPanel';
import CodeSuggestions from './CodeSuggestions';

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
              key={[contract.address, index.toString()].join('')}
              label={`Contract ${index + 1}`}
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

CodeTabs.propTypes = {
  contracts: PropTypes.arrayOf(PropTypes.object).isRequired,
};

export default CodeTabs;
