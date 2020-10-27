package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.SignInPage;
import pageobjects.sections.Section2Page;
import pageobjects.sections.section3.Section3A;
import pageobjects.sections.section3.Section3B;
import utility.Steps;

public class DemoTest extends BaseTest {

    // DONE
    //@Test(description = "Verify Section 2: Eligibility and Enrollment contents", priority = 3)
    public void verify_section_2() {
        SignInPage signIn = new SignInPage();
        signIn.open();
        signIn.gotoSection2();

        Section2Page section2 = new Section2Page();

        SoftAssert asserts = new SoftAssert();
        asserts.assertTrue(section2.isTablePresent());
        asserts.assertTrue(section2.isEnrollmentNumTxtboxPresent());
        asserts.assertTrue(section2.isNumUninsuredChildTablePresent());
        asserts.assertTrue(section2.isPercentChangeIsPresent());
        asserts.assertTrue(section2.isReasonNumUninsuredChangedPresent());
        asserts.assertTrue(section2.isOption2RadioButtonWorks());
        asserts.assertTrue(section2.isOption3RadioButtonWorks());
        asserts.assertTrue(section2.textbox4IsPresent());
        asserts.assertTrue(section2.fileUploadIsPresent());
        asserts.assertAll();
    }


    //@Test(priority = 4)
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


    //@Test(priority = 5)
    public void verify_section_3b() {
        SignInPage signIn = new SignInPage();
        signIn.open();
        signIn.gotoSection3b();

        Section3B section3b = new Section3B();
        SoftAssert asserts = new SoftAssert();
        asserts.assertTrue(section3b.verifyOption1());
        asserts.assertTrue(section3b.verifyOption2());
        asserts.assertTrue(section3b.verifyOption3());
        asserts.assertTrue(section3b.verifyOption5());
        asserts.assertTrue(section3b.verifyOption6());
        asserts.assertAll();
    }
}
