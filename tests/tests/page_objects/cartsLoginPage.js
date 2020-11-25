
const baseCommands = {
    login: function () {
        this.api.setValue(this.elements.userField, this.props.username);
        this.api.setValue(this.elements.passField, this.props.password);
        this.api.click(this.elements.termsConditions);
        this.api.click(this.elements.submitBtn);
    },

}
module.exports = {
    url : 'https://mdctcartsval.cms.gov/',

    elements: {
        title: '[alt="CMS - TEST logo"]',
        userField : '#okta-signin-username',
        passField : '#okta-signin-password',
        termsConditions: 'input[id=tandc]',
        submitBtn : 'input[type=submit]'
    },
    commands: [baseCommands],
    props: {
        username: 'MDCT_Test',
        password: 'Zxcvb123'
    }
}
