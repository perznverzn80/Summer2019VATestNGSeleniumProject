package com.cybertek.tests.VytrekAutomation;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationDemo {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https:/qa3.vytrack.com/user/login");
        driver.findElement(By.id("prependedInput")).sendKeys("user2");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        String ExpectedTitle="Dashboard";
        String ActualTitle=driver.getTitle();
        if (ExpectedTitle.equals(ActualTitle)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
            System.out.println("Expected Result--> "+ExpectedTitle);
            System.out.println("Actual Result--> "+ActualTitle);
        }

    }
}
