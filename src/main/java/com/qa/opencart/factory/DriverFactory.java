package com.qa.opencart.factory;

import com.qa.opencart.exceptions.BrowserException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DriverFactory {

    WebDriver driver;
    Properties prop;

    public WebDriver initDriver(Properties prop)
    {
        String browserName = prop.getProperty("browser");
        System.out.println("browser name : " + browserName);

        switch(browserName.toLowerCase().trim())
        {
            case "chrome":
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;

            case "safari":
                driver = new SafariDriver();
                break;

            case "edge" :
                driver = new EdgeDriver();
                break;

            default:
                System.out.println("Please Enter correct Browser Name");
                throw new BrowserException("===INVALID BROWSER===");

        }
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        return driver;
    }

    public Properties initProp()
    {
        prop = new Properties();
        try {
            //src/main/resources/config/env.properties
            FileInputStream ip = new FileInputStream("./src/main/resources/config/env.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop;
    }

}
