/* eslint-disable no-console */
import { ipcMain } from 'electron';
import { IAbiEntry, IActivity } from 'types/types';

import reduceAbiToJson from './abi-reducer';
import AbiTypes from './abi-types';
import hashFunction from './function-hasher';

const reduceAbi = (input: string) => {
  const abiEntriesJson = reduceAbiToJson(input);
  return abiEntriesJson;
};

const transformAbiToActivities = (abiEntries: Array<IAbiEntry>) => {
  const activites: Array<IActivity> = [];

  abiEntries.forEach((entry) => {
    let keccak256Hash;

    // If a an abi entry of type function has input parameters
    // it can be seen as a function as well as a decodable function
    if (entry.type === AbiTypes.Function && entry.inputs.length > 0) {
      keccak256Hash = hashFunction(entry);
      const type = AbiTypes.DecodableFunction;

      const activity: IActivity = {
        ...entry,
        hash: keccak256Hash,
        activityName: entry.name,
      };
      activity.type = type;
      activites.push(activity);
    } else {
      keccak256Hash = null;
    }

    const activity: IActivity = {
      ...entry,
      hash: keccak256Hash,
      activityName: entry.name,
    };
    activites.push(activity);
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
