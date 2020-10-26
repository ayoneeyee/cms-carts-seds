package pageobjects.sections.section3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.UIActions;

import java.util.List;

public class Section3H extends UIActions {

    private By file_upload = css("[type='file']");
    private By all_radio_button = xpath("//label[contains(@for, 'radio')]");
    private By all_checkboxes = xpath("//label[contains(@for, 'checkbox')]");
    private By input_text = xpath("//input[@type='text']");
    private By textarea = css("textarea[name='2020-03-h-03-02']");


    public boolean verifyFileUpload() {
        return elementIsVisibleToUser(file_upload);
    }

    public boolean verifyInputAndTexts() {
        boolean ret1 = elementIsVisibleToUser(input_text);
        boolean ret2 = elementIsVisibleToUser(textarea);
        return ret1 && ret2;
    }

    public boolean verifyAllRadioButton() {
        List<WebElement> radioBttns = listOfElements(all_radio_button);
        for(WebElement e: radioBttns) {
            scrollToView(e);
            highlight(e);
            boolean result = e.isDisplayed();
            if(result == false) {
                return false;
            }
        }
        return true;
    }

    public boolean verifyAllCheckboxes() {
        List<WebElement> radioBttns = listOfElements(all_checkboxes);
        for(WebElement e: radioBttns) {
            scrollToView(e);
            highlight(e);
            boolean result = e.isDisplayed();
            if(result == false) {
                return false;
            }
        }
        return true;
    }

}