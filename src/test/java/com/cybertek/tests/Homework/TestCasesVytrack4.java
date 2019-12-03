package com.cybertek.tests.Homework;

import com.cybertek.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCasesVytrack4 {
    WebDriver driver;
   // String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
     //driver.findElement(By.linkText("https://qa1.vytrack.com/calendar/event/create")).sendKeys(selectLinkOpeninNewTab);
    @BeforeMethod
    public void setup() throws InterruptedException {
        driver= WebDriverFactory.getDriver("firefox");
        driver.manage().window().maximize();

        driver.get("https://qa1.vytrack.com/user/login");
        WebElement username = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        username.sendKeys("storemanager85");
        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123");
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        Actions action = new Actions(driver);
        Thread.sleep(5000);
        WebElement Activities = driver.findElement(By.linkText("Activities"));
        action.moveToElement(Activities).build().perform();
        WebElement Calendar = driver.findElement(By.xpath("//span[contains(text(),'Calendar Event')]"));
        action.moveToElement(Calendar).build().perform();
        Calendar.click();
        Thread.sleep(3000);
    }

    @Test
    public  void TestCase1() throws InterruptedException {
        WebElement TesterMeeting = driver.findElement(By.xpath("//td[contains(text(),'Testers Meeting')]"));
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//tbody/tr[14]/td[9]/div/div/a"))).build().perform();
        WebElement dots = driver.findElement(By.xpath("//tbody/tr[14]/td[9]/div/div/a")).;
        //dots.click();
        Thread.sleep(3000);
//        String delete=(driver.findElement(By.xpath("//i[@class='fa-trash-o hide-text']"))).getAttribute("title");
//        String edit=driver.findElement(By.xpath("//i[@class='fa-pencil-square-o hide-text']")).getAttribute("title");
//        String view=driver.findElement(By.xpath("//div[@class='loader-mask']")).getAttribute("title");
//        Assert.assertEquals(delete,"Delete");
//        Thread.sleep(2000);
//        Assert.assertEquals(delete,"Edit");
//        Thread.sleep(2000);
//        Assert.assertEquals(delete,"View");
    }
}
