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
        registerPage.fillRegistrationForm("John", "Smith", "123 Apple Rd.",
                                          "Townsville", "CN", "00099", "5554443333",
                                          "999887777", "jsmith", "Password123",
                                          "Password123");
        registerPage.clickRegisterButton();
        Assert.assertTrue(registerPage.getWelcomeText().contains("Welcome jsmith"));
    }

}
