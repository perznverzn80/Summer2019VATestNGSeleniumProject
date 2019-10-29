package com.cybertek.tests.Utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    /*
    Tests: Title and URL test 21.Create a new class TitleVerification2under utilities package and create a main method.
    2.Add this ArrayList declaration to the main method: List<String>
     urls = Arrays.asList("https://lulugandgeorgia.com", "https://wayfair.com/", "https://walmart.com, "https://westelm.com/"); 3.Visit all websites one by one.
     4.Verify that URLof the website contains the title of the website.Ignore spaces and casein comparison.
      For example,title of in the first website title is Lulu and Giorgia and the
    URLis https://lulugandgeorgia.com. So,this test case must pass.5.Close the browser at the end of the test.
     */

    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://lulugandgeorgia.com",
                "https://wayfair.com/",
                "https://walmart.com ",
                "https://westelm.com/");
        WebDriver driver =WebDriverFactory.getDriver("chrome");
        for (int i=0; i<urls.size();i++){
            driver.get(urls.get(i));
            String domain = urls.get(i).substring(8,urls.get(i).lastIndexOf('.'));
            if (driver.getTitle().toLowerCase().replaceAll(" ","").contains(domain)){
                System.out.println("PASS for website " + urls.get(i) +" title is " + driver.getTitle());
            }else{
                System.out.println("FAIL for website " + urls.get(i) + " title is " + driver.getTitle());
            }
        }
        driver.quit();
    }





    }

