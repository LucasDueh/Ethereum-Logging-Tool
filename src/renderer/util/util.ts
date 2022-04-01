async function asyncForEach<Type>(
  array: Array<Type>,
  callback: (arg0: Type, arg1: number, arg2: Array<Type>) => void
) {
  for (let index = 0; index < array.length; index += 1) {
    // eslint-disable-next-line no-await-in-loop
    await callback(array[index], index, array);
  }
}

export default asyncForEach;
