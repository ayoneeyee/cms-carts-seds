
const login = require('../OY2-1494_Test_CARTS_Login');
module.exports = {
    tags : ['login', 'smoke'],

    before : function(browser) {
        login.before(browser);
        login["Login to CARTS Page"](browser);
    },

    after : function(browser) {
        login.after(browser);
    },

    'Section 1: Program Fees and Policy Changes' : function(browser) {
        const cartPage = browser.page.cartsBasePage();

    }
};