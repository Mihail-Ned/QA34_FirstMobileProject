package com.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainScreenTests extends TestBase {

    //confirmOk
    @BeforeMethod
    public void preconditions() {
        app.getMaimScreen().confirm();

    }

    //verify text is displayed
    @Test
    public void appLaunchTest() {

        Assert.assertTrue(app.getMaimScreen().isNoReminderTextPresent());

    }


}//class