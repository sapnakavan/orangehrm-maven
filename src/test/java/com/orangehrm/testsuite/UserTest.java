package com.orangehrm.testsuite;

import com.orangehrm.pages.AddUserPage;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.ViewSystemUserPage;
import com.orangehrm.testbase.TestBase;
import com.orangehrm.utility.Utility;
import org.testng.annotations.Test;

public class UserTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    ViewSystemUserPage viewSystemUserPage = new ViewSystemUserPage();

    AddUserPage addUserPage = new AddUserPage();

    @Test(priority = 1)
    public void adminshouldaddusersuccessfully() throws InterruptedException {
        loginPage.loginToApplication("Admin", "admin123");
        homePage.clickonAdmin();
        viewSystemUserPage.verifysystemusertext();
        viewSystemUserPage.clickonaddbutton();
        addUserPage.verifyAddUserText();
        viewSystemUserPage.usserrolldropdownadmin();
        addUserPage.enteremploname();
        addUserPage.enterusername();
        viewSystemUserPage.setStatusdropdown();
        addUserPage.setPassWd();
        addUserPage.setConfirmPw();
        addUserPage.setSavebutton();


    }

    @Test(priority = 2)
    public void searchTheUserCreatedAndVerifyIt() throws InterruptedException {
        loginPage.loginToApplication("Admin", "admin123");
        homePage.clickonAdmin();
        viewSystemUserPage.verifysystemusertext();
        viewSystemUserPage.setUsername1();
        viewSystemUserPage.setUsrroll();
        viewSystemUserPage.setStatusdrop();
        viewSystemUserPage.clickSearchbutton();
        viewSystemUserPage.setVerifyrecordfound();

    }

    @Test(priority = 3)
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() throws InterruptedException {
        this.searchTheUserCreatedAndVerifyIt();
        viewSystemUserPage.clickondeleteckeckbox();
        viewSystemUserPage.clickondeletebutton();
        viewSystemUserPage.setYesdelete();
    }

    @Test(priority = 4)
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() throws InterruptedException {
        loginPage.loginToApplication("Admin", "admin123");
        homePage.clickonAdmin();
        viewSystemUserPage.verifysystemusertext();
        viewSystemUserPage.setUsername1();
        viewSystemUserPage.setUsrroll();
        viewSystemUserPage.setStatusdrop();
        viewSystemUserPage.clickSearchbutton();
        viewSystemUserPage.verifynorecordfound();
    }

}
