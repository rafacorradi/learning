module.exports = function (server) {
    server.get('/noticia', function (req, res) {
        var connection = server.config.dbConnection();
        var databaseComunication = new server.app.models.DatabaseComunication(connection);

        databaseComunication.getData('select * from noticias where id_noticias = 2', function (error, result) {
            res.render('noticias/noticia.ejs', {noticias: result});
        });
    });
};