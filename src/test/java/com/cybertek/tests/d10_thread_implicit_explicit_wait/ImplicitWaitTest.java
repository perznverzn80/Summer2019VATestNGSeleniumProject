package com.cybertek.tests.d10_thread_implicit_explicit_wait;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitTest {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(365000, TimeUnit.DAYS );
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        driver.quit();
    }

    @Test
    public void test1()  {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");
        System.out.println(driver.findElement(By.id("finish")).getText());
    }

    @Test
    public void test2()  {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");
        System.out.println(driver.findElement(By.id("finish")).getText());

    }

}