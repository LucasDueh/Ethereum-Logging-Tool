/* eslint-disable no-console */
import { ipcMain } from 'electron';
import { IAbiEntry, IActivity } from 'types/types';

import reduceAbiToJson from './abi-reducer';
import { AbiTypes, AccessorTypes } from './abi-types';
import hashFunction from './function-hasher';

const reduceAbi = (input: string) => {
  const abiEntriesJson = reduceAbiToJson(input);
  return abiEntriesJson;
};

const transformAbiToActivities = (abiEntries: Array<IAbiEntry>) => {
  const activites: Array<IActivity> = [];

  abiEntries.forEach((entry) => {
    // If an abi entry of type function has input parameters
    // it is seen as a decodable function that could be part of tx.input
    if (entry.type === AbiTypes.Function && entry.inputs.length > 0) {
      const keccak256Hash = hashFunction(entry);

      const activity: IActivity = {
        ...entry,
        hash: keccak256Hash,
        activityName: entry.name,
        accessorType: AccessorTypes.DecodableFunctionInput,
      };
      activites.push(activity);
    }

    // An abi entry of type function is seen as a query-able function
    // only if it has output parameters
    if (entry.type === AbiTypes.Function && entry.outputs.length > 0) {
      const activity: IActivity = {
        ...entry,
        activityName: entry.name,
        accessorType: AccessorTypes.PublicMemberQuery,
      };
      activites.push(activity);
    }

    if (entry.type === AbiTypes.Event) {
      const activity: IActivity = {
        ...entry,
        activityName: entry.name,
        accessorType: AccessorTypes.EventLog,
      };
      activites.push(activity);
    }
  });

  return activites;
};

module.exports = {
  reduceAbi: ipcMain.handle('reduce-abi', async (_event, input) => {
    console.log('Reducing Solidity ABI');
    return reduceAbi(input);
  }),
  transformAbiToActivities: ipcMain.handle(
    'transform-abi-to-activities',
    async (_event, abiEntries) => {
      console.log('Transforming ABI to Activities');
      return transformAbiToActivities(abiEntries);
    }
  ),
};
