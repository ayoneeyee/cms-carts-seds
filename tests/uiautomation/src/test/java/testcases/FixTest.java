package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.SignInPage;
import pageobjects.sections.BasicStateInformationPage;
import pageobjects.sections.Section2Page;
import pageobjects.sections.Section4Page;
import utility.Steps;

public class FixTest extends BaseTest {


    @Test(priority = 13)
    public void verify_section4() {
        SignInPage signIn = new SignInPage();
        signIn.open();
        signIn.gotoSection4();

        Section4Page section4 = new Section4Page();
        SoftAssert asserts = new SoftAssert();

        asserts.assertTrue(section4.verifyAllTextInputs(),"Unable to verify all text inputs");
        Steps.log("Verifying all input texts are presented and editable on the page");
        asserts.assertTrue(section4.verifyAllTextareas(),"Unable to verify all text areas");
        Steps.log("Verifying all text areas are presented and editable on the page");
        asserts.assertTrue(section4.verifyAllRadioButtons(), "Unable to verify all radio buttons");
        Steps.log("Verifying radio options are presented and functional on the page");
        asserts.assertTrue(section4.verifyAllFileUploads(), "Unable to verify all file uploads");
        Steps.log("Verifying the file upload are presented and functional on the page");
        asserts.assertAll();
    }

}
