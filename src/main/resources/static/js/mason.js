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

//LOGO
    const msnryLogo = new Masonry('#masonLogo', {
        "percentPosition": true,
        "itemSelector": '.mason-item',
        "initLayout": false
    });
    const collLogo = document.getElementById('collapseLogo');
    collLogo.addEventListener('shown.bs.collapse', function() {
        msnryLogo.layout();
    });

//Cover
    const msnryCover = new Masonry('#masonCover', {
        "percentPosition": true,
        "itemSelector": '.mason-item',
        "initLayout": false
    });
    const collCover = document.getElementById('collapseCover');
    collCover.addEventListener('shown.bs.collapse', function() {
        msnryCover.layout();
    });

//Paint
    const msnryPaint = new Masonry('#masonPaint', {
            "percentPosition": true,
            "itemSelector": '.mason-item',
            "initLayout": false
    });
    const collPaint = document.getElementById('collapsePaint');
    collPaint.addEventListener('shown.bs.collapse', function() {
        msnryPaint.layout();
    });

//Draw
    const msnryDraw = new Masonry('#masonDraw', {
            "percentPosition": true,
            "itemSelector": '.mason-item',
            "initLayout": false
    });
    const collDraw = document.getElementById('collapseDraw');
    collDraw.addEventListener('shown.bs.collapse', function() {
        msnryDraw.layout();
    });

//Other
    const msnryOther = new Masonry('#masonOther', {
            "percentPosition": true,
            "itemSelector": '.mason-item',
            "initLayout": false
    });
    const collOther = document.getElementById('collapseOther');
    collOther.addEventListener('shown.bs.collapse', function() {
        msnryOther.layout();
    });