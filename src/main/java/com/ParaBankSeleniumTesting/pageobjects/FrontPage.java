package com.ParaBankSeleniumTesting.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrontPage extends BasePage {
    private By usernameInputLocator = By.xpath("//input[@name='username']");
    private By passwordInputLocator = By.xpath("//input[@name='password']");
    private By loginButtonLocator = By.xpath("//input[@value='Log In']");
    private By welcomeTextLocator = By.xpath("//div[@id='leftPanel']/p");

    public FrontPage(WebDriver driver){
        super(driver);
    }

    public void visit(){
        super.visit("http://localhost:8080/parabank/index.htm");
    }

    public void fillOutLoginInfo(String username, String password){
        enterText(usernameInputLocator, username);
        enterText(passwordInputLocator, password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButtonLocator).click();
    }

    public String getWelcomeText(){
        return waitForElement(welcomeTextLocator).getText();
    }
}
