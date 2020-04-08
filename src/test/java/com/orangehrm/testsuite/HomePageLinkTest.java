package com.orangehrm.testsuite;

import com.orangehrm.pages.HomePage;
import com.orangehrm.testbase.TestBase;
import org.testng.annotations.Test;

public class HomePageLinkTest extends TestBase {

    HomePage homePage = new HomePage();

    @Test
    public void userShouldClickOnContactSalesLink() {
        homePage.clickOnSalesLink();
    }

    @Test
    public void userShouldClickOnFeaturesLink() {
        homePage.clickOnFeaturesLink();
    }

}
