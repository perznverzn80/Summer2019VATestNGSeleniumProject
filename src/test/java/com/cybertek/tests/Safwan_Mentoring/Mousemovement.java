//package com.cybertek.tests.Safwan_Mentoring;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//
//public class Mousemovement {
//
//    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("WebDriver.firefox.driver","C:\\Users\\Parsa\\Downloads\\Firefox Installer.exe");
//        WebDriver driver=new FirefoxDriver();
//        driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
//        Actions action=new Actions(driver);
//        action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//ul[@class='submenu']/li/a[contains(text(),'courses')]")).click();
//    }
//}
