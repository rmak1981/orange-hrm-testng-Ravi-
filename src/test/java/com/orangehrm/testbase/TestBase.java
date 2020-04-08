package com.orangehrm.testbase;

import com.orangehrm.basepage.BasePage;
import com.orangehrm.browserselector.BrowserSelector;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {
BrowserSelector selectBrowser = new BrowserSelector();
String baseURL = "https://www.orangehrm.com/";

    @BeforeMethod
    public void openBrowser() {

        selectBrowser.selectBrowser("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
