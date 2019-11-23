package com.cybertek.tests.Homework;

import com.cybertek.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases {
    WebDriver driver;
    @BeforeMethod
    public void setUpDriver() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void quit(){
       driver.quit();
    }
    @Test
    public void TestCase1() {
        WebElement registeration = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a"));
        registeration.click();
        WebElement DOB = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[8]/div/input"));
        DOB.sendKeys("wrong_dob");
        String invalid = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[8]/div/small[2]")).getText();
        if (invalid.equals("The date of birth is not valid")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
        @Test
        public void TestCase2 () throws InterruptedException {
            WebElement registeration = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a"));
            registeration.click();
            WebElement cplus=driver.findElement(By.xpath("//label[@class='form-check-label' and @for='inlineCheckbox1']"));
            System.out.println(cplus.getText());
            Thread.sleep(5000);
            Assert.assertEquals(cplus.getText(),"C++");
            WebElement java=driver.findElement(By.xpath("//label[@class='form-check-label' and @for='inlineCheckbox2']"));
            System.out.println(java.getText());
            Assert.assertEquals(java.getText(),"Java");
            WebElement javascript=driver.findElement(By.xpath("//label[@class='form-check-label' and @for='inlineCheckbox3']"));
            System.out.println(javascript.getText());
            Assert.assertEquals(javascript.getText(),"JavaScript");



        }


        @Test
    public void TestCase3(){
            WebElement registeration = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a"));
            registeration.click();
            WebElement firstname=driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[1]/div/input"));

            firstname.sendKeys("P");
            String warningmsg=driver.findElement(By.xpath("//small[.='first name must be more than 2 and less than 64 characters long']")).getText();

            System.out.println(warningmsg);
            Assert.assertEquals(warningmsg,"first name must be more than 2 and less than 64 characters long");

        }

    }
