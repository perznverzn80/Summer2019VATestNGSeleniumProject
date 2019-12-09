package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ebay_search_test {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://ebay.com");
        WebElement searchbox=driver.findElement(By.id("gh-ac"));
        Thread.sleep(3000);
        searchbox.sendKeys("wooden spoon");
        searchbox.submit();
        Thread.sleep(3000);
        String result=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div/div[1]/h1/span[1]")).getText().replace(",","");

        int resultint=Integer.parseInt(result);
        System.out.println(result);
        Thread.sleep(3000);
        WebElement All=driver.findElement(By.xpath("//*[@id=\"x-refine__group__0\"]/ul/li/a/span"));
        All.click();
        Thread.sleep(3000);
        String result2=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div/div[1]/h1/span[1]")).getText().replace(",","");

        Thread.sleep(3000);
        int result2int=Integer.parseInt(result2);
        if(result2int>resultint){
            System.out.println("All result number is greater");
        }else{
            System.out.println("Fail");
        }
        driver.quit();




    }

}
