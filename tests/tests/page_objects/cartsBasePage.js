
const baseCommands = {
    jumpToSection: function (num) {
        let link = (num === 3) ? "[aria-controls='2020-03__subnav']" : "[href='/sections/2020/0" + num + "']"
        this.api.click(link);
        this.api.waitForElementPresent('body');
    },

    submitCARTS: function (text) {
        let button = '//button[@type="button" and text()="' + text + '"]'
        this.api.click('xpath', button);
    },

    switchToNewWindow() {
        const handles = this.api.windowHandles()
        console.log(handles)
    }
}


module.exports = {
    elements: {
        title: 'div > h1'
    },

    commands : [baseCommands],

    props : {
        textField: function (num) {
            const selector = "input[id=textfield_";
            return selector.concat(num,"]");
        }
    },
}
