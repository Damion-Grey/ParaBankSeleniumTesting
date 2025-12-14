package com.ParaBankSeleniumTesting.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OverviewPage extends BasePage{
    private By accountTableBodyRows = By.xpath("//table[@id='accountTable']/tbody/tr");

    public OverviewPage(WebDriver driver){
        super(driver);
    }

    public void visit(){
        super.visit("http://localhost:8080/parabank/overview.htm");
    }

    public List<WebElement> getListOfAccounts(){
        return driver.findElements(accountTableBodyRows);
    }

}

