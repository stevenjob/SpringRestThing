import { connect } from 'react-redux';
import VegetableGrid from './VegetableGrid';
import { requestVegetables } from 'actions/vegetable';

const mapStateToProps = ({ vegetables }) => ({
  vegetables
});

export default connect(mapStateToProps, { requestVegetables })(VegetableGrid);
