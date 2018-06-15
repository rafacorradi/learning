module.exports = function (server) {
    server.get('/formulario_inclusao_noticias', function (req, res) {
        res.render('admin/form_add_noticia.ejs');
    });
}