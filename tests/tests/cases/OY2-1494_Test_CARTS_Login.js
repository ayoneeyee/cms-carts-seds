
module.exports = {
    '@tags' : ['login', 'smoke'],

    before : function(browser) {
        console.log('Setting up...');
        const loginPage = browser.page.cartsLoginPage();

        loginPage.navigate().waitForElementPresent('body');

        browser.expect.url()
            .to.be.equal('https://impl.idp.idm.cms.gov/');
    },

    after : function(browser) {
        console.log('Closing down...');
        browser.end();
    },

    'Login to CARTS' : function(browser) {
        browser.verify.titleContains('CMS - IMPL - Sign In');

        //Arrange
        const loginPage = browser.page.cartsLoginPage();

        //Act
        loginPage.login();

        //Assert
        browser.expect.url()
            .to.not.equal('https://impl.idp.idm.cms.gov/');
        browser.expect.url()
            .to.be.equal('https://mdctcartsval.cms.gov/')
    }
};