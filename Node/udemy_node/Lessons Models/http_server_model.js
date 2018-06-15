// Modelo de criação e envio de dados através de um servidor HTTP básico do node

var http = require('http');

var server = http.createServer(function (req, res) {
    var category = req.url;
    console.log(category);

    if (category == '/tecnologia') {
        res.end("<html><head><meta charset='utf-8'><title>Portal de Notícias</title></head><body>Página de Técnologia</body></html>");
    }

    if (category == '/moda') {
        res.end("<html><head><meta charset='utf-8'><title>Portal de Notícias</title></head><body>Página de Moda</body></html>");
    }

    if (category == '/beleza') {
        res.end("<html><head><meta charset='utf-8'><title>Portal de Notícias</title></head><body>Página de Beleza</body></html>");    
    }

    if (category == '/') {
        res.end("<html><head><meta charset='utf-8'><title>Portal de Notícias</title></head><body>Portal de Notícias</body></html>");
    }
});

server.listen(3000);