package com.cybertek.tests.d3_webElement_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {
/*
open browser
go to http://practice.cybertekschool.com/forgot_password
enter any email
verify that email is displayed in the input box
click on Retrieve password
verify that confirmation message says 'Your e-mail's been sent!'
 */
public static void main(String[] args) {


    WebDriver driver = WebDriverFactory.getDriver("chrome");
    // go to http://practice.cybertekschool.com/forgot_password
    driver.get("http://practice.cybertekschool.com/forgot_password");
    // enter any email
    WebElement emailInPut = driver.findElement(By.name("email"));
    //sendKeys --> enters given text
    //sendKeys --> enters given text
    String expectedEmail = "admiralkunkka@email.com";
    emailInPut.sendKeys(expectedEmail);
    //verify that email is displayed in the input box
    //.getAttribute("Value")
    String actualEmail = emailInPut.getAttribute("value");

    WebElement retrievePassword=driver.findElement(By.id("form_submit"));
    retrievePassword.click();
    String expectedMessage= "'Your e-mail's been sent!'";
    WebElement messageElement=driver.findElement(By.name("confirmation_message"));
    String actualMessage=messageElement.getText();
    if (expectedEmail.equals(actualEmail)) {
        System.out.println("PASS");
    } else {
        System.out.println("FAIL");
    }
    driver.quit();
}
}
