
const login = require('../cases/OY2-1494_Test_CARTS_Login');
module.exports = {
    '@tags' : ['smoke', 'regression'],

    before : function(browser) {
        login.before(browser);
    },

    after : function(browser) {
        login.after(browser);
    },

    'Navigate to Section 6: Challenges and Accomplishments' : function(browser) {
        const cartsPage = browser.page.cartsBasePage();
        cartsPage.jumpToSection(6);
        browser.pause(1000)
        browser.expect.url().to.equal('https://mdctcartsdev.cms.gov/sections/2020/06');

    }
};