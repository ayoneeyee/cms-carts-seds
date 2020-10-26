package pageobjects.sections.section3;

import org.openqa.selenium.By;
import utility.UIActions;

public class Section3A extends UIActions {

    private By option1_yes = xpath("//div[@class='main']/div[2]/div/div[1]/fieldset[@class='ds-c-fieldset']/div[1]/label[@class='ds-c-label']");
    private By option1_1a = css("textarea[name='2020-03-a-01-01-a']");
    private By option1_no = xpath("//div[@class='main']/div[2]/div/div[1]/fieldset[@class='ds-c-fieldset']/div[2]/label[@class='ds-c-label']");

    private By option2_yes = xpath("//div/div[2]/fieldset[@class='ds-c-fieldset']/div[1]/label[@class='ds-c-label']");
    private By option2_2a = css("textarea[name='2020-03-a-01-02-a']");
    private By option2_no = xpath("//div/div[2]/fieldset[@class='ds-c-fieldset']/div[2]/label[@class='ds-c-label']");

    private By option3 = css("textarea[name='2020-03-a-01-03']");
    private By option4 = css("textarea[name='2020-03-a-01-04']");
    private By file_upload = css("[type='file']");



    public boolean verifyOptionOne(){
        boolean ret1 = elementIsEanbled(option1_yes);
        click(option1_yes);
        boolean ret2 = elementIsVisibleToUser(option1_1a);
        boolean ret3 = elementIsEanbled(option1_no);
        click(option1_no);
        return ret1 && ret2 && ret3;
    }


    public boolean verifyOptionTwo(){
        scrollToView(option2_yes);
        boolean ret1 = elementIsVisibleToUser(option2_yes);
        click(option2_yes);
        boolean ret2 = elementIsVisibleToUser(option2_2a);
        boolean ret3 = elementIsVisibleToUser(option2_no);
        return ret1 && ret2 && ret3;
    }

    public boolean verifyTextAreas() {
        scrollToView(option3);
        boolean ret2 = elementIsVisibleToUser(option3);
        boolean ret3 = elementIsVisibleToUser(option4);
        return ret2 && ret3;
    }

    public boolean verifyFileUpload() {
        scrollToView(file_upload);
        return elementIsVisibleToUser(file_upload);
    }

}