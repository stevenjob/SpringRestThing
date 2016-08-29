import React, { Component, PropTypes } from 'react';
import VegetableTile from './VegetableTile';
import './VegetableGrid.css';

class VegetableGrid extends Component {

  componentDidMount() {
    this.props.requestVegetables();
  }

  render() {
    const { vegetables } = this.props;
    if (!vegetables) {
      return (<div className="no-vegetable-grid">No Vegetables</div>);
    }

    const vegetableTiles = this.props.vegetables.map((vegetable) => (<VegetableTile vegetable={vegetable} />));

    return (
      <div className="vegetable-grid">
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
