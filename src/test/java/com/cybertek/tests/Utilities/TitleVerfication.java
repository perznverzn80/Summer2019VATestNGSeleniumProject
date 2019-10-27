package com.cybertek.tests.Utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;
public class TitleVerfication {
/*
1.Create a new class TitleVerification under utilitiespackageand create a main method.
2.Add this ArrayList declaration to the main method: List<String> urls =
Arrays.asList("http://practice.cybertekschool.com/", "http://practice.cybertekschool.com/dropdown", "http://practice.cybertekschool.com/login");
 3.Open chrome browser4.Visit all the websitesfrom step 3and verify that they all have the same title.
 5.Verify that all URL sof all pages start with http://practice.cybertekschool.com. 6.Close the browser at the end of the test.
 */
    public static void main(String[] args) {


        String str="http://practice.cybertekschool.com/";

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/", "http://practice.cybertekschool.com/dropdown", "http://practice.cybertekschool.com/login");
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");


        String Title1=driver.getTitle();
        boolean URL=driver.getCurrentUrl().startsWith(str);
        driver.navigate().to("http://practice.cybertekschool.com/dropdown");
        String Title2=driver.getTitle();
        boolean URL2=driver.getCurrentUrl().contains("http://practice.cybertekschool.com/");
        driver.navigate().to("http://practice.cybertekschool.com/login");
        String Title3=driver.getTitle();
        boolean URL3=driver.getCurrentUrl().startsWith(str);
        StringUtility.verifyEquals(Title3,Title1);
        StringUtility.verifyEquals(Title2,Title1);


        if ((URL==URL2)&&(URL3==URL2)&&(URL==true)){
            System.out.println("URL PASSED");
        }else {
            System.out.println("FAILED");
        }

        driver.quit();

        }

    }

