require('es5-shim');
require('es5-shim/es5-sham');
const React = require('react');
const ReactDOM = require('react-dom');
const App = require('components/app/App');

const rootElement = document.getElementById('root');

ReactDOM.render(
  <App />,
  rootElement
);
