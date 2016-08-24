const path = require('path');
const webpack = require('webpack');

module.exports = {
  devtool: 'cheap-module-source-map',
  entry: [
    './src/index'
  ],
  output: {
    path: path.join(__dirname, 'dist'),
    publicPath: '/',
    filename: 'bundle.js'
  },
  module: {
    loaders: [{
      test: /\.js$/,
      exclude: /node_modules/,
      loader: 'babel'
    }],
    postLoaders: [{
      test: /\.js$/,
      exclude: /node_modules/,
      loader: 'es3ify-loader'
    }]
  },
  plugins: [
    new webpack.DefinePlugin({
      'process.env': {
        NODE_ENV: JSON.stringify('production')
      }
    })
  ],
  resolve: {
    root: path.resolve('./src'), // webpack 2 doesnt need this, this is here for eslint
    modules: [
      path.resolve(__dirname, 'src'),
      'node_modules'
    ],
    extensions: ['', '.js']
  }
};
