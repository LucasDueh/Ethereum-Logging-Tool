/* eslint-disable no-console */
import { ipcMain } from 'electron';
import { ABIEntry, Activity } from 'types/types';
import reduceABI from './util/abi-reducer';
import hashFunction from './util/function-hasher';

const getABI = (input: string) => {
  if (input === '') return null;

  const abi: string = input;

  const entries = reduceABI(abi);
  return entries;
};

const transformABIToActivities = (abiEntries: Array<ABIEntry>) => {
  const activites: Array<Activity> = [];

  abiEntries.forEach((entry) => {
    let keccak256Hash;
    if (entry.type === 'function') {
      keccak256Hash = hashFunction(entry);
    } else {
      keccak256Hash = null;
    }

    const activity: Activity = {
      ...entry,
      hash: keccak256Hash,
      activityName: entry.name,
    };
    activites.push(activity);
  });

  return activites;
};

module.exports = {
  getABI: ipcMain.handle('get-abi', async (_event, input) => {
    console.log('Reducing Solidity ABI');
    return getABI(input);
  }),
  transformABIToActivities: ipcMain.handle(
    'transform-abi-to-activities',
    async (_event, abiEntries) => {
      console.log('Transforming ABI to Activities');
      return transformABIToActivities(abiEntries);
    }
  ),
};
