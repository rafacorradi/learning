module.exports = function () {
    this.getData = function (connection, sqlQuery, callback) {
        connection.query(sqlQuery, callback);
    };
    
    return this;
}