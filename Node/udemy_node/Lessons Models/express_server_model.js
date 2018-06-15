// Servidor Node utilizando o módulo express para realizar o tratamento das requisições

var express = require('express');
var app = express();

app.get('/', function (req, res) {
    res.send("<html><head><meta charset='utf-8'><title>Portal de Notícias</title></head><body>Portal de Notícias</body></html>");
});

app.get('/tecnologia', function (req, res) {
    res.send("<html><head><meta charset='utf-8'><title>Portal de Notícias</title></head><body>Página de Técnologia</body></html>");
});

app.get('/moda', function (req, res) {
    res.send("<html><head><meta charset='utf-8'><title>Portal de Notícias</title></head><body>Página de Moda</body></html>");
});

app.get('/beleza', function (req, res) {
    res.send("<html><head><meta charset='utf-8'><title>Portal de Notícias</title></head><body>Página de Beleza</body></html>");
});

app.listen(3000, function () {
    console.log('Servidor rodando com Express');
})