import React, { PropTypes } from 'react';

const VegetableTile = ({ vegetable }) => (
  <div>
    {vegetable.name}
  </div>
);

VegetableTile.propTypes = {
  vegetable: PropTypes.object
};

export default VegetableTile;
