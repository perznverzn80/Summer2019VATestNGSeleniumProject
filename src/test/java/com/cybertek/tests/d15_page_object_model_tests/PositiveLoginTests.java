package com.cybertek.tests.d15_page_object_model_tests;

import com.cybertek.Pages.LoginPage;
import com.cybertek.tests.d14_properties_driver_class_test_base_class.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLoginTests extends TestBase {
    @Test
    public void loginAsDriver(){

        LoginPage loginPage = new LoginPage();
        loginPage.userName.sendKeys("user2");
        loginPage.password.sendKeys("UserUser123");
        loginPage.submit.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/");

    }

    @Test
    public void loginAsStoreManager(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("storemanager101" ,"UserUser123");
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/");



    }


}
