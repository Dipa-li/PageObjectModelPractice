package com.qa.opencart.tests;

import com.aventstack.chaintest.plugins.ChainTestListener;
import com.qa.opencart.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void loginPageTitleTest() {
        String actTitle = loginPage.getLoginPageTitle();
        Assert.assertEquals(actTitle, "Account Login");
    }

    @Test
    public void loginPageURLTest() {
        ChainTestListener.log("login page URL Test");
        String actURL = loginPage.getLoginPageURL();
        Assert.assertTrue(actURL.contains("route=account/login"));
    }

    @Test
    public void forgotPwdLinkExistTest() {
        Assert.assertTrue(loginPage.isForgotPwdLinkExist());
    }


  //  @Test(priority = Short.MAX_VALUE)
   /* public void doLoginTest() {
        String actAccPageTitle = loginpag.doLogin("march2024@open.com", "Selenium@12345");
        Assert.assertEquals(actAccPageTitle, "My Account");
    }*/


}
