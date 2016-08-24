const express = require('express');
const app = express();
app.use(express.static('dist'));
app.listen(81, function () {
  console.log('Example app listening on port 81!');
});
