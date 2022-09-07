package com.orangehrm.testsuite;

import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.ViewSystemUserPage;
import com.orangehrm.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    ViewSystemUserPage viewSystemUserPage = new ViewSystemUserPage();

    @Test
    public void verifyUserShouldLoginSuccessfully() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickonLoginButton();
    }

    @Test
    public void verifyThatTheLogoDisplayOnHomePage() {
        loginPage.loginToApplication("Admin", "admin123");
        homePage.getlogo();
    }

    @Test
    public void verifyUserShouldLogOutSuccessFully() {
        loginPage.loginToApplication("Admin", "admin123");
        viewSystemUserPage.clickonuserlogo();
        viewSystemUserPage.mousehoverAndClickonLogoutButton();
        loginPage.loginPanelText();

    }
}
