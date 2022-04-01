import PropTypes from 'prop-types';
import CodeEditor from '../../../code-editor/CodeEditor';
import paramsToString from './util';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function AbiDecodableFunctionBlock(props: any) {
  const { contractAddress, name, hash, inputs, activityName } = props;

  const code = () => {
    const inputParameters = paramsToString(inputs);

    return `DECODE ETH TX INPUT (${contractAddress}) (${inputParameters}) {\n\t// Enter your extraction code here\n}`;
  };

  return <CodeEditor value={code()} readOnly maxLines={4} />;
}

AbiDecodableFunctionBlock.defaultProps = {
  hash: null,
};

AbiDecodableFunctionBlock.propTypes = {
  contractAddress: PropTypes.string.isRequired,
  name: PropTypes.string.isRequired,
  hash: PropTypes.string,
  inputs: PropTypes.arrayOf(PropTypes.object).isRequired,
  activityName: PropTypes.string.isRequired,
};

export default AbiDecodableFunctionBlock;
