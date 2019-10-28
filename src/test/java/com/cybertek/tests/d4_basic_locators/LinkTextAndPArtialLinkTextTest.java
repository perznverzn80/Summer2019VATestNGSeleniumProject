package com.cybertek.tests.d4_basic_locators;

import com.cybertek.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAndPArtialLinkTextTest {

    public static void main(String[] args) {


        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        WebElement link=driver.findElement(By.linkText("Example 6: Loading overlay that disappears and disappears again"));

        System.out.println(link.getText());
        WebElement cbt=driver.findElement(By.className("Cybertek School"));
        System.out.println(cbt.getText());
        WebElement link6Again=driver.findElement(By.partialLinkText("Example 6"));
        System.out.println(link6Again.getText());


    }






}
