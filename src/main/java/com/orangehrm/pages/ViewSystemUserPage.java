package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class ViewSystemUserPage extends Utility {

    By systemUserText = By.xpath("//h5[text()='System Users']");

    By addbutton = By.xpath("//div[@class='orangehrm-paper-container']/div[1]/button");

    By userprofilelogo = By.xpath("//li[@class='oxd-userdropdown']/span/i");

    By logoutbutton = By.xpath("//ul[@class='oxd-dropdown-menu']/li[4]");

    By admin = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]");

    By userrolldropdown = By.xpath("//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");

    By statusdropdown = By.xpath("//div[@class='oxd-form-row']/div[1]/div[3]/div/div[2]/div/div");

    By disabletab = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]");
    By username1 = By.xpath("//div[@class='oxd-form-row']/div/div/div/div[2]/input");

    By statusdrop = By.xpath("//div[@class='oxd-form-row']/div/div[4]/div/div[2]/div/div");

    By searchbutton = By.xpath("//button[text()=' Search ']");
    By verifyrecordfound = By.xpath("//span[@class='oxd-text oxd-text--span']");
    By deletcheckbox = By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border']/div/div/div//label/span/i");
    By deletebutton = By.xpath("//div[@class='oxd-table-cell-actions']/button[1]/i");

    By yesdelete = By.xpath("//div[@class='orangehrm-modal-footer']/button[2]/i");

    By usrroll = By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div/div[2]/div/div/div[2]/i");

    By norecordfound = By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/span");

    public String verifysystemusertext() {
        return getTextFromElement(systemUserText);
    }

    public void clickonaddbutton() {
        clickOnElement(addbutton);
    }

    public void clickonuserlogo() {
        clickOnElement(userprofilelogo);
    }

    public void mousehoverAndClickonLogoutButton() {
        mouseHoverToElementAndClick(logoutbutton);
    }

    public void usserrolldropdownadmin() throws InterruptedException {
        clickOnElement(userrolldropdown);
        Thread.sleep(1000);
        clickOnElement(admin);
    }

    public void setStatusdropdown() throws InterruptedException {
        clickOnElement(statusdropdown);
        Thread.sleep(1000);
        clickOnElement(disabletab);
    }

    public void setUsername1() {
        sendTextToElement(username1, "test1234");
    }

    public void setUsrroll() throws InterruptedException {
        clickOnElement(usrroll);
        Thread.sleep(1000);
        clickOnElement(admin);

    }

    public void setStatusdrop() throws InterruptedException {
        clickOnElement(statusdrop);
        Thread.sleep(1000);
        clickOnElement(disabletab);
    }

    public void clickSearchbutton() {
        clickOnElement(searchbutton);
    }

    public String setVerifyrecordfound() {
        return getTextFromElement(verifyrecordfound);
    }

    public void clickondeleteckeckbox() {
        clickOnElement(deletcheckbox);
    }

    public void clickondeletebutton() {
        clickOnElement(deletebutton);
    }

    public void setYesdelete() {
        clickOnElement(yesdelete);
    }

    public String verifynorecordfound() {
        return getTextFromElement(norecordfound);
    }
}

