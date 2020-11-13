package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.SignInPage;
import pageobjects.sections.Section1Page;
import pageobjects.sections.section3.Section3A;
import pageobjects.sections.section3.Section3B;
import utility.Steps;

public class DemoTest extends BaseTest {

    // DONE
   // @Test(description = "Verify Section 1: Program Fees and Policy Changes contents", priority = 1)
    public void verify_section_1() {

        // Test Step - Automation code
        SignInPage signInPage = new SignInPage();
        signInPage.open();
        signInPage.gotoSection1();

        Section1Page section1 = new Section1Page();
        SoftAssert asserts = new SoftAssert();
        asserts.assertTrue(section1.verifyAllCheckboxButton());
        Steps.log("Verifying the checkboxes are presented and selectable on the page");
        asserts.assertTrue(section1.verifyAllRadioButton());
        Steps.log("Verifying radio buttons are presented and clickable on the page");
        asserts.assertTrue(section1.verifyAllTextArea());
        Steps.log("Verifying text areas are presented and editable on the page");
        asserts.assertAll();
    }


   // @Test(priority = 2)
    public void verify_section_3a() {
        SignInPage signIn = new SignInPage();
        signIn.open();
        signIn.gotoSection3a();
        Section3A section3a = new Section3A();

        SoftAssert asserts = new SoftAssert();
        asserts.assertTrue(section3a.verifyOptionOne());
        Steps.log("Verifying radio options in option one are presented and clickable on the page");
        asserts.assertTrue(section3a.verifyOptionTwo());
        Steps.log("Verifying radio options in option two are presented and clickable on the page");
        asserts.assertTrue(section3a.verifyTextAreas());
        Steps.log("Verifying text areas are presented and clickable on the page");
        asserts.assertTrue(section3a.verifyFileUpload());
        Steps.log("Verifying file upload is functional on the page");
        asserts.assertAll();

    }


    @Test(priority = 3)
    public void verify_section_3b() {
        SignInPage signIn = new SignInPage();
        signIn.open();
        signIn.gotoSection3b();

        Section3B section3b = new Section3B();
        SoftAssert asserts = new SoftAssert();
        asserts.assertTrue(section3b.verifyOption1());   // correct
        //asserts.assertFalse(section3b.verifyOption1(), "Section 3B: Option 1 Verifications has failed");     // faulty on purpose
        //Steps.log("Verifying Option 1 is presented and functional on the page");
        asserts.assertTrue(section3b.verifyOption2());
       // Steps.log("Verifying Option 2 is presented and functional on the page");
        asserts.assertTrue(section3b.verifyOption3());
       // Steps.log("Verifying Option 3 is presented and functional on the page");
        asserts.assertTrue(section3b.verifyOption5());
       // Steps.log("Verifying Option 4 is presented and functional on the page");
        asserts.assertTrue(section3b.verifyOption6());
        //Steps.log("Verifying Option 5 is presented and functional on the page");
        asserts.assertAll();
    }
}
