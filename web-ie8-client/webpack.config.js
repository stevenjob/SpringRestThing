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
  plugins: [
    new webpack.optimize.OccurenceOrderPlugin(),
    new webpack.DefinePlugin({
      // 'process.env': {
      //   NODE_ENV: JSON.stringify('production')
      // }
    })
    // new webpack.optimize.UglifyJsPlugin({
    //   compressor: {
    //     warnings: false
    //   }
    // })
  ],
  module: {
    loaders: [{
      test: /\.js$/,
      exclude: /node_modules/,
      loaders: ['babel-loader']
    }, {
      test: /\.css$/,
      loader: 'style-loader!css-loader'
    }],
    postLoaders: [
      {
        test: /\.js$/,
        loaders: ['es3ify-loader']
      }
    ]
  },
  resolve: {
    root: path.resolve('./src'), // webpack 2 doesnt need this, this is here for eslint
    modules: [
      path.resolve(__dirname, 'src'),
      'node_modules'
    ],
    extensions: ['', '.js']
  }
};
