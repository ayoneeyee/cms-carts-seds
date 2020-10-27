package pageobjects.sections.section3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.Steps;
import utility.UIActions;

public class Section3B extends UIActions {
    // option 1
    private By option1_yes = css("[for='radio_2020-03-b-01-01_28']");
    private By option1_1a = css("textarea[name='2020-03-b-01-01-a']");
    private By option1_no = css("[for='radio_2020-03-b-01-01_29']");
    private By option1_na = css("[for='radio_2020-03-b-01-01_30']");

    // option2
    private By option2_yes = css("[for='radio_2020-03-b-01-02_31']");
    private By option2_2a = css("textarea[name='2020-03-b-01-02-a']");
    private By option2_no = css("[for='radio_2020-03-b-01-02_32']");
    private By option2_na = css("[for='radio_2020-03-b-01-02_33']");

    private By option3_text = css("input[name='2020-03-b-01-03']");

    private By option5_text = css("textarea[name='2020-03-b-01-05']");

    private By option6_fileUpload = css("[type='file']");

    @FindBy(how = How.CSS, using = "[type='file']")
    private WebElement option6_fileupload_demo;


    public void demo() {
        click(option6_fileUpload);        // explicit and fluent waits for the element then click

        option6_fileupload_demo.click();  // regular seleium  webelement click
    }


    public boolean verifyOption1() {
        boolean ret1 = elementIsVisibleToUser(option1_yes);
        click(option1_yes);
        boolean ret2 = elementIsVisibleToUser(option1_1a);
        click(option1_no);
        scrollToView(option1_na);
        boolean ret3 = elementIsVisibleToUser(option1_na);
        return ret1 && ret2 && ret3;

    }

    public boolean verifyOption2() {
        boolean ret1 = elementIsVisibleToUser(option2_yes);
        scrollToView(option2_yes);
        click(option2_yes);
        boolean ret2 = elementIsVisibleToUser(option2_2a);
        click(option2_no);
        boolean ret3 = elementIsVisibleToUser(option2_na);
        return ret1 && ret2 && ret3;
    }

    public boolean verifyOption3() {
        scrollToView(option3_text);
        return elementIsVisibleToUser(option3_text);
    }

    public boolean verifyOption5() {
        scrollToView(option5_text);
        return elementIsVisibleToUser(option5_text);
    }

    public boolean verifyOption6() {
        scrollToView(option6_fileUpload);
        return elementIsVisibleToUser(option6_fileUpload);
    }

}