
const login = require('../cases/OY2-1494_Test_CARTS_Login');
module.exports = {
    tags : ['login', 'smoke'],

    before : function(browser) {
        login.before(browser);
        browser.page.cartsBasePage().navigate().pause(3000);
    },

    after : function(browser) {
        login.after(browser);
    },
    "CARTS Workflow": function (browser) {
        const tests = {
            basicInfo: require('./OY2-2641_Test_CARTS_BasicStateInformation'),
            section1: require('./OY2-2641_Test_CARTS_Section1'),
            section2 : require('./OY2-2641_Test_CARTS_Section2'),
            section3 : require('./OY2-2641_Test_CARTS_Section3'),
            section4 : require('./OY2-2641_Test_CARTS_Section4'),
            section5 : require('./OY2-2641_Test_CARTS_Section5'),
            section6 : require('./OY2-2641_Test_CARTS_Section6'),
            certSubmit : require('./OY2-2641_Test_CARTS_Certify_and_Submit')
        }

        tests.basicInfo["Basic State Information Page"](browser);
        tests.section1["Section 1: Program Fees and Policy Changes"](browser);
        tests.section2["Section 2: Enrollment and Uninsured Data"](browser);
        tests.section3["Section 3: Eligibility, Enrollment, and Operations"](browser);
        tests.section4["Section 4: State Plan Goals and Objectives"](browser);
        tests.section5["Section 5: Program Financing"](browser);
        tests.section6["Section 6: Challenges and Accomplishments"](browser);

    }
};