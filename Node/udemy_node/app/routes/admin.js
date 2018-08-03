module.exports = function (server) {
    server.get('/formulario_inclusao_noticias', function (req, res) {
        res.render('admin/form_add_noticia.ejs');
    });

    server.post('/noticias/salvar', function (req, res) {
        var noticias = req.body;

        console.log(noticias);
        req.assert('titulo', 'Título é obrigatório').notEmpty();
        req.assert('resumo', 'Resumo é obrigatório').notEmpty();
        req.assert('resumo', 'Resumo deve conter entre 10 e 100 caracteres').len(10, 100);
        req.assert('autor', 'Autor é obrigatório').notEmpty();
        req.assert('data_noticia', 'Data é obrigatório').notEmpty();
        req.assert('noticia', 'Notícia é obrigatório').notEmpty();

        var errors = req.validationErrors();

        if (errors) {
            res.render('admin/form_add_noticia.ejs');
            return;
        }

        var connection = server.config.dbConnection();
        var databaseComunication = new server.app.models.DatabaseComunication(connection);

        databaseComunication.insertData(noticias, function (error, result) {
            res.redirect('/noticias');
        });
    });
}