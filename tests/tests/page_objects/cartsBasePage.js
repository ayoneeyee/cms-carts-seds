
const baseCommands = {
    jumpToSection: function (num) {
        let link = (num === 3) ? "[aria-controls='2020-03__subnav']" :
            "a[href='/sections/2020/0" + num + "']"
        return this.api.click(link);
    },

    submitCARTS: function (text) {
        let button = '//button[@type="button" and text()="' + text + '"]'
        return this.api.client.click('xpath', button);
    },

    switchToNewWindow() {
        const handles = this.api.windowHandles()
        console.log(handles)
    }
}


module.exports = {
    elements: {

    },

    commands : [baseCommands],

    props : {
        textField: function (num) {
            const selector = "input[id=textfield_";
            return selector.concat(num,"]");
        }
    },
}
