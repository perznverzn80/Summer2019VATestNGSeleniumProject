package com.cybertek.tests.d8_select_list;

import com.cybertek.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ListofElementsTest {

    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        System.out.println(buttons.size());

        Assert.assertEquals(buttons.size(), 6);

        // we are iterating though the list of elements
        // print the text of each element
        for (WebElement button: buttons) {
            System.out.println(button.getText());
        }

    }

    @Test
    public void test2(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        List<WebElement> buttons = driver.findElements(By.tagName("utton"));
        System.out.println(buttons.size());

    }
}