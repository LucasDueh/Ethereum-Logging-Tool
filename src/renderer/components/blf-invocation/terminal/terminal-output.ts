/* eslint-disable @typescript-eslint/no-explicit-any */
export default function reduceToMaxLines(commChannel: Array<string>) {
  const consoleMaxLines = 100;
  const res =
    commChannel.length >= consoleMaxLines
      ? [
          ...commChannel.slice(
            commChannel.length - consoleMaxLines,
            commChannel.length
          ),
        ]
      : [...commChannel];
  return res;
}
