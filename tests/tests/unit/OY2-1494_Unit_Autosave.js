const Assert = require('assert');

module.exports = {
    '@unitTest': true,

    'demo AutoSave UnitTest' : function (done) {
        Assert.equal('TEST', 'TEST');
        setTimeout(function() {
            done();
        }, 10);
    }
};