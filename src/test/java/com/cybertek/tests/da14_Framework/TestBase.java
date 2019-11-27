package com.cybertek.tests.da14_Framework;

import com.cybertek.tests.Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


    public class TestBase {

        protected WebDriver driver;

        @BeforeMethod
        public void setupMethod() {
            driver = Driver.get();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }

        @AfterClass
        public void teardown() throws InterruptedException {
            Thread.sleep(1000);
            driver.quit();
        }

    }

