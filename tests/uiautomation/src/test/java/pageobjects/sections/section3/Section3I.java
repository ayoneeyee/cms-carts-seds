package pageobjects.sections.section3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.UIActions;

import java.util.List;

public class Section3I extends UIActions {

    private By all_radio_button = xpath("//label[contains(@for, 'radio')]");
    private By all_input_texts = xpath("//input[@type='text']");
    private By all_textarea = xpath("//textarea");
    private By file_upload = css("[type='file']");
    private By add_another_bttn = css(".add-objective");
    private By another_in_list_banner = css(".question-inner-header");
    private By delete_last_item = css(".ds-c-button--danger");



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


    public boolean verifyAllInputText() {
        List<WebElement> tables = listOfElements(all_input_texts);
        for(WebElement e: tables) {
            scrollToView(e);
            highlight(e);
            boolean result = e.isDisplayed();
            if(result == false) {
                return false;
            }
        }
        return true;
    }

    public boolean verifyAllTextArea() {
        List<WebElement> allTextAreas = listOfElements(all_textarea);
        for(WebElement e : allTextAreas) {
            scrollToView(e);
            highlight(e);
            boolean result = e.isEnabled();
            if(result == false) {
                return false;
            }
        }
        return true;
    }

    public boolean verifyFileUpload() {
        return elementIsVisibleToUser(file_upload);
    }

    public boolean verifyAddAnotherButton() {
        boolean ret1 = elementIsVisibleToUser(another_in_list_banner);
        click(add_another_bttn);
        waitfor(1);
        click(delete_last_item);
        return ret1;
    }

}