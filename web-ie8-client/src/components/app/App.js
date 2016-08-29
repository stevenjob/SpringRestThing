import Header from 'components/header/Header';
import React from 'react';
import { Provider } from 'react-redux';
import configureStore from 'store/configureStore';
import VegetableGrid from 'components/vegetableGrid/VegetableGridContainer';
import VegetableView from 'components/vegetableView/VegetableViewContainer';
import { Router, Route, hashHistory } from 'react-router';
import './App.css';

const store = configureStore();

const App = () => (
  <Provider store={store}>
    <dev>
      <Header />
      <Router history={hashHistory}>
        <Route path="/" component={VegetableGrid} />
        <Route path="/:vegetableName" component={VegetableView} />
      </Router>
    </dev>
  </Provider>
);

export default App;
