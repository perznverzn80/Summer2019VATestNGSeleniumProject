package com.cybertek.tests;

import com.cybertek.tests.Utilities.StringUtility;
import com.cybertek.tests.Utilities.WebDriverFactory;
import com.cybertek.tests.d3_webElement_class.VerifyUrlChanged;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class NavigationTests {
    public static void main(String[] args) {
        chrome("chrome");
        firefox("firefox");
    }
    public static void chrome(String browser){

        WebDriver driver= WebDriverFactory.getDriver(browser);
        driver.get("https://www.google.com");
        String gTitle=driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String eTitle1=driver.getTitle();
        StringUtility.verifyEquals(gTitle,driver.getTitle());
        driver.navigate().forward();
        String Title2=driver.getTitle();
        StringUtility.verifyEquals(eTitle1,Title2);

        driver.quit();
       }
       public static void firefox(String browser){
        WebDriver driver=WebDriverFactory.getDriver(browser);
        driver.quit();
       }
       public static void edge(String browser){
        WebDriver driver=WebDriverFactory.getDriver(browser);
        driver.quit();
       }

}
