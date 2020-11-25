
const login = require('../cases/OY2-1494_Test_CARTS_Login');
module.exports = {
    '@tags' : ['smoke', 'regression'],

    before : function(browser) {
        login.before(browser);
    },

    after : function(browser) {
        login.after(browser);
    },

    'Certify and Submit Form' : function(browser) {
        browser.click("a[href='/sections/2020/certify-and-submit']").pause(1000);
        browser.expect.url().to.equal('https://mdctcartsdev.cms.gov/sections/2020/certify-and-submit');
    }
};