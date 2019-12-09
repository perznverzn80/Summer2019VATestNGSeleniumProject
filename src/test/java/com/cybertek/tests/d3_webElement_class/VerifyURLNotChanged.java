package com.cybertek.tests.d3_webElement_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    public class VerifyURLNotChanged {

        /*
        Verify URL not changed
        open browser
        go to http://practice.cybertekschool.com/forgot_password
        click on Retrieve password
        verify that url did not change
         */
          public static void main(String[] args) {

            WebDriver driver= WebDriverFactory.getDriver("chrome");
  //        go to http://practice.cybertekschool.com/forgot_password
            driver.get("http://practice.cybertekschool.com/forgot_password");
            String expectedURL=driver.getCurrentUrl();
            //click on retrieve password
             //web element--> class that represents elements from the webpage
              //findElement--> method used to ffind element on a page
              // returns a webelement
              WebElement retrievePassword=driver.findElement(By.id("form_submit"));
              retrievePassword.click();
              // verify that url did no change
              String actualURL=driver.getCurrentUrl();
              if (actualURL.equals(expectedURL)){
                  System.out.println("Pass");
                   }else{
                  System.out.println("Failed");
              }



        }


}
