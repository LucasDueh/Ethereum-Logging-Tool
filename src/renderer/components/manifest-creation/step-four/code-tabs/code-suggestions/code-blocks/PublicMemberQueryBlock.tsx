/* eslint-disable react/forbid-prop-types */
import PropTypes from 'prop-types';
import BaseBlock from './base-block/BaseBlock';
import { paramsToString } from './util';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function PublicQueryBlock(props: any) {
  const { contractAddress, name, inputs, outputs } = props;

  const code = () => {
    const inputParameters = paramsToString(inputs, '\t');
    const outputParameters = paramsToString(outputs);
    const inputString = inputs.length > 0 ? `\n\t\t${inputParameters}\n\t` : '';
    return `SMART CONTRACT (0) (${contractAddress}) (\n\t${outputParameters} = ${name}(${inputString})\n){\n\t// Enter your extraction code here\n}`;
  };

  return <BaseBlock code={code()} />;
}

PublicQueryBlock.propTypes = {
  contractAddress: PropTypes.string.isRequired,
  name: PropTypes.string.isRequired,
  inputs: PropTypes.arrayOf(PropTypes.object).isRequired,
  outputs: PropTypes.arrayOf(PropTypes.object).isRequired,
};

export default PublicQueryBlock;
