import Header from 'components/header/Header';

const React = require('react');
const Provider = require('react-redux').Provider;

const configureStore = require('store/configureStore.prod');

const store = configureStore();

const App = () => (
  <Provider store={store}>
    <dev>
      <Header />
      thing thing thing
    </dev>
  </Provider>
);

export default App;
