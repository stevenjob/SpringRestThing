const express = require('express');
const app = express();
app.use(express.static('dist'));
app.listen(81, () => {
  // eslint-disable-next-line no-console
  console.log('Example app listening on port 81!');
});
