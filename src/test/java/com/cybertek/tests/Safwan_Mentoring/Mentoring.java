package com.cybertek.tests.Safwan_Mentoring;

import com.cybertek.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mentoring {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        WebElement signup= driver.findElement(By.linkText("Sign Up For Mailing List"));
        Thread.sleep(10000);
        signup.click();



    }
}
