package com.cybertek.tests.Homework;

import com.cybertek.tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases {
    WebDriver driver;

    @BeforeMethod
    public void setUpDriver() {

        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
    }

    @AfterMethod
    public void quit() {
        // driver.quit();
    }

    @Test
    public void TestCase1() {
        driver.get("https://practice-cybertekschool.herokuapp.com");
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
    public void TestCase2() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement registeration = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a"));
        registeration.click();
        WebElement cplus = driver.findElement(By.xpath("//label[@class='form-check-label' and @for='inlineCheckbox1']"));
        System.out.println(cplus.getText());
        Thread.sleep(5000);
        Assert.assertEquals(cplus.getText(), "C++");
        WebElement java = driver.findElement(By.xpath("//label[@class='form-check-label' and @for='inlineCheckbox2']"));
        System.out.println(java.getText());
        Assert.assertEquals(java.getText(), "Java");
        WebElement javascript = driver.findElement(By.xpath("//label[@class='form-check-label' and @for='inlineCheckbox3']"));
        System.out.println(javascript.getText());
        Assert.assertEquals(javascript.getText(), "JavaScript");


    }


    @Test
    public void TestCase3() {
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement registeration = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a"));
        registeration.click();
        WebElement firstname = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[1]/div/input"));

        firstname.sendKeys("P");
        String warningmsg = driver.findElement(By.xpath("//small[.='first name must be more than 2 and less than 64 characters long']")).getText();

        System.out.println(warningmsg);
        Assert.assertEquals(warningmsg, "first name must be more than 2 and less than 64 characters long");

    }

    @Test
    public void TestCase4() {
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement registeration = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a"));
        registeration.click();
        WebElement lastname = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[2]/div/input"));
        lastname.sendKeys("M");
        String warningmsg2 = driver.findElement(By.xpath("//*[.='The last name must be more than 2 and less than 64 characters long']")).getText();
        System.out.println(warningmsg2);
        Assert.assertEquals(warningmsg2, "The last name must be more than 2 and less than 64 characters long");
    }

    @Test
    public void TestCase5() {
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement registeration = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a"));
        registeration.click();
        WebElement firstname = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[1]/div/input"));
        firstname.sendKeys("Parsa");
        WebElement lastname = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[2]/div/input"));
        lastname.sendKeys("Mehdi");
        WebElement username = driver.findElement(By.xpath("//input[@class='form-control' and @name='username']"));
        username.sendKeys("pmehdi80");
        WebElement email = driver.findElement(By.xpath("//input[@placeholder='email@email.com']"));
        email.sendKeys("pmehdi80@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@class='form-control' and @name='password']"));
        password.sendKeys("Cybertek123");
        WebElement phone = driver.findElement(By.xpath("//input[@class='form-control' and @name='phone']"));
        phone.sendKeys("240-705-1102");
        WebElement gender = driver.findElement(By.xpath("//input[@type='radio' and @name='gender' and @value='male']"));
        gender.click();
        WebElement DOB = driver.findElement(By.xpath("//input[@name='birthday']"));
        DOB.sendKeys("10/08/1980");
        Select office = new Select(driver.findElement(By.name("department")));
        office.selectByValue("MO");
        Select jobTitle = new Select(driver.findElement(By.name("job_title")));
        WebElement javachkbox = driver.findElement(By.xpath("//input[@id='inlineCheckbox2']"));
        javachkbox.click();
        WebElement signup = driver.findElement(By.xpath("//*[ @id='wooden_spoon']"));
        signup.click();
        driver.navigate().to("https://practice-cybertekschool.herokuapp.com/registration_confirmation");
        String success = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/p")).getText();
        System.out.println(success);
        Assert.assertEquals(success, "You've successfully completed registration!");

    }

    @Test
    public void TestCase6() throws InterruptedException {
        driver.get("https://www.tempmailaddress.com/");
        String email = driver.findElement(By.className("animace")).getText();
        driver.navigate().to("https://practice-cybertekschool.herokuapp.com");
        WebElement signupmail = driver.findElement(By.xpath("//a[@href=\"/sign_up\"]"));
        signupmail.click();
        WebElement fullname = driver.findElement(By.xpath("//input[@name='full_name']"));
        fullname.sendKeys("Parsa Mehdi");
        WebElement emailfield = driver.findElement(By.xpath("//input[@type='email']"));
        emailfield.sendKeys(email);
        WebElement signup = driver.findElement(By.xpath("//button[@name='wooden_spoon']"));
        signup.click();
        String msg = driver.findElement(By.xpath("//h3[@name='signup_message']")).getText();
        System.out.println(msg);
        Assert.assertEquals(msg, "Thank you for signing up. Click the button below to return to the home page.");
        driver.navigate().to("https://www.tempmailaddress.com/");
        Thread.sleep(10000);
        String dontreply = driver.findElement(By.xpath("//tbody[@id=\"schranka\"]/tr/td")).getText();
        Assert.assertEquals(dontreply, " do-not-reply@practice.cybertekschool.com");
        String subject = driver.findElement(By.xpath("//tbody[@id=\"schranka\"]/tr/td[2]")).getText();
        ////td[contains(text(),'Thanks for subscribing to practice.cybertekschool.com!'
        System.out.println(subject);
        Assert.assertEquals(subject, "Thanks for subscribing to practice.cybertekschool.com!");

    }

    @Test
    public void TestCase7() {
        driver.get("https://practice-cybertekschool.herokuapp.com/");

        WebElement fileUpload = driver.findElement(By.xpath("//a[@href='/upload']"));
        fileUpload.click();
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Parsa\\Downloads\\SmartSelect_20191123-211428_Chrome.gif");
//        WebElement upload = driver.findElement(By.xpath("//input[@value='Upload']"));
//        upload.sendKeys("C:\\Users\\Parsa\\Downloads\\SmartSelect_20191123-211428_Chrome.gif");

driver.navigate().forward();
    }
}