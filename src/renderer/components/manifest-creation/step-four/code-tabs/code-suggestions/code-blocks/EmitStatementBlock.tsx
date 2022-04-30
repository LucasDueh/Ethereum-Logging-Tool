import PropTypes from 'prop-types';
import { Box } from '@mui/material';
import CodeEditor from '../../../../../general/code-editor/CodeEditor';
import { xesEventAttributes } from './util';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function EmitStatementBlock(props: any) {
  const { name, parameters, activityName } = props;

  const code = () => {
    const xesAttributes = xesEventAttributes(activityName, parameters);

    return `EMIT XES EVENT (pid) (piid) (eid) (\n\t${xesAttributes}\n)`;
  };

  return (
    <Box sx={{ position: 'relative' }}>
      <CodeEditor
        value={code()}
        readOnly
        maxLines={15}
        highlightActiveLine={false}
      />
    </Box>
  );
}

EmitStatementBlock.propTypes = {
  name: PropTypes.string.isRequired,
  // eslint-disable-next-line react/forbid-prop-types
  parameters: PropTypes.arrayOf(PropTypes.object).isRequired,
  activityName: PropTypes.string.isRequired,
};

export default EmitStatementBlock;
