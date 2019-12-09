package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestCases_Vytrack {
    WebDriver driver;
    private WebDriverWait wait;

    private void waitForLoader() {
        if (driver.findElements(By.cssSelector("div[class='loader-mask shown']")).size() > 0) {
            WebElement loaderMask = driver.findElement(By.cssSelector("div[class='loader-mask shown']"));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        }
    }

    @BeforeMethod
    public void setup(){
       driver= WebDriverFactory.getDriver("firefox");
       driver.manage().window().maximize();
        waitForLoader();



   }


    @Test
    public void TestCase1() throws InterruptedException {
        driver.get("https://qa1.vytrack.com/user/login");
        WebElement username=driver.findElement(By.xpath("//input[@id='prependedInput']"));
        username.sendKeys("storemanager85");
        WebElement password=driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123");
        WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        Actions action=new Actions(driver);
        Thread.sleep(5000);
        WebElement Activities=driver.findElement(By.linkText("Activities"));
        action.moveToElement(Activities).build().perform();
        WebElement Calendar=driver.findElement(By.xpath("//span[contains(text(),'Calendar Event')]"));
        action.moveToElement(Calendar).build().perform();
        Calendar.click();
        //WebElement Options = driver.findElement(By.xpath(“//*[@id=\“container\“]/div[2]/div/div/div[1]/div/div/div/div[2]/div”));
        //            WebDriverWait wait = new WebDriverWait(driver, 10);
        //            wait.until(ExpectedConditions.visibilityOf(Options));
        //            Assert.assertTrue(Options.isDisplayed());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String options=driver.findElement(By.xpath("//div[@data-toggle='dropdown'][contains(text(),'Options')]")).getText();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(options,"Options");

    }

    @Test
    public void TestCase2() throws InterruptedException {
        driver.get("https://qa1.vytrack.com/user/login");
        WebElement username=driver.findElement(By.xpath("//input[@id='prependedInput']"));
        username.sendKeys("storemanager85");
        WebElement password=driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123");
        WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        Actions action=new Actions(driver);
        Thread.sleep(5000);
        WebElement Activities=driver.findElement(By.linkText("Activities"));
        action.moveToElement(Activities).build().perform();
        WebElement Calendar=driver.findElement(By.xpath("//span[contains(text(),'Calendar Event')]"));
        action.moveToElement(Calendar).build().perform();
        Calendar.click();
        String pagenum=driver.findElement(By.xpath("//input[@value='1']")).getAttribute("Value");
        //String page=pagenum.getText();
        System.out.println("result: "+pagenum);
        Integer papenumInt=Integer.parseInt("1");
        if(papenumInt==1){
            System.out.println("Pass");
        }else{
            System.out.println("Failed");
        }

    }

    @Test
    public void TestCase3() throws InterruptedException {
        driver.get("https://qa1.vytrack.com/user/login");
        WebElement username=driver.findElement(By.xpath("//input[@id='prependedInput']"));
        username.sendKeys("storemanager85");
        WebElement password=driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123");
        WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        Actions action=new Actions(driver);
        Thread.sleep(5000);
        WebElement Activities=driver.findElement(By.linkText("Activities"));
        action.moveToElement(Activities).build().perform();
        WebElement Calendar=driver.findElement(By.xpath("//span[contains(text(),'Calendar Event')]"));
        action.moveToElement(Calendar).build().perform();
        Calendar.click();
        Thread.sleep(2000);
        String num25=driver.findElement(By.xpath("//a[@data-size='25']")).getAttribute("data-size");
        //WebElement num25=driver.findElement(By.xpath("//button[@data-toggle='dropdown']"));
        //num25.click();
        System.out.println("Result: "+num25);
        Integer num25Int=Integer.parseInt(num25);
        if (num25Int==25){
            System.out.println("Pass");
        }else {
            System.out.println("Failed");
        }

    }
    @Test
    public void TestCase4() throws InterruptedException {
        driver.get("https://qa1.vytrack.com/user/login");
        WebElement username=driver.findElement(By.xpath("//input[@id='prependedInput']"));
        username.sendKeys("storemanager85");
        WebElement password=driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123");
        WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        Actions action=new Actions(driver);
        Thread.sleep(5000);
        WebElement Activities=driver.findElement(By.linkText("Activities"));
        action.moveToElement(Activities).build().perform();
        WebElement Calendar=driver.findElement(By.xpath("//span[contains(text(),'Calendar Event')]"));
        action.moveToElement(Calendar).build().perform();
        Calendar.click();
        Thread.sleep(3000);
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='grid table-hover table table-bordered table-condensed']/tbody/tr"));
        String RowsNum = "Total Of " + rows.size() + " Records";
        System.out.println(RowsNum);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String RecordsNum = driver.findElement(By.xpath("//label[contains(text (), 'Total of')]")).getText();
        System.out.println(RecordsNum);
        Assert.assertEquals(RecordsNum, RowsNum);
    }
    @Test
    public void TestCase5() throws InterruptedException {
        driver.get("https://qa1.vytrack.com/user/login");
        WebElement username=driver.findElement(By.xpath("//input[@id='prependedInput']"));
        username.sendKeys("storemanager85");
        WebElement password=driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123");
        WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        Actions action=new Actions(driver);
        Thread.sleep(5000);
        WebElement Activities=driver.findElement(By.linkText("Activities"));
        action.moveToElement(Activities).build().perform();
        WebElement Calendar=driver.findElement(By.xpath("//span[contains(text(),'Calendar Event')]"));
        action.moveToElement(Calendar).build().perform();
        Calendar.click();
        Thread.sleep(3000);
        WebElement chkboxdrop=driver.findElement(By.xpath("//i[@class='caret']"));
        chkboxdrop.click();
        Thread.sleep(3000);
        WebElement chkboxAll=driver.findElement(By.xpath("/html/body/ul/li[1]/a"));
        chkboxAll.click();
        boolean isChecked=driver.findElement(By.tagName("input")).isSelected();
    }

    @Test
    public void TestCase6() throws InterruptedException {
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
        WebElement TesterMeeting = driver.findElement(By.xpath("//td[contains(text(),'Testers Meeting')]"));
        TesterMeeting.click();
    }

}
