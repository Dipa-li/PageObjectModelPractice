package com.qa.opencart.tests;

import com.qa.opencart.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void loginPageTitleTest() {
        String actTitle = loginpag.getLoginPageTitle();
        Assert.assertEquals(actTitle, "Account Login");
    }

    @Test
    public void loginPageURLTest() {
        String actURL = loginpag.getLoginPageURL();
        Assert.assertTrue(actURL.contains("route=account/login"));
    }

    @Test
    public void forgotPwdLinkExistTest() {
        Assert.assertTrue(loginpag.isForgotPwdLinkExist());
    }


  //  @Test(priority = Short.MAX_VALUE)
   /* public void doLoginTest() {
        String actAccPageTitle = loginpag.doLogin("march2024@open.com", "Selenium@12345");
        Assert.assertEquals(actAccPageTitle, "My Account");
    }*/


}
