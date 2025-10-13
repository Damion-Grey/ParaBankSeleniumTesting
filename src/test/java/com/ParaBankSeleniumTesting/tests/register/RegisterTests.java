package com.ParaBankSeleniumTesting.tests.register;

import com.ParaBankSeleniumTesting.pageobjects.RegisterPage;
import com.ParaBankSeleniumTesting.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTests extends BaseTest {

    @Test
    public void registrationPositiveTest(){
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.visit();
        registerPage.enterFirstName("John");
        registerPage.enterLastName("Smith");
        registerPage.enterStreetAddress("123 Apple Rd.");
        registerPage.enterCityAddress("Townsville");
        registerPage.enterStateAddress("CN");
        registerPage.enterZipCode("00099");
        registerPage.enterPhoneNumber("5554443333");
        registerPage.enterSSN("999887777");
        registerPage.enterUsername("jsmith");
        registerPage.enterPassword("Password123");
        registerPage.enterPasswordConfirmation("Password123");
        registerPage.clickRegisterButton();
        Assert.assertTrue(registerPage.getPageSource().contains("Welcome jsmith"));
    }

}
