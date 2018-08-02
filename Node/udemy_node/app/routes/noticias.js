module.exports = function (server) {
    server.get('/noticias', function (req, res) {
        var connection = server.config.dbConnection();
        var noticiasModel = server.app.models.noticiasModel;

        noticiasModel.getData(connection, 'select * from noticias', function (error, result) {
            res.render('noticias/noticias.ejs', {noticias: result});
        });
    });
};