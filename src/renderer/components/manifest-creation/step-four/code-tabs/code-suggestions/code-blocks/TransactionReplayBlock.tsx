import PropTypes from 'prop-types';
import BaseBlock from './base-block/BaseBlock';
import { paramsToString } from './util';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function TransactionReplayBlock(props: any) {
  const { outputs } = props;

  const code = () => {
    const inputParameters = paramsToString(outputs);

    return `TRANSACTION REPLAY (\n\t${inputParameters}\n){\n\t// Enter your extraction code here\n}`;
  };

  return <BaseBlock code={code()} />;
}

TransactionReplayBlock.propTypes = {
  // eslint-disable-next-line react/forbid-prop-types
  outputs: PropTypes.arrayOf(PropTypes.object).isRequired,
};

export default TransactionReplayBlock;
