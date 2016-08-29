import React, { Component, PropTypes } from 'react';
import './VegetableView.css';

class VegetableView extends Component {

  componentDidMount() {
    const { vegetable } = this.props;
    if (!vegetable) {
      this.props.requestVegetable();
    }
  }

  render() {
    const { vegetable } = this.props;
    if (!vegetable) {
      return (
        <div>
          Loading ...
        </div>
      );
    }

    return (
      <div className="vegetable-view">
        <div className="vegetable-name">
          {vegetable.name}
        </div>
        <div className="vegetable-description">
          {vegetable.description}
        </div>
      </div>
    );
  }
}

VegetableView.propTypes = {
  vegetable: PropTypes.object,
  requestVegetable: PropTypes.func.isRequired
};

export default VegetableView;
