package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

/*
Created by R-Mak
 */
public class HomePage extends Utility {

    By contactSalesLink = By.xpath("//a[contains(@class,'btn-orange contact-ohrm')]");
    By featuresLink = By.linkText("Features");

    public void clickOnSalesLink() {
        clickOnElement(contactSalesLink);
    }

    public void clickOnFeaturesLink() {
        clickOnElement(featuresLink);
    }

}
