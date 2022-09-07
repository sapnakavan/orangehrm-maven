package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends Utility {

    By username = By.xpath("//input[@name='username']");
    By password = By.xpath("//input[@name='password']");
    By loginbutton = By.xpath("//button[@type='submit']");

    By loginpanelText = By.xpath("//h5[text()='Login']");


    public void enterUsername(String text) {
        sendTextToElement(username, text);
    }

    public void enterPassword(String text) {
        sendTextToElement(password, text);
    }

    public void clickonLoginButton() {
        clickOnElement(loginbutton);
    }

    public String loginPanelText() {
        return getTextFromElement(loginpanelText);
    }

    public void loginToApplication(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickonLoginButton();
    }


}
