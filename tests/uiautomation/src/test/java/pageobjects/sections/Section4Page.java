package pageobjects.sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utility.UIActions;

import java.util.ArrayList;
import java.util.List;

public class Section4Page extends UIActions {

    private By text_inputs = xpath("//input[@type='text']");
    private By extareas = xpath("//textarea");
    private By radio_buttons = xpath("//label[contains(@for, 'radio')]");
    private By file_uploads = xpath("//input[@type='file']");

    public boolean verifyAllTextInputs() {
        return isAllEnabled(text_inputs);
    }

    public boolean verifyAllTextareas() {
        return isAllEnabled(extareas);
    }


    public boolean verifyAllRadioButtons() {
        return isAllEnabled(radio_buttons);
    }


    public boolean verifyAllFileUploads() {
        int elemCount = getWait().until(ExpectedConditions.presenceOfAllElementsLocatedBy(file_uploads)).size();
        // There are 7 disabled file inputs in the page
        return (elemCount == 7);
    }


    private boolean isAllEnabled(By locator) {
        List<WebElement> allElements = listOfElements(locator);
        List<Boolean> foundDisabled = new ArrayList<Boolean>();
        for(WebElement e : allElements) {
            scrollToView(e);
            highlight(e);
            boolean result = e.isEnabled();
            if(result == false) {
                foundDisabled.add(false);
            }
        }
        return (foundDisabled.size() == 0);
    }
}
