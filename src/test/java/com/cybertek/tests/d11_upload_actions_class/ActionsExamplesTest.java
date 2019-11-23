package com.cybertek.tests.d11_file_upload_actions;

import com.cybertek.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class ActionsExamplesTest {
    /*
    http://practice.cybertekschool.com/jqueryui/menu
     */
    WebDriver driver;
    @BeforeMethod
    public void SetupMethod(){
        driver= WebDriverFactory.getDriver("firefox");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        //     driver.quit();
    }
    /*
    Actions class is a class comes from selenium and is created by
     */
    @Test
    public void hoverTest() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");
        WebElement img1=driver.findElement(By.tagName("img"));
        //Actions-->class tat contains all the user interactions
        Actions actions=new Actions(driver);
        Thread.sleep(2000);
        //moveToElement()-->moves the mouse on top of the given element
        //perform-->complete the actionm using every time after command
        actions.moveToElement(img1).perform();
        Assert.assertTrue(driver.findElement(By.linkText("View profile")).isDisplayed());
    }
    @Test
    public void dragDropTest() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        //source-->we will drage this element
        WebElement source=driver.findElement(By.id("draggable"));
        //target-->we drop here
        WebElement target=driver.findElement(By.id("droptarget"));
        Actions actions=new Actions(driver);
        Thread.sleep(1000);
        //drageAndDrop--> drags the course to target
        actions.dragAndDrop(source,target).perform();
    }
    @Test
    public void dragdropchainingTest(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        //source-->we will drage this element
        WebElement source=driver.findElement(By.id("draggable"));
        //target-->we drop here
        WebElement target=driver.findElement(By.id("droptarget"));
        Actions actions=new Actions(driver);
        actions.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
    }
}