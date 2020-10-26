package pageobjects;

import org.openqa.selenium.By;
import utility.Steps;
import utility.UIActions;

public class SignInPage extends UIActions {

    //=== List of elements user interacts in this page ====//
    private final By username_input = css("#okta-signin-username");
    private final By password_input = css("#okta-signin-password");
    private final By agreement_check = css("#tandc");
    private final By signIn_button = xpath("/html//input[@id='okta-signin-submit']");
    private final By basicInfo_tab = link("Basic State Information");
    private final By section1_tab = link("Section 1: Program Fees and Policy Changes");
    private final By section2_tab = link("Section 2: Enrollment and Uninsured Data");
    private final By section3a_tab = link("Section 3A: Program Outreach");
    private final By section3b_tab = link("Section 3B: Substitution of Coverage");
    private final By section3c_tab = link("Section 3C: Renewal, Denials, and Retention");
    private final By section3d_tab = link("Section 3D: Cost Sharing (Out-of-Pocket Costs)");
    private final By section3e_tab = link("Section 3E: Employer Sponsored Insurance and Premium Assistance");
    private final By section3f_tab = link("Section 3F: Program Integrity");
    private final By section3g_tab = link("Section 3G: Dental Benefits");
    private final By section3h_tab = link("Section 3H: CAHPS Survey Results");
    private final By section3i_tab = link("Section 3I: Health Services Initiative (HSI) Programs");
    private final By section4_tab = link("Section 4: State Plan Goals and Objectives");
    private final By section5_tab = link("Section 5: Program Financing");
    private final By section6_tab = link("Section 6: Challenges and Accomplishments");
    private final By certifyandSubmit_tab = link("Certify and Submit");
    

    //=== List of methods that represents user's action in this page ===//
    public void open(){
        //Steps.log("Going to the CARTS home page");
        gotoSite("https://mdctcartsdev.cms.gov/sections/2020/00?dev=dev-ak");
    }

    public void signIn(String username, String pass){
        write(username_input, username);
        write(password_input, pass);
        click(agreement_check);
        click(signIn_button);
    }

    public void gotoBasicInfo(){
        //Steps.log("Going to the Basic State Information");
        click(basicInfo_tab);
    }


    public void gotoSection1(){
       // Steps.log("Going to the Section 1");
        click(section1_tab);
    }

    public void gotoSection2() {
        Steps.log("Going to the Section 2");
        click(section2_tab);
    }


    public void gotoSection3a() {
       // Steps.log("Going to the Section 3a");
        click(section3a_tab);
        waitfor(2);
    }


    public void gotoSection3b() {
       // Steps.log("Going to the Section 3b");
        click(section3b_tab);
    }



    public void gotoSection3c() {
       // Steps.log("Going to the Section 3c");
        click(section3c_tab);
    }



    public void gotoSection3d() {
      //  Steps.log("Going to the Section 3d");
        click(section3d_tab);
    }



    public void gotoSection3e() {
       // Steps.log("Going to the Section 3e");
        click(section3e_tab);
    }


    public void gotoSection3f() {
      //  Steps.log("Going to the Section 3f");
        click(section3f_tab);
    }



    public void gotoSection3g() {
       // Steps.log("Going to the Section 3g");
        click(section3g_tab);
    }


    public void gotoSection3h() {
      //  Steps.log("Going to the Section 3h");
        click(section3h_tab);
    }


    public void gotoSection3i() {
      //  Steps.log("Going to the Section 3i");
        click(section3i_tab);
    }


    public void gotoSection4() {
      //  Steps.log("Going to the Section 4");
        waitfor(1);
        click(section4_tab);
    }

    public void gotoSection5() {
      //  Steps.log("Going to the Section 5");
        click(section5_tab);
    }

    public void gotoSection6() {
      //  Steps.log("Going to the Section 6");
        click(section6_tab);
    }

    public void gotoCertifyandSubmit() {
       // Steps.log("Going to the Certify and Submit");
        click(certifyandSubmit_tab);
    }
}
