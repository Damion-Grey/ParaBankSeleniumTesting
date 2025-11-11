package com.ParaBankSeleniumTesting.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{
    private By firstNameInputLocator = By.id("customer.firstName");
    private By lastNameInputLocator = By.id("customer.lastName");
    private By streetInputLocator = By.id("customer.address.street");
    private By cityInputLocator = By.id("customer.address.city");
    private By stateInputLocator = By.id("customer.address.state");
    private By zipInputLocator = By.id("customer.address.zipCode");
    private By phoneNumberInputLocator = By.id("customer.phoneNumber");
    private By ssnInputLocator = By.id("customer.ssn");
    private By usernameInputLocator = By.id ("customer.username");
    private By passwordInputLocator = By.id ("customer.password");
    private By confirmPasswordInputLocator = By.id ("repeatedPassword");
    private By registerButtonLocator = By.xpath("//input[@value='Register']");
    private By headerTextLocator = By.xpath("//div[@id='rightPanel']/h1[@class='title']");

    public RegisterPage(WebDriver driver){
        super(driver);
    }

    public void visit(){
        super.visit("http://localhost:8080/parabank/register.htm");
    }

    public void fillRegistrationForm(String firstName, String lastName, String streetAddress, String city,
                                     String state, String zip, String phoneNumber, String ssn, String username,
                                     String password, String confirmation){
        enterText(firstNameInputLocator, firstName);
        enterText(lastNameInputLocator, lastName);
        enterText(streetInputLocator, streetAddress);
        enterText(cityInputLocator, city);
        enterText(stateInputLocator, state);
        enterText(zipInputLocator, zip);
        enterText(phoneNumberInputLocator, phoneNumber);
        enterText(ssnInputLocator, ssn);
        enterText(usernameInputLocator, username);
        enterText(passwordInputLocator, password);
        enterText(confirmPasswordInputLocator, confirmation);
    }

    public void clickRegisterButton(){
        driver.findElement(registerButtonLocator).click();
    }

    public String getHeaderText(){
       return  waitForElement(headerTextLocator).getText();
    }

    public String getErrorText(String ErrorType){
        return waitForElement(By.id(ErrorType + ".errors")).getText();
    }

}
