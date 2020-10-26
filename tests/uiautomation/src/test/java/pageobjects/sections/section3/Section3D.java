package pageobjects.sections.section3;

import org.openqa.selenium.By;
import utility.UIActions;

public class Section3D extends UIActions {

    private By cost_sharing = css(".main > div:nth-child(3) > h2:nth-of-type(1)");
    private By cost_sharing_texts = css(".helper-text");


    public boolean verifySection3D() {
        boolean ret1 = elementIsVisibleToUser(cost_sharing);
        boolean ret2 = elementIsVisibleToUser(cost_sharing_texts);
        return ret1 && ret2;
    }

}