package com.cybertek.tests.d2_webdriver_basics;

import com.cybertek.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallTheFactory {

    public static void main(String[] args) {


        WebDriver driver= WebDriverFactory.getDriver("CHROME");
        driver.get("https:google.com");
        WebDriver driver2= WebDriverFactory.getDriver("firefox");



    }



}
