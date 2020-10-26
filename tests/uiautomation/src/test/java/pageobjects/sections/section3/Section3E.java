package pageobjects.sections.section3;


        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import utility.UIActions;

        import java.util.List;

public class Section3E extends UIActions {

    private By all_radio_button = xpath("//label[contains(@for, 'radio')]");
    private By all_checkbox_button = xpath("//label[contains(@for, 'checkbox')]");
    private By all_textarea = xpath("//textarea");
    private By file_upload = css("[type='file']");
    private By text_inputs = xpath("//input[@type='text']");


    public boolean verifyAllRadioButton() {
        List<WebElement> radioBttns = listOfElements(all_radio_button);
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


    public boolean verifyAllInputText() {
        List<WebElement> tables = listOfElements(text_inputs);
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


    public boolean verifyFileUploadButton(){
        return elementIsVisibleToUser(file_upload);
    }

}