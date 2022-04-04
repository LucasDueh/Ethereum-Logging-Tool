/* eslint-disable no-console */
import { app } from 'electron';
import path from 'path';

import { writeFile, mkdir, access } from 'fs/promises';
import { constants } from 'fs';

import { v4 as uuidv4 } from 'uuid';

const dailyTempFolderUri = () => {
  return path.join('temp-manifests', String(new Date().toJSON().slice(0, 10)));
};

const writeTempManifest = async (content: string) => {
  const tempFolderPath = path.join(app.getPath('userData'), 'temp-manifests');

  try {
    await access(tempFolderPath, constants.F_OK);
  } catch {
    await mkdir(tempFolderPath);
  }

  const dailyTempFolderPath = path.join(
    app.getPath('userData'),
    dailyTempFolderUri()
  );

  try {
    await access(dailyTempFolderPath, constants.F_OK);
  } catch {
    await mkdir(dailyTempFolderPath);
  }

  const fileName = `${uuidv4()}.bcql`;
  const filePath = path.join(dailyTempFolderPath, fileName);

  return writeFile(filePath, content).then(() => fileName);
};

export { dailyTempFolderUri, writeTempManifest };
