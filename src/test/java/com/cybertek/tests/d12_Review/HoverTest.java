package com.cybertek.tests.d12_Review;

import com.cybertek.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoverTest {
    //creating new var
    //open browser
    WebDriver driver;
    Actions actions;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        actions = new Actions(driver);

        driver.get("http://practice.cybertekschool.com/hovers");
    }
    @Test
    public void test(){
        //hover over the each page
        //verify text user1, user2, user3
        for(int i =0; i < 3; i++){
            System.out.println(i);
            WebElement image = driver.findElement(By.tagName("img"));
            actions.moveToElement(image).perform();
        }
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
