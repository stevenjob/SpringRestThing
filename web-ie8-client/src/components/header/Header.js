import React from 'react';
import './Header.css';
import { hashHistory } from 'react-router';

const Header = () => (
  <div className="header">
    <a className="header link" onClick={() => (hashHistory.pushState('/'))}>
      Vegetables
    </a>
  </div>
);

export default Header;
