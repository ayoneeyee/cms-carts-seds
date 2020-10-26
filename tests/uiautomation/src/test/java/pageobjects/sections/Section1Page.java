package pageobjects.sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.UIActions;

import java.util.List;

public class Section1Page extends UIActions {
    //=== List of elements user interacts in this page ===//
    //=== Part 1: Medicaid Expansion CHIP Enrollment Fees, Premiums, and Delivery Systems ===//
    private By all_radio_button = xpath("//label[contains(@for, 'radio')]");
    private By all_textarea = xpath("//textarea[@class='ds-c-field']");
    private By all_checkbox_button = xpath("//label[contains(@for, 'checkbox')]");


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

    public boolean verifyAllCheckboxButton() {
        List<WebElement> radioBttns = listOfElements(all_checkbox_button);
        for (WebElement e : radioBttns) {
            scrollToView(e);
            highlight(e);
            boolean result = e.isDisplayed();
            if (result == false) {
                return false;
            }
        }
        return true;
    }
}
