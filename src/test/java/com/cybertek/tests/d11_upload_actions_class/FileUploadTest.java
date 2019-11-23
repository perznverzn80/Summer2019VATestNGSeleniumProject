package com.cybertek.tests.d11_upload_actions_class;

import com.cybertek.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest {
    WebDriver driver;

    @BeforeMethod
    public void SetupMethod() {
       WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        //     driver.quit();
    }

    /*
     * go to website http://practice.cybertekschool.com/upload
     * upload file
     * click upload
     * verify file name is displayed in the next page
     */
    @Test
    public void test() {
        driver.get("http://practice.cybertekschool.com/upload");
        driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Parsa\\OneDrive\\Desktop\\file.txt");
        String actual=driver.findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(actual, "file.txt");

        }
        @Test
        public void test2(){
            driver.get("http://practice.cybertekschool.com/upload");
            String projectPath = System.getProperty("user.dir");

            // location of the file within the project
            String relativePath = "/src/test/resources/test_file.txt";
            // location of the file within the project
            String fullPath = projectPath+relativePath;

            driver.findElement(By.id("file-upload")).sendKeys(fullPath);
            driver.findElement(By.id("file-submit")).click();
            String actual = driver.findElement(By.id("uploaded-files")).getText();
            Assert.assertEquals(actual, "test_file.txt");







        }
}