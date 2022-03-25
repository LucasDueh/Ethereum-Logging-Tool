import PropTypes from 'prop-types';

// eslint-disable-next-line @typescript-eslint/no-explicit-any
function StepThree(props: any) {
  const { contracts } = props;
  return <>{console.log(contracts)}</>;
}

StepThree.propTypes = {
  contracts: PropTypes.arrayOf(PropTypes.object).isRequired,
};

export default StepThree;
