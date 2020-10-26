package pageobjects.sections.section3;


import org.openqa.selenium.By;
import utility.UIActions;

public class Section3F extends UIActions {

    private By program_integrity = css(".main div:nth-child(3) > h2:nth-of-type(1)");

    public boolean verifySection3F() {
        return elementIsVisibleToUser(program_integrity);
    }
}