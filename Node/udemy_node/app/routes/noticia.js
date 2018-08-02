module.exports = function (server) {
    server.get('/noticia', function (req, res) {
        var connection = server.config.dbConnection();
        var noticiasModel = server.app.models.noticiasModel;

        noticiasModel.getData(connection, 'select * from noticias where id_noticias = 2', function (error, result) {
            res.render('noticias/noticia.ejs', {noticias: result});
        });
    });
};