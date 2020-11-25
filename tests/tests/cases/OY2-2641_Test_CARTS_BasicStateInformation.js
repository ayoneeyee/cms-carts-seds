
const login = require('./OY2-1494_Test_CARTS_Login');
module.exports = {
    '@tags' : ['smoke', 'regression'],

    before : function(browser) {
        login.before(browser)
        login["Login to CARTS Page"](browser);
    },

    after : function(browser) {
        login.after(browser);
    },

    "The title is displayed": function (browser) {
        const cartsPage = browser.page.cartsBasePage();
        cartsPage.expect.element('@title').text.to.equal('CHIP Annual Report Template System (CARTS)');

    },

    "Click on 'Edit' to edit Report": function (browser) {
        const cartsPage = browser.page.cartsBasePage();
        cartsPage.expect.element('@title')
            .text.to.equal('CHIP Annual Report Template System (CARTS)');
    },

    "Navigate to Basic State Information Page" : function(browser) {
        const cartsPage = browser.page.cartsBasePage();
        cartsPage.expect.element('@title')
            .text.to.equal('CHIP Annual Report Template System (CARTS)');

        browser.expect.url().to.equal('https://mdctcartsval.cms.gov/sections/2020/00');
    }
};