package com.cybertek.tests.VytrekAutomation;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VytrekAutomation {

    /*
    Assignment description
    •Each student automate the positive test case blow :
    •Go to the login page of VyTrack
    •Enter valid credential (can be any role)•
    Click login button
    •Verify that the user login successfully
     */
    public static void main(String[] args) throws InterruptedException {




        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        WebElement username= driver.findElement(By.id("prependedInput"));
        username.sendKeys("storemanager61");
        WebElement password=driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        String expected = "https://qa2.vytrack.com/";
        String actual = driver.getCurrentUrl();
        Thread.sleep(5000);
        if (expected.equals(actual)) {
            System.out.println("Passed");
        }  else{
            System.out.println("Failed");
        }
        driver.quit();
//xpath
//    // Open the website
//    WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.get("https://qa2.vytrack.com/user/login");
//    // Enter valid username
//    WebElement UsernameInput = driver.findElement(By.id("prependedInput"));
//    String expectedUsername = "User24";
//        UsernameInput.sendKeys(expectedUsername);
//        Thread.sleep(2000);
//    // Enter valid password
//    WebElement PasswordInput = driver.findElement(By.id("prependedInput2"));
//    String expectedPassword = "UserUser123";
//        PasswordInput.sendKeys(expectedPassword);
//        Thread.sleep(2000);
//    // Click submit
//    WebElement retrieveLogin = driver.findElement(By.id("_submit"));
//        retrieveLogin.click();  // asking element to click
//        Thread.sleep(2000);
//    String actualUrl = driver.getCurrentUrl();
//    String expectedURl = "https://qa2.vytrack.com/";
//    //Verify
//    verifyEquals(actualUrl,expectedURl);
//        Thread.sleep(2000);
//        driver.close();
//}


    }



        }

