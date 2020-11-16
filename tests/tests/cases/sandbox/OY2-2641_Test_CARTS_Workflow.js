
const login = require('../carts/OY2-1494_Test_CARTS_Login');
module.exports = {
    tags : ['login', 'smoke'],

    before : function(browser) {
        login.before(browser);
        login["Login to CARTS Page"](browser);
    },

    after : function(browser) {
        login.after(browser);
    },

    'Basic State Information Page' : function(browser) {
        require('../carts/OY2-2641_Test_CARTS_BasicStateInformation')["Basic State Information Page"](browser);
        const cartsPage = browser.page.cartsBasePage();
        cartsPage.submitSection().waitForElementPresent('body');
        cartsPage.expect.element('@section').text.to.be.equals('')
    }
};