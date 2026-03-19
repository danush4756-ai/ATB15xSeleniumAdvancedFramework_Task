package com.thetestingacademy.Pages.PageObjectModel.VWO;
import com.thetestingacademy.Utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class FreeTrialPage {
    WebDriver driver;
    public FreeTrialPage(WebDriver driver) {
        this.driver = driver;
    }
    //Locators
    private By BusinessEmail = By.xpath("//input[@data-qa='page-su-step1-v1-email']");
    private By CheckBox = By.xpath("//input[@data-qa='page-free-trial-step1-gdpr-consent-checkbox']");
    private By CreateAccount = By.xpath("//button[text()='Create a Free Trial Account']");
    // Page Actions
    public void CreateFreeTrialAccount (String BusinessMail) {
        WaitHelpers.checkVisibility(driver, BusinessEmail, 30);
        driver.findElement(BusinessEmail).sendKeys(BusinessMail);
        driver.findElement(CheckBox).click();
        driver.findElement(CreateAccount).click();
    }
}