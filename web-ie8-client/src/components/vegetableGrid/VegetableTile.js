import React, { PropTypes } from 'react';
import { Link } from 'react-router';

const VegetableTile = ({ vegetable }) => (
  <div className="vegetable-grid-item">
    <div className="link-container">
      <Link
        className="link"
        to={`/${vegetable.name}`}
      >
        {vegetable.name}
      </Link>
    </div>
  </div>
);

VegetableTile.propTypes = {
  vegetable: PropTypes.object
};

export default VegetableTile;
