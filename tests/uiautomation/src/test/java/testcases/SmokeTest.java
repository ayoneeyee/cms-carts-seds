package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.HomePage;
import pageobjects.SignInPage;
import pageobjects.sections.*;
import pageobjects.sections.section3.*;
import utility.Steps;

public class SmokeTest extends BaseTest {


    // ========== Automated test cases  ============//
    ////@Test(description = "Verify that user can login to CARTS with valid credential")
    public void verify_user_login() {
       
        // Test Step - Automation code
        SignInPage signInPage = new SignInPage();
        signInPage.open();
        // signInPage.signIn(username, password);
        HomePage home = new HomePage();
        boolean result = home.reportBannerIsThere();

        // Test Assertion - Verify
        Assert.assertTrue(result, "CARTS home page did not display");
        Steps.log("Verify login in the CARTS");
    }


    ////@Test(description = "Verify the home page content and edit link")
    public void verify_homepage() {
      
        // Test Step - Automation code
        SignInPage signInPage = new SignInPage();
        signInPage.open();
        //signInPage.signIn(username, password);
        HomePage home = new HomePage();

        // Test Assertion - Verify
        SoftAssert asserts = new SoftAssert();
        asserts.assertTrue(home.reportBannerIsThere());
        Steps.log("Verifying report banner is on the page");
        asserts.assertTrue(home.contactLinkIsThere());
        Steps.log("Verifying the contact link is on the page");
        asserts.assertTrue(home.reportIsThere());
        Steps.log("Verifying report banner is on the page");
        asserts.assertAll();
    }


    @Test(description = "Verify Carts Basic Info page contents",priority = 1)
    public void verify_basic_info_page() {

        // Test Step - Automation code
        SignInPage signInPage = new SignInPage();
        signInPage.open();


        BasicStateInformationPage infoPage = new BasicStateInformationPage();

        // Test Assertion - Verify
        SoftAssert asserts = new SoftAssert();
        asserts.assertTrue(infoPage.welcomeBannerIsThere(),"Welcome banner verification failed");
        Steps.log("Verifying the Welcome banner is on the page");
        asserts.assertTrue(infoPage.helpDeskLinkIsThere(), "Help desk link verification failed");
        Steps.log("Verifying help desk link is on the page");
        asserts.assertTrue(infoPage.verifyDisabledContents(),"Disabled content verification failed");
        Steps.log("Verifying disabled contents are disabled on the page");
        asserts.assertTrue(infoPage.verifyEditableContents(),"Editable content verification failed");
        Steps.log("Verifying the editable contents are changeable on the page");
        asserts.assertTrue(infoPage.disclosureStatementIsThere(),"Disclosure statements verification failed");
        Steps.log("Verifying disclosure statement is on the page");
        asserts.assertAll();
    }


    @Test(description = "Verify Section 1: Program Fees and Policy Changes contents", priority = 2)
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


    // DONE
    @Test(description = "Verify Section 2: Eligibility and Enrollment contents", priority = 3)
    public void verify_section_2() {
        SignInPage signIn = new SignInPage();
        signIn.open();
        signIn.gotoSection2();

        // .date-range > .date-range-end-wrapper

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


    @Test(priority = 4)
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


    @Test(priority = 5)
    public void verify_section_3b() {
        SignInPage signIn = new SignInPage();
        signIn.open();
        signIn.gotoSection3b();

        Section3B section3b = new Section3B();
        SoftAssert asserts = new SoftAssert();
        asserts.assertTrue(section3b.verifyOption1());
        Steps.log("Verifying Option 1 is presented and functional on the page");
        asserts.assertTrue(section3b.verifyOption2());
        Steps.log("Verifying Option 2 is presented and functional on the page");
        asserts.assertTrue(section3b.verifyOption3());
        Steps.log("Verifying Option 3 is presented and functional on the page");
        asserts.assertTrue(section3b.verifyOption5());
        Steps.log("Verifying Option 4 is presented and functional on the page");
        asserts.assertTrue(section3b.verifyOption6());
        Steps.log("Verifying Option 5 is presented and functional on the page");
        asserts.assertAll();
    }

    @Test(priority = 6)
    public void verify_section_3c() {
        SignInPage signIn = new SignInPage();
        signIn.open();
        signIn.gotoSection3c();

        Section3C section3c = new Section3C();
        SoftAssert asserts = new SoftAssert();
        asserts.assertTrue(section3c.verifyAllInputText());
        Steps.log("Verifying input texts are presented and functional on the page");
        asserts.assertTrue(section3c.verifyAllRadioButton());
        Steps.log("Verifying radio options are presented and functional on the page");
        asserts.assertTrue(section3c.verifyAllDisabledInputs());
        Steps.log("Verifying disabled inputs are presented and not editable on the page");
        asserts.assertTrue(section3c.verifyAllTextArea());
        Steps.log("Verifying text areas are presented and editable on the page");
        asserts.assertTrue(section3c.verifyAllTables());
        Steps.log("Verifying all tables are presented on the page");
        asserts.assertAll();
    }

    @Test(priority = 7)
    public void verify_section_3d() {
        SignInPage signIn = new SignInPage();
        signIn.open();
        signIn.gotoSection3d();

        Section3D section3d = new Section3D();
        SoftAssert asserts = new SoftAssert();
        asserts.assertTrue(section3d.verifySection3D());
        Steps.log("Verifying the contents of Section 3D are presented on the page");
        asserts.assertAll();
    }


    @Test(priority = 8)
    public void verify_section_3e() {
        SignInPage signIn = new SignInPage();
        signIn.open();
        signIn.gotoSection3e();

        Section3E section3e = new Section3E();
        SoftAssert asserts = new SoftAssert();
        asserts.assertTrue(section3e.verifyAllRadioButton());
        Steps.log("Verifying radio options are presented and functional on the page");
        asserts.assertTrue(section3e.verifyAllCheckboxButton());
        Steps.log("Verifying all checkboxes are presented and clickable on the page");
        asserts.assertTrue(section3e.verifyAllTextArea());
        Steps.log("Verifying text areas are presented and editable on the page");
        asserts.assertTrue(section3e.verifyAllInputText());
        Steps.log("Verifying all input texts are presented and editable on the page");
        asserts.assertTrue(section3e.verifyFileUploadButton());
        Steps.log("Verifying the file upload are presented and functional on the page");
        asserts.assertAll();
    }

    @Test(priority = 9)
    public void verify_section_3f() {
        SignInPage signIn = new SignInPage();
        signIn.open();
        signIn.gotoSection3f();

        Section3F section3f = new Section3F();
        SoftAssert asserts = new SoftAssert();
        asserts.assertTrue(section3f.verifySection3F());
        Steps.log("Verifying the contents of Section 3F are presented on the page");
        asserts.assertAll();
    }


    @Test(priority = 10)
    public void verify_section_3g() {
        SignInPage signIn = new SignInPage();
        signIn.open();
        signIn.gotoSection3g();

        Section3G section3g = new Section3G();
        SoftAssert asserts = new SoftAssert();
        asserts.assertTrue(section3g.verifySection3G());
        Steps.log("Verifying the contents of Section 3G are presented on the page");
        asserts.assertAll();
    }


    @Test(priority = 11)
    public void verify_section_3h() {
        SignInPage signIn = new SignInPage();
        signIn.open();
        signIn.gotoSection3h();

        Section3H section3h = new Section3H();
        SoftAssert asserts = new SoftAssert();
        asserts.assertTrue(section3h.verifyFileUpload());
        Steps.log("Verifying the file upload are presented and functional on the page");
        asserts.assertTrue(section3h.verifyInputAndTexts());
        Steps.log("Verifying all input texts are presented and editable on the page");
        asserts.assertTrue(section3h.verifyAllRadioButton());
        Steps.log("Verifying radio options are presented and functional on the page");
        asserts.assertTrue(section3h.verifyAllCheckboxes());
        Steps.log("Verifying all checkboxes are presented and clickable on the page");
        asserts.assertAll();
    }

    @Test(priority = 12)
    public void verify_section_3i() {
        SignInPage signIn = new SignInPage();
        signIn.open();
        signIn.gotoSection3i();
        Section3I section3i = new Section3I();

        SoftAssert asserts = new SoftAssert();
        asserts.assertTrue(section3i.verifyFileUpload());
        Steps.log("Verifying the file upload are presented and functional on the page");
        asserts.assertTrue(section3i.verifyAllInputText());
        Steps.log("Verifying all input texts are presented and editable on the page");
        asserts.assertTrue(section3i.verifyAllTextArea());
        Steps.log("Verifying all text areas are presented and editable on the page");
        asserts.assertTrue(section3i.verifyAllRadioButton());
        Steps.log("Verifying radio options are presented and functional on the page");
        asserts.assertTrue(section3i.verifyAddAnotherButton());
        Steps.log("Verifying Add Another button is presented and functional on the page");
        asserts.assertAll();
    }


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


    @Test(priority = 14)  // fail
    public void verify_section5() {
        SignInPage signIn = new SignInPage();
        signIn.open();
        signIn.gotoSection5();

        Section5Page section5 = new Section5Page();
        SoftAssert asserts = new SoftAssert();
        asserts.assertTrue(section5.verifyAllInputText());
        Steps.log("Verifying all input texts are presented and editable on the page");
        asserts.assertTrue(section5.verifyAllRadioButton());
        Steps.log("Verifying radio options are presented and functional on the page");
        asserts.assertTrue(section5.verifyAllCheckboxButton());
        Steps.log("Verifying checkboxes options are presented and functional on the page");
        asserts.assertTrue(section5.verifyAllTextArea());
        Steps.log("Verifying all text areas are presented and editable on the page");
        asserts.assertTrue(section5.verifyAllTables());
        Steps.log("Verifying all tables are presented on the page");
        asserts.assertTrue(section5.verifyFileUploadButton());
        Steps.log("Verifying the file upload are presented and functional on the page");
        asserts.assertAll();
    }


    @Test(priority = 15)
    public void verify_section6() {
        SignInPage signIn = new SignInPage();
        signIn.open();
        signIn.gotoSection6();

        Section6Page section6 = new Section6Page();
        boolean result = section6.isSection6Displayed();
        Assert.assertTrue(result);
        Steps.log("Verifying the contents of Section 6 are presented on the page");
    }

}
