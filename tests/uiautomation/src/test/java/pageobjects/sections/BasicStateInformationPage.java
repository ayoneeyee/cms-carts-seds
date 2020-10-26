package pageobjects.sections;

import org.openqa.selenium.By;
import utility.UIActions;

public class BasicStateInformationPage extends UIActions {

    //=== List of elements user interacts in this page ====//
    private final By welcome_banner = css(".main div:nth-child(2) h2");
    private final By help_desk_link = css(".main [href]");
    private final By state_territory_name_input = css("input[name='2020-00-a-01-01']");
    private final By program_type = css("div:nth-of-type(2) > input[name='2020-00-a-01-02']");
    private final By chip_program_names = css("textarea[name='2020-00-a-01-03']");

    private final By contact_name = css(".main .question:nth-child(2) [type]");
    private final By job_title = css(".main .question:nth-child(3) [type]");
    private final By email = css(".main .question:nth-child(7) .question:nth-child(4) [type]");
    private final By mailing_address = css("textarea[name='2020-00-a-01-07']");
    private final By phone_number = css("input[name='2020-00-a-01-08']");
    private final By disclosures = css(".main .question:nth-child(7) .question:nth-child(7) .ds-c-field__hint");

    private final By next_button = css("[type='submit']");

    //=== List of methods that represents user's action in this page ===//

    public boolean welcomeBannerIsThere() {
        return grabAsWebElement(welcome_banner).isDisplayed();
    }

    public boolean helpDeskLinkIsThere() {
        return elementIsVisibleToUser(help_desk_link);
    }

    public boolean verifyDisabledContents() {
       boolean result1 = elementIsDisabled(state_territory_name_input);
       boolean result2 = elementIsDisabled(program_type);
       scrollToView(chip_program_names);
       boolean result3 = elementIsDisabled(chip_program_names);
       return result1 && result2 && result3;
    }

    public boolean verifyEditableContents() {
        boolean result1 = elementIsEanbled(contact_name);
        boolean result2 = elementIsEanbled(job_title);
        boolean result3 = elementIsEanbled(email);
        boolean result4 = elementIsEanbled(mailing_address);
        boolean result5 = elementIsEanbled(phone_number);
        return (result1 && result2 && result3 && result4 && result5);
    }

    public boolean disclosureStatementIsThere() {
        scrollToView(disclosures);
        boolean result = elementIsVisibleToUser(disclosures);
        return result;
    }

    public void clickNext() {
        scrollToView(next_button);
        click(next_button);
        waitfor(3);
    }
}
