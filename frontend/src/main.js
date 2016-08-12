define(function (require) {
    var d3 = require('../node_modules/d3/d3');

    function listItemClicked(d, i) {
      makeRows(d3.select(this));
    }

    function makeRows(selection) {
      var data = selection.datum()
      var liDataBind = selection.selectAll('li').data(data);

      liDataBind.enter()
      .append('li')
      .attr('class', 'vegetable-list-item')
      .append('div')
      .on('click', listItemClicked)
      .attr('class', 'vegetable-list-item-div')
      .append('label');

      liDataBind.exit().remove();

      liDataBind.select('label').text(function(d) {
        return d.name;
      });
    };

    var selection = d3
    .select('.main-container')
    .append('ul')
    .attr('class', 'vegetable-list');

    function bindDataToSelection (data) {
      selection.datum(data);
      selection.call(makeRows);
    }

    d3.json('http://localhost:8004/', bindDataToSelection);

});
