package com.cybertek.tests.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {


    //write a static method that takes a string parameter
    //based on the value of the parameter
    //the method must return chromedriver or firefoxdriver object
    //name:getDriver

    public static WebDriver getDriver(String browserType) {
        WebDriver driver=null;
        if (browserType.toLowerCase().equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            return driver;
        } else if (browserType.toLowerCase().equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if(browserType.toLowerCase().equalsIgnoreCase("safari")) {
            driver = null;
        }else if(browserType.toLowerCase().equalsIgnoreCase("edge")){
               WebDriverManager.edgedriver().setup();
                driver= new EdgeDriver();
            }

        return driver;
    }
   /*
   public static WebDriver getDriver(String browserType){
   WebDriver driver=null;
   switch (browserType.toLowercase()){
   case"chrome":
   WebDriverManager.chromedriver().setup();
   driver =new ChromeDriver();
   break;
   case "firefox":
   WebDriverManager.firefoxdriver().setup();
   driver=new Firefoxdriver();
   break;
   }
   return drive;
   }
    */





}
