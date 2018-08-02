var mySql = require('mysql');
var connectMysql = function () {
    return mySql.createConnection({
        host: 'localhost',
        user: 'root',
        password: '1234',
        database: 'portal_noticias'
    });
}

module.exports = function () {
    return connectMysql;
}