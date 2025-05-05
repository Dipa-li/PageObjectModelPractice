package com.qa.opencart.pages;

import com.qa.opencart.utils.ElementUtil;
import org.openqa.selenium.WebDriver;

import static com.qa.opencart.constants.AppConstants.*;

public class AccountPage {

    private WebDriver driver;
    private ElementUtil eleUtil;

    public AccountPage(WebDriver driver)
    {
        this.driver = driver;
        eleUtil = new ElementUtil(driver);
    }

    public String getAccPageTitle() {
        String title = eleUtil.waitFotTitleIs(HOME_PAGE_TITLE, DEFAULT_TIMEOUT);
        System.out.println("home page title: " + title);
        return title;
    }

    public String getAccPageURL() {
        String url = eleUtil.waitForURLContains(HOME_PAGE_FRACTION_URL, DEFAULT_TIMEOUT);
        System.out.println("home page url: " + url);
        return url;
    }
}
