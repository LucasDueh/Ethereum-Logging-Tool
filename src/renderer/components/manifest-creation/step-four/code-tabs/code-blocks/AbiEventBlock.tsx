import PropTypes from 'prop-types';
import CodeEditor from '../../../../general/code-editor/CodeEditor';
import paramsToString from './util';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function AbiEventBlock(props: any) {
  const { contractAddress, name, inputs, activityName } = props;

  const code = () => {
    const inputParameters = paramsToString(inputs);

    return `LOG ENTRIES (${contractAddress})\n\t(${name}(${inputParameters})) {\n\t// Enter your extraction code here\n}`;
  };

  return (
    <CodeEditor
      value={code()}
      readOnly
      maxLines={15}
      highlightActiveLine={false}
    />
  );
}

AbiEventBlock.propTypes = {
  contractAddress: PropTypes.string.isRequired,
  name: PropTypes.string.isRequired,
  inputs: PropTypes.arrayOf(PropTypes.object).isRequired,
  activityName: PropTypes.string.isRequired,
};

export default AbiEventBlock;
