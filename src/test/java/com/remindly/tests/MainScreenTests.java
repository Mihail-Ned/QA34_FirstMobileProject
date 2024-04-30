package com.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainScreenTests extends TestBase {

    //confirmOk
    @BeforeMethod
    public void preconditions() {
        app.getMainScreen().confirm();

    }

    //verify text is displayed //проверить, отображается ли текст
    @Test
    public void appLaunchTest() {

        Assert.assertTrue(app.getMainScreen().isNoReminderTextPresent()); //текст напоминания отсутствует

    }

    // checkLicenses//проверка лицензии
    @Test
    public void checkLicenses() {

        app.getMainScreen().tapOnHamburgerMenu();
        app.getMainScreen().tabOnLicensesButton();
        Assert.assertTrue(app.getLicenses().isNoticesForLibrariesTextPresent());
    }


}//class
