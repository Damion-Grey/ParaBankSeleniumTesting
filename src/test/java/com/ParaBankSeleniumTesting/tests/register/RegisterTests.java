package com.ParaBankSeleniumTesting.tests.register;

import com.ParaBankSeleniumTesting.pageobjects.RegisterPage;
import com.ParaBankSeleniumTesting.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegisterTests extends BaseTest {
    @Parameters({"FirstName", "LastName", "StreetAddress", "City", "State", "Zip", "PhoneNumber", "Ssn", "Username",
                 "Password", "Confirmation"})
    @Test
    public void registrationPositiveTest(String FirstName, String LastName, String StreetAddress, String City,
                                         String State, String Zip, String PhoneNumber, String Ssn, String Username,
                                         String Password, String Confirmation){
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.visit();
        registerPage.fillRegistrationForm(FirstName, LastName, StreetAddress, City, State, Zip, PhoneNumber, Ssn,
                Username, Password, Confirmation);
        registerPage.clickRegisterButton();
        Assert.assertTrue(registerPage.getHeaderText().contains("Welcome " + Username));
    }

    @Parameters({"FirstName", "LastName", "StreetAddress", "City", "State", "Zip", "PhoneNumber", "Ssn", "Username",
                 "Password", "Confirmation", "ErrorType", "ErrorMsg"})
    @Test
    public void registrationNegativeTest(String FirstName, String LastName, String StreetAddress, String City,
                                         String State, String Zip, String PhoneNumber, String Ssn, String Username,
                                         String Password, String Confirmation, String ErrorType, String ErrorMsg){
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.visit();
        registerPage.fillRegistrationForm(FirstName, LastName, StreetAddress, City, State, Zip, PhoneNumber, Ssn,
                                          Username, Password, Confirmation);
        registerPage.clickRegisterButton();
        Assert.assertTrue(registerPage.getErrorText(ErrorType).contains(ErrorMsg));
    }
}
