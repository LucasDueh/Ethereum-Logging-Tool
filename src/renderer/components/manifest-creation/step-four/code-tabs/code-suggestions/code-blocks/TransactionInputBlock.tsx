import PropTypes from 'prop-types';
import BaseBlock from './base-block/BaseBlock';
import { paramsToString } from './util';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function TransactionInputBlock(props: any) {
  const { contractAddress, name, inputs } = props;

  const code = () => {
    const inputParameters = paramsToString(inputs, '\t');

    return `TRANSACTION INPUT (${contractAddress}) (\n\t${name}(\n\t\t${inputParameters}\n\t)\n){\n\t// Enter your extraction code here\n}`;
  };

  return <BaseBlock code={code()} />;
}

TransactionInputBlock.propTypes = {
  contractAddress: PropTypes.string.isRequired,
  name: PropTypes.string.isRequired,
  // eslint-disable-next-line react/forbid-prop-types
  inputs: PropTypes.arrayOf(PropTypes.object).isRequired,
};

export default TransactionInputBlock;
