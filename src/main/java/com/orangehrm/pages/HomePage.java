package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By orangeHRMlogo = By.xpath("//div[@class='oxd-sidepanel-header']/a/div[2]/img");

    By admin = By.xpath("//span[text()='Admin']");

    By pim = By.xpath("//span[text()='PIM']");

    By leave = By.xpath("//span[text()='Leave']");

    By dashboard = By.xpath("//span[text()='Dashboard']");

    public String getlogo() {
        return getTextFromElement(orangeHRMlogo);
    }

    public void clickonAdmin() {
        clickOnElement(admin);
    }

    public void cliclOnPim() {
        clickOnElement(pim);
    }

    public void clickOnLeave() {
        clickOnElement(leave);
    }

    public void clickOnDashboard() {
        clickOnElement(dashboard);
    }

}


