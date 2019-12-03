package com.cybertek.tests.d15_page_object_model_tests;

import com.cybertek.Pages.LoginPage;
import com.cybertek.tests.d14_properties_driver_class_test_base_class.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTests extends TestBase {

    @Test
    public void wrongPasswordTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.userName.sendKeys("salesmanager101");
        loginPage.password.sendKeys("greatpassword");
        loginPage.submit.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");
    }

    @Test
    public void wrongUsernameTest(){
        LoginPage loginPage =new  LoginPage();
        loginPage.userName.sendKeys("superadminuser");
        loginPage.password.sendKeys("UserUser123");
        loginPage.submit.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");
    }
}
