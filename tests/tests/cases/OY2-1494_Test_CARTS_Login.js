
module.exports = {
    tags : ['login', 'smoke'],

    before : function(browser) {
        console.log('Setting up...');
        const loginPage = browser.page.cartsLoginPage();
        loginPage.navigate().waitForElementVisible('body');
    },

    after : function(browser) {
        console.log('Closing down...');
        browser.end();
    },

    'Login to CARTS Page' : function(browser) {
        const loginPage = browser.page.cartsLoginPage();
        loginPage
            .assert.titleContains('CMS - TEST - Sign In')
            .setValue('@userField', 'TN_SEMAQM')
            .setValue('@passField', 'Macpro@419')
            .click('@termsConditions')
            .assert.visible('@submitBtn')
            .submitForm();

        loginPage.expect.url().to.contain("app/UserHome").after(3000);
    }
};