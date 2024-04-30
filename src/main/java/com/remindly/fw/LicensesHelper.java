package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LicensesHelper extends BaseHelper{

    public LicensesHelper(AppiumDriver driver) {
        super(driver);
    }

    public boolean isNoticesForLibrariesTextPresent() {
        return isElementPresent(By.id("licenses_text_view"));
    }



}//class
