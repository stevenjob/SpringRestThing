import { connect } from 'react-redux';
import { bindActionCreators } from 'redux';
import VegetableView from './VegetableView';
import { getVegetableByName } from 'selectors/vegetables';

import { requestVegetable } from 'actions/vegetable';

const mapStateToProps = (state, { params }) => ({
  vegetable: getVegetableByName(state, params.vegetableName)
});


const mapDispatchToProps = (dispatch, { params }) => ({
  requestVegetable: () => (bindActionCreators(requestVegetable, dispatch)(params.vegetableName))
});

export default connect(mapStateToProps, mapDispatchToProps)(VegetableView);
