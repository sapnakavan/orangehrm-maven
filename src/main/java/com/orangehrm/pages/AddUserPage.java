package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {
    By addusertext = By.xpath("//h6[text()='Add User']");

    By employname = By.xpath("//input[@placeholder='Type for hints...']");

    By username = By.xpath("//div[@class='oxd-form-row']/div/div[4]/div/div[2]/input");

    By confirmPw = By.xpath("//div[@class='oxd-form-row user-password-row']/div[1]/div[2]/div[1]/div[2]/input");

    By passWd = By.xpath("//div[@class='oxd-form-row user-password-row']/div[1]/div[1]/div[1]/div[2]/input");

    By savebutton = By.xpath("//button[text()=' Save ']");
    By gautamganesh = By.xpath("//*[@class='oxd-autocomplete-wrapper']//*[contains(text(),'Goutam  Ganesh')]");


    public String verifyAddUserText() {
        return getTextFromElement(addusertext);
    }

    public void enteremploname() throws InterruptedException {
        sendTextToElement(employname, "G");
        Thread.sleep(3000);
        clickOnElement(gautamganesh);
    }

    public void enterusername() {
        sendTextToElement(username, "Test1234");
    }

    public void setPassWd() {
        sendTextToElement(passWd, "Kavan1385?");
    }

    public void setConfirmPw() {
        sendTextToElement(confirmPw, "Kavan1385?");
    }

    public void setSavebutton() {
        clickOnElement(savebutton);
    }

}
