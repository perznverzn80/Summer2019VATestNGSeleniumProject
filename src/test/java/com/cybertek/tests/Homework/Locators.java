package com.cybertek.tests.Homework;

import com.cybertek.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://www.ebay.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Term");
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
        WebElement Term=driver.findElement(By.xpath("//span[@class='BOLD' ]//parent::h1[@class='srp-controls__count-heading']"));
        String number=Term.getText().split(" ")[0];
        System.out.println(number);
        driver.quit();

    }

}

     class Locators2{
         public static void main(String[] args) {

             WebDriver driver= WebDriverFactory.getDriver("chrome");
             driver.get("http://www.amazon.com");
             driver.manage().window().maximize();
             driver.navigate().to("http://www.ebay.com");
             driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Term");
             driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
             String title=driver.getTitle();
             if (title.contains("Term")){
                 System.out.println("Pass");

             }else{
                 System.out.println("Failed");
             }


         }
}
class Locators3{
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://wikipedia.org/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("selenium webdriver");
        driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i")).click();
        driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[3]/ul/li[1]/div[1]/a/span")).click();
        String ends=driver.getCurrentUrl();
        if (ends.endsWith("Selenium_(software)")){
            System.out.println("Pass");
        }else {
            System.out.println("Failed");
        }

    }

}
