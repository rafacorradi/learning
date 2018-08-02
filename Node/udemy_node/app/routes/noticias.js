module.exports = function (server) {
    server.get('/noticias', function (req, res) {
        var connection = server.config.dbConnection();
        var databaseComunication = new server.app.models.DatabaseComunication(connection);

        databaseComunication.getData('select * from noticias', function (error, result) {
            res.render('noticias/noticias.ejs', {noticias: result});
        });
    });
};