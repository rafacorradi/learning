var dbConection = require('../../config/dbConection');

module.exports = function (server) {
    var conection = dbConection();

    server.get('/noticias', function (req, res) {
        conection.query('select * from noticias', function (error, result) {
            res.render('noticias/noticias.ejs', {noticias: result});
        });
    });
};