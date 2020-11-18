
const login = require('../cases/OY2-1494_Test_CARTS_Login');
module.exports = {
    tags : ['login', 'smoke'],

    before : function(browser) {
        login.before(browser);
        login["Login to CARTS Page"](browser);
    },

    after : function(browser) {
        login.after(browser);
    },

    'Certify and Submit Form' : function(browser) {
        const cartsPage = browser.page.cartsBasePage();
        cartsPage.submitCARTS('Done').waitForElementPresent('body');
    }
};