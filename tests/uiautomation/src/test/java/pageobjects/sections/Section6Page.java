package pageobjects.sections;

import org.openqa.selenium.By;
import utility.UIActions;

public class Section6Page extends UIActions {
    // Option 1
    private By option1_text = css("textarea[name='2020-06-a-01-01']");
    private By option2_text = css("textarea[name='2020-06-a-01-02']");
    private By option3_text = css("textarea[name='2020-06-a-01-03']");
    private By option4_text = css("textarea[name='2020-06-a-01-04']");
    private By option5_text = css("textarea[name='2020-06-a-01-05']");
    private By option6_file_upload = css("input[name='2020-06-a-01-06']");



    public boolean isSection6Displayed() {
        boolean ret1 = elementIsVisibleToUser(option1_text);
        scrollToView(option2_text);
        boolean ret2 = elementIsVisibleToUser(option2_text);
        boolean ret3 = elementIsVisibleToUser(option3_text);
        boolean ret4 = elementIsVisibleToUser(option4_text);
        boolean ret5 = elementIsVisibleToUser(option5_text);
        scrollToView(option6_file_upload);
        boolean ret6 = elementIsVisibleToUser(option6_file_upload);

        return (ret1 && ret2 && ret3 && ret4 && ret5 && ret6);
    }
}
