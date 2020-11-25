
const login = require('../cases/OY2-1494_Test_CARTS_Login');
module.exports = {
    '@tags' : ['smoke', 'regression'],

    before : function(browser) {
        login.before(browser);
        login["Login to CARTS Page"](browser);
    },

    after : function(browser) {
        login.after(browser);
    },



    'Navigate to Section 2: Enrollment and Uninsured Data' : function(browser) {
        const cartsPage = browser.page.cartsBasePage();
        cartsPage.jumpToSection(2);
        browser.expect.url().to.equal('https://mdctcartsval.cms.gov/sections/2020/02');
    }
};