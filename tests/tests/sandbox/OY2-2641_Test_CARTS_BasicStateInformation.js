
const login = require('../cases/OY2-1494_Test_CARTS_Login');
module.exports = {
    '@tags' : ['smoke', 'regression'],

    before : function(browser) {
        login.before(browser);
    },

    after : function(browser) {
        login.after(browser);
    },

    'Navigate to Basic State Information Page' : function(browser) {
        const cartsPage = browser.page.cartsBasePage();
        cartsPage.jumpToSection(0);
        browser.pause(1000);
        browser.expect.url().to.equal('https://mdctcartsdev.cms.gov/sections/2020/00');
//        const text_elements = cartsPage.getAllTextFields();
//        cartsPage.clickOnRadioFields(browser);
    }
};