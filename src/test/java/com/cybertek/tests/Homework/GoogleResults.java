package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class GoogleResults {
    // given data
    public static void main(String[] args) throws InterruptedException {
        List<String> searchStrs = Arrays.asList("Java", "JUnit", "Selenium");
        // importing of driver to open browser chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // open google page
        driver.get("https://www.google.com/");
        // make a full screen
        driver.manage().window().maximize();
        // find search box and click on it
        WebElement search = driver.findElement(By.name("q"));
        Thread.sleep(2000);
        // for loop use for check  each  data java j unit and selenium.
        for (int i = 0; i < searchStrs.size(); i++) {
            search.sendKeys(searchStrs.get(i));
            search.submit(); //(search submit means press enter  )
            // we are looking for first green link on a top
            WebElement GreenUrl = driver.findElement(By.tagName("cite"));
            System.out.println(GreenUrl.getText());
            //clicking on first link
            WebElement FirstLink = driver.findElement(By.tagName("h3"));
            FirstLink.click();
            String currentUrl = driver.getCurrentUrl();
            System.out.println("currentUrl = " + currentUrl);
            if (GreenUrl.equals(currentUrl)) {
                System.out.println("PASS");
            } else {
                System.out.println("False");
                // go back at previous page
                driver.navigate().back();
                search= driver.findElement(By.name("q"));
                search.clear();
            }
        }
        driver.quit();
    }
}