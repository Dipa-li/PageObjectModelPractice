package com.qa.opencart.base;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.AccountPage;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.Properties;

public class BaseTest {

    WebDriver driver;

    DriverFactory df;
    protected Properties prop;

    protected LoginPage loginpag;
    protected AccountPage accPage;
    /*protected SearchResultPage searchResultsPage;
    protected ProductInfoPage productInfoPage;*/
    protected RegisterPage registerPage;

    @Parameters({"browser"})
    @BeforeTest
    public void setup(String browserName) {
        df = new DriverFactory();
        prop = df.initProp();

        //browserName is passed from .xml file
        if(browserName!=null) {
            prop.setProperty("browser", browserName);
        }

        driver = df.initDriver(prop);//login page
        loginpag = new LoginPage(driver);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
