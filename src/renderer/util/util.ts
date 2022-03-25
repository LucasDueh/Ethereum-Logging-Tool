async function asyncForEach(
  array: Array<unknown>,
  callback: (arg0: unknown, arg1: number, arg2: Array<unknown>) => void
) {
  for (let index = 0; index < array.length; index += 1) {
    // eslint-disable-next-line no-await-in-loop
    await callback(array[index], index, array);
  }
}

export default asyncForEach;
