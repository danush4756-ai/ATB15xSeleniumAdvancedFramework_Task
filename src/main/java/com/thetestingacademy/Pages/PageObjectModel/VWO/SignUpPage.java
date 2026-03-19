package com.thetestingacademy.Pages.PageObjectModel.VWO;
import com.thetestingacademy.Utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SignUpPage {
    WebDriver driver;
    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }
    //Locators
    private By FirstName = By.xpath("//input[@data-qa='page-su-v1-fname']");
    private By LastName = By.xpath("//input[@data-qa='page-su-v1-lname']");
    private By PhoneNumber = By.xpath("//input[@data-qa='page-su-v1-pnumber']");
    private By CreateAccount = By.xpath("//button[text()='Create Account']");
    //actions
    public void SignUp(String FName, String LName, String PNumber) {
        WaitHelpers.checkVisibility(driver, FirstName);
        driver.findElement(FirstName).sendKeys(FName);
        driver.findElement(LastName).sendKeys(LName);
        driver.findElement(PhoneNumber).sendKeys(PNumber);
        driver.findElement(CreateAccount).click();
    }
}