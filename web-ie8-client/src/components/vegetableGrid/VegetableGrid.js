import React, { Component, PropTypes } from 'react';
import VegetableTile from './VegetableTile';

class VegetableGrid extends Component {

  componentDidMount() {
    this.props.requestVegetables();
  }

  render() {
    const { vegetables } = this.props;
    if (!vegetables) {
      return (<div>No Vegetables</div>);
    }

    const vegetableTiles = this.props.vegetables.map((vegetable) => (<VegetableTile vegetable={vegetable} />));

    return (
      <div>
        {vegetableTiles}
      </div>
    );
  }
}

VegetableGrid.propTypes = {
  vegetables: PropTypes.array,
  requestVegetables: PropTypes.func.isRequired
};

export default VegetableGrid;
