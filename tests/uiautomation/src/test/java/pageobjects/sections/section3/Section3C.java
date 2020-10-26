package pageobjects.sections.section3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.UIActions;

import java.util.List;

public class Section3C extends UIActions {

    private By all_input_texts = xpath("//input[@type='text']");
    private By all_textarea = xpath("//textarea[@class='ds-c-field']");
    private By all_disabled_inputs = xpath("//input[@disabled]");
    private By all_table = xpath("//table");
    private By all_radio_button = xpath("//label[contains(@for, 'radio')]");



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


    public boolean verifyAllTables() {
        List<WebElement> tables = listOfElements(all_table);
        for(WebElement e: tables) {
            scrollToView(e);
            boolean result = e.isEnabled();
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

    public boolean verifyAllDisabledInputs() {
        List<WebElement> disabledInputs = listOfElements(all_disabled_inputs);
        for(int i = 0; i < disabledInputs.size(); i++) {
            boolean result = disabledInputs.get(i).isEnabled();
            if(result != false) {
                return false;
            }
        }
        return true;
    }




}
