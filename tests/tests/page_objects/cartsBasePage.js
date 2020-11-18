
const baseCommands = {
    jumpToSection : function (num) {
        let link = (num === 3) ? "button[aria-controls='2020-03__subnav']" :
            "a[href='/sections/2020/0" + num + "']"
        return this.api.click(link);
    },

    submitCARTS: function (text) {
        let button = '//button[@type="button" and text()="' + text + '"]'
        return this.api.click('xpath', button);
    }

}

module.exports = {
    url : 'https://mdctcartsdev.cms.gov/sections/2020/00?dev=dev-ak',

    elements: {

    },

    commands : [baseCommands],

    props : {
        textField: function (num) {
            return "input[id=textfield_" + num + "]";
        }
    },
}
