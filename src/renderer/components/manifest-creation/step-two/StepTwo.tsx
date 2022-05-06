import * as React from 'react';
import PropTypes from 'prop-types';
import { Stack } from '@mui/material';

import { IAbiEntry, IContract } from 'types/types';
import EventSelectionAccordion from './EventSelectionAccordion';
import StepInstructions from '../step-instructions/StepInstructions';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function StepTwo(props: any) {
  const { formId, contracts, setActivities, handleSubmit } = props;
  const [selected, setSelected] = React.useState<Array<Array<IAbiEntry>>>([]);

  const initSelected: Array<Array<IAbiEntry>> = [];

  React.useEffect(() => {
    contracts.forEach((contract: IContract, index: number) => {
      initSelected.push(new Array<IAbiEntry>());
      if (contract.activities.length > 0) {
        initSelected[index] = contract.activities;
      }
    });
    setSelected(initSelected);
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, []);

  const handleSelectionChange = (
    newSelection: Array<IAbiEntry>,
    id: number
  ) => {
    const updatedSelected = [...selected];
    updatedSelected[id] = newSelection;
    setSelected(updatedSelected);
  };

  const confirmSelection = async (event: React.FormEvent) => {
    event.preventDefault();
    await setActivities(selected);
    handleSubmit(event);
  };

  return (
    <form id={formId} onSubmit={confirmSelection}>
      <Stack
        sx={{ p: 2 }}
        spacing={2}
        justifyContent="flex-start"
        alignItems="stretch"
      >
        <StepInstructions
          heading="Select ABI Entries for Data Extraction"
          details="Every selected function or event can be used to extract data from the blockchain."
        />

        {selected.length === contracts.length ? (
          contracts.map((contract: IContract, index: number) => (
            <EventSelectionAccordion
              key={[contract.address, index.toString()].join('')}
              id={index}
              contractName={contract.name}
              contractAddress={contract.address}
              contractAbi={contract.abiEntries}
              selected={selected[index]}
              handleSelectionChange={handleSelectionChange}
            />
          ))
        ) : (
          <div />
        )}
      </Stack>
    </form>
  );
}

StepTwo.propTypes = {
  formId: PropTypes.string.isRequired,
  // eslint-disable-next-line react/forbid-prop-types
  contracts: PropTypes.arrayOf(PropTypes.object).isRequired,
  setActivities: PropTypes.func.isRequired,
  handleSubmit: PropTypes.func.isRequired,
};

export default StepTwo;
