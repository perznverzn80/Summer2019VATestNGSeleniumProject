package com.cybertek.tests.MJHomeWork;

import com.cybertek.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Google {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");
        String URL=driver.findElement(By.className("LC201b"));
    }
}
