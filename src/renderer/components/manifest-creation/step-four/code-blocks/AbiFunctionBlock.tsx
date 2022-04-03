import PropTypes from 'prop-types';
import CodeEditor from '../../../code-editor/CodeEditor';
import paramsToString from './util';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function AbiFunctionBlock(props: any) {
  const { contractAddress, name, inputs, outputs, activityName } = props;

  const code = () => {
    const inputParameters = paramsToString(inputs);
    const outputParameters = paramsToString(outputs);

    return `SMART CONTRACT (${contractAddress})\n\t(${outputParameters} = ${name}(${inputParameters})) {\n\t// Enter your extraction code here\n}`;
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

AbiFunctionBlock.propTypes = {
  contractAddress: PropTypes.string.isRequired,
  name: PropTypes.string.isRequired,
  inputs: PropTypes.arrayOf(PropTypes.object).isRequired,
  outputs: PropTypes.arrayOf(PropTypes.object).isRequired,
  activityName: PropTypes.string.isRequired,
};

export default AbiFunctionBlock;
