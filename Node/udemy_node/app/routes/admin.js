module.exports = function (server) {
    server.get('/formulario_inclusao_noticias', function (req, res) {
        res.render('admin/form_add_noticia.ejs');
    });

    server.post('/noticias/salvar', function (req, res) {
        var noticias = req.body;

        var connection = server.config.dbConnection();
        var databaseComunication = new server.app.models.DatabaseComunication(connection);

        databaseComunication.insertData(noticias, function (error, result) {
            res.redirect('/noticias');
        });
    });
}