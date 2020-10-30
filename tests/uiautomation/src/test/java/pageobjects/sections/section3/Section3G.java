package pageobjects.sections.section3;


import org.openqa.selenium.By;
import utility.UIActions;

public class Section3G extends UIActions {

    private By dental_benefit = css(".main div:nth-child(4) .screen-only");

    public boolean verifySection3G() {
        return elementIsVisibleToUser(dental_benefit);
    }

}