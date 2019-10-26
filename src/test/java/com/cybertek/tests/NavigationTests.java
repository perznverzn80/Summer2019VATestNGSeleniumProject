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
        //firefox("firefox");
       // edge("edge");
    }
//    public static void edge(String browser){
//        WebDriver driver=WebDriverFactory.getDriver(browser);
//        driver.get("https://www.google.com");
//        String gTitle=driver.getTitle();
//        driver.navigate().to("https://www.etsy.com");
//        String eTitle=driver.getTitle();
//        driver.navigate().back();
//        StringUtility.verifyEquals(gTitle,gTitle);
//        driver.navigate().forward();
//        String e2Title=driver.getTitle();
//        StringUtility.verifyEquals(eTitle,e2Title);
//        driver.quit();
 //   }
    public static void chrome(String browser){

        WebDriver driver= WebDriverFactory.getDriver(browser);
        driver.get("https://www.google.com");
        String gTitle=driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String eTitle1=driver.getTitle();
        //StringUtility.verifyEquals(gTitle,gTitle);
        driver.navigate().back();
        String g2Title=driver.getTitle();
        StringUtility.verifyEquals(gTitle,g2Title);
        driver.navigate().forward();
        String eTitle2=driver.getTitle();
        StringUtility.verifyEquals(eTitle1,eTitle2);

        driver.quit();
       }

//
//       public static void firefox(String browser){
//        WebDriver driver=WebDriverFactory.getDriver(browser);
//        driver.get("https://www.google.com");
//        String gTitle=driver.getTitle();
//        driver.navigate().to("https://etsy.com");
//        String eTitle=driver.getTitle();
//        driver.navigate().back();
//        StringUtility.verifyEquals(gTitle,gTitle);
//        driver.navigate().forward();
//        String e2Title=driver.getTitle();
//        StringUtility.verifyEquals(eTitle,e2Title);
//        driver.quit();
//
//       }
//

}
