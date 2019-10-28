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

        List<String> urls = Arrays.asList("https://lulugandgeorgia.com", "https://wayfair.com/", "https://walmart.com" , "https://westelm.com/");
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("https://lulugandgeorgia.com");
        String Title= driver.getTitle().toLowerCase().replace(".com","");
       // System.out.println(Title);
        Title=Title.replace(" ","");

        String URL=driver.getCurrentUrl();

       if(URL.contains(Title)){
          System.out.println("Passed");
       }else {
          System.out.println("FAILED");
      }

        driver.navigate().to("https://wayfair.com/");
        String Title1=driver.getTitle().toLowerCase().replace(".com","");
       // System.out.println(Title1);
        Title1=Title1.replace(" ","");
       // Title1=Title1.replace(".com","");
        //System.out.println(Title1);
        if(URL.contains(Title1)){
            System.out.println("Passed");
        }else {
            System.out.println("FAILED");
        }

        driver.navigate().to("https://walmart.com");
        String Title2= driver.getTitle().toLowerCase().replace(".com","");
        //System.out.println(Title2);
        Title2=Title2.replace(" ","");
      //  Title2=Title2.replace(".com","");
        URL.contains(Title2);
        if(URL.contains(Title2)){
            System.out.println("Passed");
        }else {
            System.out.println("FAILED");
        }

        driver.navigate().to("https://westelm.com/");
        String Title3=driver.getTitle().toLowerCase().replace(".com","");
       // System.out.println(Title3);
        Title3=Title3.replace(" ","");
       // Title3=Title3.replace(".com","");
        URL.contains(Title3);
        if(URL.contains(Title3)){
            System.out.println("Passed");
        }else {
            System.out.println("FAILED");
        }

        driver.quit();







    }
}
