package com.ParaBankSeleniumTesting.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenAccountPage extends BasePage{
    private By accountTypeDropdown = By.id("type");
    private By accountIdDropdown = By.id("fromAccountId");
    private By newAccountButton = By.xpath("//input[@value='Open New Account']");

    public OpenAccountPage(WebDriver driver){
        super(driver);
    }

    public void visit(){
        driver.get("http://localhost:8080/parabank/openaccount.htm");
    }

    public void selectAccountType(String accountType){
        new Select (waitForElement(accountTypeDropdown)).selectByVisibleText(accountType);
    }

    public void selectAccountId(int selectIndex){
        new Select (driver.findElement(accountIdDropdown)).selectByIndex(selectIndex);
    }

    public void createAccount(){
        driver.findElement(newAccountButton).click();
    }
}
