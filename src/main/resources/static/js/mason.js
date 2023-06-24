//source: https://stackoverflow.com/questions/67828164/collapsing-bootstrap-masonry-panels-shuffle-around-when-first-uncollapsed

//Original:
//const msnry = new Masonry('#mason', {
//      "percentPosition": true,
//      "itemSelector": '.mason-item'
//    });
//    const Col = document.getElementById('My-collapse');
//    Col.addEventListener('shown.bs.collapse', function() {
//      msnry.layout();
//    });

  const msnry = new Masonry('#mason', {
    "percentPosition": true,
    "itemSelector": '.mason-item',
    "initLayout": false
  });
  const Col = document.getElementById('collapseLogo');
  Col.addEventListener('shown.bs.collapse', function() {
      msnry.layout();
  });