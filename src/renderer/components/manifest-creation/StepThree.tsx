import PropTypes from 'prop-types';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function StepThree(props: any) {
  const { activities } = props;
  return <>{console.log(activities)}</>;
}

StepThree.propTypes = {
  activities: PropTypes.arrayOf(PropTypes.object).isRequired,
};

export default StepThree;
