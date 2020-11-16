

const baseCommands = {
    submitForm : function () {
        return this.api.click('@submitBtn')
    },

    jumpToSection : function (num) {
        let link = (num === 3) ? "button[aria-controls='2020-03__subnav']" :
            "a[href='/sections/2020/0" + num + "']"
        return this.api.click(link);
    }
}

module.exports = {
    url : 'https://mdctcartsdev.cms.gov/sections/2020/00?dev=dev-ak',

    elements: {
        submitBtn : "button[type='submit']"
    },

    commands : [baseCommands],

    props : {
        textField : function (num) {
            return "input[id=textfield_" + num + "]";
        },

    }
}
