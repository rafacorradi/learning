// Servidor Node utilizando o módulo express para realizar o tratamento das requisições
// Utilizando o módulo EJS para controlar a resposta e exibição dos HTML's
// Modelo modularizado. As rotas e os arquivos de views estão dentro da pasta app, enquanto que arquivos para configuração do aplicação, como o servidor, estão dentro da pasta config. O arquivo principal, que será executado pelo node, se mantém na raiz do projeto.

var server = require('./config/server.js');

var routesHome = require('./app/routes/home.js')(server);

var routesNoticias = require('./app/routes/noticias.js')(server);

var routesIncluirNoticias = require('./app/routes/formulario_inclusao_noticia')(server);

server.listen(3000, function () {
    console.log('Servidor rodando com Express');
    console.log('Server on');
})