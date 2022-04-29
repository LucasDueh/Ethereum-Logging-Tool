/* eslint-disable react/forbid-prop-types */
import PropTypes from 'prop-types';
import CodeEditor from '../../../../../general/code-editor/CodeEditor';
import paramsToString from './util';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function AbiPublicQueryBlock(props: any) {
  const { contractAddress, name, inputs, outputs, activityName } = props;

  const code = () => {
    const inputParameters = paramsToString(inputs, '\t');
    const outputParameters = paramsToString(outputs);

    return `SMART CONTRACT (0) (${contractAddress}) (\n\t${outputParameters} = ${name}(\n\t\t${inputParameters}\n\t)\n){\n\t// Enter your extraction code here\n}`;
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

AbiPublicQueryBlock.propTypes = {
  contractAddress: PropTypes.string.isRequired,
  name: PropTypes.string.isRequired,
  inputs: PropTypes.arrayOf(PropTypes.object).isRequired,
  outputs: PropTypes.arrayOf(PropTypes.object).isRequired,
  activityName: PropTypes.string.isRequired,
};

export default AbiPublicQueryBlock;
