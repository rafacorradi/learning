module.exports = function (server) {
    server.get('/noticias', function (req, res) {
        var conection = server.config.dbConnection();
        conection.query('select * from noticias', function (error, result) {
            res.render('noticias/noticias.ejs', {noticias: result});
        });
    });
};