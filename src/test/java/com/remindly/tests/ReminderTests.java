package com.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReminderTests extends TestBase{

    @BeforeMethod
    public void preconditions(){
        app.getMaimScreen().confirm();
    }

    //
    @Test
    public void addReminderTitlePositiveTest(){

        app.getMaimScreen().tapOnAddReminder();
        app.getReminder().enterReminderTitle("Holiday");
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMaimScreen().isReminderTitlePresent().contains("Holiday"));

    }

}//class
