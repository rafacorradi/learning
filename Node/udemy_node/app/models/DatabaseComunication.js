function DatabaseComunication (connection) {
    this._connection = connection;
}

DatabaseComunication.prototype.getData = function (sqlQuery, callback) {
    this._connection.query(sqlQuery, callback);
};

DatabaseComunication.prototype.insertData = function (parameters, callback) {
    this._connection.query('insert into noticias set ? ', parameters, callback);
}

module.exports = function () {    
    return DatabaseComunication;
}