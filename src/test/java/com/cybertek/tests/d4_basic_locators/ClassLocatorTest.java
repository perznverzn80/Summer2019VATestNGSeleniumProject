package com.cybertek.tests.d4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement home=driver.findElement(By.className("nav-link"));
        home.click();
        driver.getTitle();
        driver.navigate().to("http://practice.cybertekschool.com/");
        WebElement title=driver.findElement(By.className("h3"));

        System.out.println(title.getText());//type title and then dot sout and enter
        driver.navigate().to("http://practice.cybertekschool.com/multiple_buttons");
        WebElement multiplebotton=driver.findElement(By.className("btn btn-primary"));
        multiplebotton.click();



    }
}
