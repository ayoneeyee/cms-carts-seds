package pageobjects.sections;

import org.hamcrest.Condition;
import org.openqa.selenium.By;
import utility.Steps;
import utility.UIActions;

public class Section2Page extends UIActions {
    //=== List of elements user interacts in this page ====//
    private final By programs_table = css(".main div:nth-child(2) .question:nth-child(2)");
    private final By enrollement_numbers_txtbox = css(".main div:nth-child(3) > div:nth-child(2) [rows]");
    private final By num_uninsured_child_table = css(".main .question:nth-child(2) [class='ds-c-table ds-u-margin-top--2']");
    private final By percent_change = id("synthesized-table-1");
    private final By reason_num_uninsured_child_changed = css(".main .question:nth-child(4) [rows]");

    // Option 2
    private final By option_2_yes = css("[for='radio_2020-02-a-02-02_32']");
    private final By option_2a_textbox = css(".ds-c-choice__checkedChild [rows]");
    private final By option_2a_no = css("[for='radio_2020-02-a-02-02_33']");

    // Option 3
    private final By option_3_yes = css("[for='radio_2020-02-a-02-03_34']");
    private final By textbox_3a = css("textarea[name='2020-02-a-02-03-a']");
    private final By start_day = css(".date-range-start-wrapper");
    private final By end_day = css(".date-range > .date-range-end-wrapper");
    private final By textbox_3c = css("textarea[name='2020-02-a-02-03-c']");
    private final By textbox_3d = css("textarea[name='2020-02-a-02-03-d']");
    private final By textbox_3e = css("textarea[name='2020-02-a-02-03-e']");
    private final By textbox_3f = css("textarea[name='2020-02-a-02-03-f']");
    private final By textbox_3g = css("textarea[name='2020-02-a-02-03-g']");
    private final By textbox_3h = css("textarea[name='2020-02-a-02-03-h']");
    private final By option_3_no = css("[for='radio_2020-02-a-02-03_35']");

    private final By textbox_4 = css("textarea[name='2020-02-a-02-04']");
    private final By file_upload = css("[type='file']");


    //=== List of methods that represents user's action in this page ===//
    public boolean isTablePresent() {
        Steps.log("Verifying table is displayed and visible to the user");
        return elementIsVisibleToUser(programs_table);
    }

    public boolean isEnrollmentNumTxtboxPresent() {
        Steps.log("Verifying enrollment numbers are visible to the user");
        return elementIsVisibleToUser(enrollement_numbers_txtbox);
    }

    public boolean isNumUninsuredChildTablePresent() {
        Steps.log("Verifying child table is present and visible to the user");
        return elementIsVisibleToUser(num_uninsured_child_table);
    }

    public boolean isPercentChangeIsPresent() {
        Steps.log("Verifying percent changes section");
        return elementIsVisibleToUser(percent_change);
    }

    public boolean isReasonNumUninsuredChangedPresent() {
        waitformili(400);
        return elementIsVisibleToUser(reason_num_uninsured_child_changed);
    }

    public boolean isOption2RadioButtonWorks() {
        Steps.log("Verifying optimization button is presented and functional");
        boolean ret1 = elementIsEanbled(option_2_yes);
        click(option_2_yes);
        waitformili(400);
        boolean ret2 = elementIsVisibleToUser(option_2a_textbox);
        boolean ret3 = elementIsEanbled(option_2a_no);
        click(option_2a_no);
        return ret1 && ret2 && ret3;
    }

    public boolean isOption3RadioButtonWorks() {
        Steps.log("Verifying all the Option 3 radio button is presented and enabled");
        waitformili(400);
        boolean ret1 = elementIsEanbled(option_3_yes);
        click(option_3_yes);
        boolean ret2 = elementIsEanbled(textbox_3a);
        boolean ret3 = elementIsVisibleToUser(start_day);
        boolean ret4 = elementIsVisibleToUser(end_day);
        boolean ret5 = elementIsEanbled(textbox_3c);
        scrollToView(textbox_3d);
        waitformili(400);
        boolean ret6 = elementIsEanbled(textbox_3d);
        boolean ret7 = elementIsEanbled(textbox_3e);
        boolean ret8 = elementIsEanbled(textbox_3f);
        boolean ret9 = elementIsEanbled(textbox_3g);
        boolean ret10 = elementIsEanbled(textbox_3h);
        boolean ret11 = elementIsEanbled(option_3_no);
        click(option_3_no);
        return ret1 && ret2 && ret3 && ret4 && ret5 &&
                ret6 && ret7 && ret8 && ret9 && ret10 &&
                ret11;
    }

    public boolean textbox4IsPresent() {
        Steps.log("Verifying that option 4 textarea is presented and enabled");
        waitformili(400);
        scrollToView(textbox_4);
        return elementIsVisibleToUser(textbox_4);
    }

    public boolean fileUploadIsPresent() {
        Steps.log("Verifying that file upload element is enabled and presented");
        waitformili(400);
        scrollToView(file_upload);
        return elementIsVisibleToUser(file_upload);
    }
}
