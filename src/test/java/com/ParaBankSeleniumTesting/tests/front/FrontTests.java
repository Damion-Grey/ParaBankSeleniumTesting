package com.ParaBankSeleniumTesting.tests.front;

import com.ParaBankSeleniumTesting.pageobjects.FrontPage;
import com.ParaBankSeleniumTesting.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FrontTests extends BaseTest {

    @Parameters({"Username", "Password", "FirstName", "LastName"})
    @Test
    public void PositiveLoginTest(String username, String password, String firstname, String lastname){
        FrontPage frontPage = new FrontPage(driver);
        frontPage.visit();
        frontPage.fillOutLoginInfo(username, password);
        frontPage.clickLoginButton();
        Assert.assertTrue(frontPage.getWelcomeText().contains("Welcome " + firstname + " " + lastname));
    }
}
