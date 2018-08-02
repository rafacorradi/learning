var mySql = require('mysql');

module.exports = function () {   
    return mySql.createConnection({
        host: 'localhost',
        user: 'root',
        password: '1234',
        database: 'portal_noticias'
    });
}