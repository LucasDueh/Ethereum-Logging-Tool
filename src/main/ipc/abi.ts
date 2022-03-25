/* eslint-disable no-console */
import { ipcMain } from 'electron';
import { IAbiEntry, IActivity } from 'types/types';
import reduceAbiToJson from './util/abi-reducer';
import hashFunction from './util/function-hasher';

const reduceAbi = (input: string) => {
  const abi: string = input;

  if (abi === '') return null;

  const abiEntriesJson = reduceAbiToJson(abi);
  return abiEntriesJson;
};

const transformAbiToActivities = (abiEntries: Array<IAbiEntry>) => {
  const activites: Array<IActivity> = [];

  abiEntries.forEach((entry) => {
    let keccak256Hash;
    if (entry.type === 'function') {
      keccak256Hash = hashFunction(entry);
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
