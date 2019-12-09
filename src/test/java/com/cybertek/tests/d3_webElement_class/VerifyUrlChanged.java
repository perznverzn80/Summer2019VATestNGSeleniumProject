package com.cybertek.tests.d3_webElement_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlChanged {
/*
Verify URL changed
open browser
go to http://practice.cybertekschool.com/forgot_password
enter any email
click on Retrieve password
verify that url changed to http://practice.cybertekschool.com/email_sent
 */
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // enter any email
        WebElement emailInput= driver.findElement(By.name("email"));
        //sendKeys--> enters given text
        emailInput.sendKeys("admiralkunkka@email.com");
        //click on retrievePassword
        WebElement retrievePassword=driver.findElement(By.id("form_submit"));
        retrievePassword.click();
        String expected= "http://practice.cybertekschool.com/email_sent";
        String actual= driver.getCurrentUrl();
        if(expected.equals(actual)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        //close browser
        driver.quit();

    }




}
