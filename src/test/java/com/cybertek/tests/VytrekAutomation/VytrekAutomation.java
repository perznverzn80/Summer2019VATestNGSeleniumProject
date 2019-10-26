package com.cybertek.tests.VytrekAutomation;

import com.cybertek.tests.Utilities.WebDriverFactory;
import org.jsoup.select.Evaluator;
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
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        WebElement UserNameInput=driver.findElement(By.id("_Username"));
        UserNameInput.sendKeys("User1");
        WebElement RetrievePassword=driver.findElement(By.id("_Password"));
        RetrievePassword.click();
        String expected="https://qa2.vytrack.com/";
        String actual=driver.getCurrentUrl();
        if(expected.equals(actual)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        driver.quit();




    }
}
