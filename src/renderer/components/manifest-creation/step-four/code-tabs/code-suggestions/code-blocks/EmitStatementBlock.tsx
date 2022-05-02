import PropTypes from 'prop-types';
import { xesEventAttributes } from './util';
import BaseBlock from './base-block/BaseBlock';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function EmitStatementBlock(props: any) {
  const { parameters, activityName } = props;

  const code = () => {
    const xesAttributes = xesEventAttributes(activityName, parameters);

    return `EMIT XES EVENT (pid)(piid)(eid)(\n\t${xesAttributes}\n);`;
  };

  return <BaseBlock code={code()} />;
}

EmitStatementBlock.propTypes = {
  // eslint-disable-next-line react/forbid-prop-types
  parameters: PropTypes.arrayOf(PropTypes.object).isRequired,
  activityName: PropTypes.string.isRequired,
};

export default EmitStatementBlock;
