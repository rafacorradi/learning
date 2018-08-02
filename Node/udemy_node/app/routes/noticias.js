module.exports = function (server) {
    server.get('/noticias', function (req, res) {
        var mySql = require('mysql');
        var conection = mySql.createConnection({
            host: 'localhost',
            user: 'root',
            password: '1234',
            database: 'portal_noticias'
        });

        conection.query('select * from noticias', function (error, result) {
            res.send(result);
        });
    
        // res.render('noticias/noticias.ejs');
    });
};