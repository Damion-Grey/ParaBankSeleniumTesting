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
    private By welcomeTextLocator = By.xpath("//div[@id='rightPanel']/h1[@class='title']");

    public RegisterPage(WebDriver driver){
        super(driver);
    }

    public void visit(){
        super.visit("http://localhost:8080/parabank/register.htm");
    }

    public void enterFirstName(String firstName){
        enterText(firstNameInputLocator, firstName);
    }

    public void enterLastName(String lastName){
        enterText(lastNameInputLocator, lastName);
    }

    public void enterStreetAddress(String streetAddress){
        enterText(streetInputLocator, streetAddress);
    }

    public void enterCityAddress(String city){
        enterText(cityInputLocator, city);
    }

    public void enterStateAddress(String state){
        enterText(stateInputLocator, state);
    }

    public void enterZipCode(String zip){
        enterText(zipInputLocator, zip);
    }

    public void enterPhoneNumber(String phoneNumber){
        enterText(phoneNumberInputLocator, phoneNumber);
    }

    public void enterSSN(String ssn){
        enterText(ssnInputLocator, ssn);
    }

    public void enterUsername(String username){
        enterText(usernameInputLocator, username);
    }

    public void enterPassword(String password){
        enterText(passwordInputLocator, password);
    }

    public void enterPasswordConfirmation(String confirmation){
        enterText(confirmPasswordInputLocator, confirmation);
    }

    public void clickRegisterButton(){
        driver.findElement(registerButtonLocator).click();
    }

    public String getWelcomeText(){
       return  waitForElement(welcomeTextLocator).getText();
    }
}
