package com.cybertek.tests.d2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlAndTitle {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        // set up chrome driver
        WebDriver driver= new ChromeDriver();
        // open chrome browser
        driver.get("http://practice.cybertekschool.com/");
        String title = driver.getTitle();
        System.out.println("title="+title);

//getCurrentUrl(); gets url of this page
        String url=driver.getCurrentUrl();
        System.out.println("url = " + url);

        //getPageSource--> get
        String pageSource=driver.getPageSource();
        System.out.println("pageSource = " + pageSource);


    }





}
