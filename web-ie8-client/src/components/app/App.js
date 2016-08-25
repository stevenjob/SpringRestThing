import Header from 'components/header/Header';
import React from 'react';
import { Provider } from 'react-redux';
import configureStore from 'store/configureStore';
import VegetableGrid from 'components/vegetableGrid/VegetableGridContainer';

const store = configureStore();

const App = () => (
  <Provider store={store}>
    <dev>
      <Header />
      <VegetableGrid />
    </dev>
  </Provider>
);

export default App;
