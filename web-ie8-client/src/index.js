/**
 * CANNOT use `import` to import `es5-shim`,
 * because `import` will be transformed to `Object.defineProperty` by babel,
 * `Object.defineProperty` doesn't exists in IE8,
 * (but will be polyfilled after `require('es5-shim')` executed).
 */

require('es5-shim');
require('es5-shim/es5-sham');
require('console-polyfill');
require('babel-polyfill');
require('fetch-ie8');
/**
 * CANNOT use `import` to import `react` or `react-dom`,
 * because `import` will run `react` before `require('es5-shim')`.
 */

const React = require('react');
const ReactDOM = require('react-dom');
const App = require('components/app/App');

const rootElement = document.getElementById('root');

ReactDOM.render(
  <App />,
  rootElement
);
