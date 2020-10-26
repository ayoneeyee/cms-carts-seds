package pageobjects.sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
        return isAllEnabled(file_uploads);
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
