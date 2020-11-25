
module.exports = {
    '@tags' : ['login', 'smoke'],

    before : function(browser) {
        console.log('Setting up...');
        const loginPage = browser.page.cartsLoginPage();
        loginPage.navigate()
            .waitForElementPresent('body');
    },

    after : function(browser) {
        console.log('Closing down...');
        browser.end();
    },

    "Verify Title Page": function (browser) {
        browser.verify.titleContains('CMS - IMPL - Sign In');

    },

    'Login to CARTS Page' : function(browser) {
        const loginPage = browser.page.cartsLoginPage();
        loginPage.login();
        browser.expect.url().to.not.equal('https://test.idp.idm.cms.gov/');
        browser.pause(5000);
    }
};