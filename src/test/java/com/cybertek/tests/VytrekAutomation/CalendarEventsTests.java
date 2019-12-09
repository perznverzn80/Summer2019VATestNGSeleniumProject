package com.cybertek.tests;

import com.cybertek.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalendarEventsTests extends TestBase {



    @Test(description = "Verify that end time is 12:30 AM")
    public void verifyTimeTest2() {
        LoginPage loginPage = new LoginPage();
        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        DashBoardPage dashboardPage = new DashBoardPage();

        loginPage.login("salesmanager101", "UserUser123");

        //go to Calendar Events page

        dashboardPage.navigateToModule("Activities", "Calendar Events");

        calendarEventsPage.waitUntilLoaderScreenDisappear();
        calendarEventsPage.createCalendarEvent.click();
        Assert.assertEquals(createCalendarEventsPage.endTime.getAttribute("value"), "12:30 AM");
    }

}