package com.ParaBankSeleniumTesting.tests;

import com.ParaBankSeleniumTesting.pageobjects.FrontPage;
import com.ParaBankSeleniumTesting.pageobjects.OpenAccountPage;
import com.ParaBankSeleniumTesting.pageobjects.OverviewPage;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenAccountTests extends BaseTest{
    @Parameters({"Username", "Password", "AccountType"})
    @Test
    public void openAccountPositiveTest(String username, String password, String accountType){
        FrontPage frontPage = new FrontPage(driver);
        OpenAccountPage openAccountPage = new OpenAccountPage(driver);
        OverviewPage overviewPage = new OverviewPage(driver);

        frontPage.visit();
        frontPage.fillOutLoginInfo(username, password);
        frontPage.clickLoginButton();
        overviewPage.verifyOnOverviewPage();
        openAccountPage.visit();
        openAccountPage.selectAccountType(accountType);
        openAccountPage.createAccount();
        Assert.assertTrue(openAccountPage.getPageSource().contains("Congratulations, your account is now open."));
    }
}
