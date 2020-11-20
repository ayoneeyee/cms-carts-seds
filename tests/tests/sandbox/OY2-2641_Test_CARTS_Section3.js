
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

    'Navigate to Section 3: Eligibility, Enrollment, and Operations' : function(browser) {
        const cartsPage = browser.page.cartsBasePage();
        browser.pause(10000);                                                    // Waiting for unusual loading times
        cartsPage.jumpToSection(3)
            .expect.element('[aria-controls="2020-03__subnav"]')
            .to.have.attribute('aria-expanded').equal('false');

    },
};