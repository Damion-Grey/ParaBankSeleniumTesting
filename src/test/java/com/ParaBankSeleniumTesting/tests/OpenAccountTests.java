package com.ParaBankSeleniumTesting.tests;

import com.ParaBankSeleniumTesting.pageobjects.FrontPage;
import com.ParaBankSeleniumTesting.pageobjects.OpenAccountPage;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenAccountTests extends BaseTest{
    @Parameters({"Username", "Password", "AccountType"})
    @Test
    public void openAccountPositiveTest(String username, String password, String accountType){
        FrontPage frontPage = new FrontPage(driver);
        OpenAccountPage openAccountPage = new OpenAccountPage(driver);

        frontPage.visit();
        frontPage.fillOutLoginInfo(username, password);
        frontPage.clickLoginButton();
        // Test hangs here. Needs manual intervention the first time to go to the correct page.
        openAccountPage.visit();
        openAccountPage.selectAccountType(accountType);
        openAccountPage.createAccount();
        Assert.assertTrue(openAccountPage.getPageSource().contains("Congratulations, your account is now open."));
    }
}
