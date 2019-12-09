package com.cybertek.tests.VytrekAutomation;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CoinPaprika {
    public static void main(String[] args) {

            WebDriver driver= WebDriverFactory.getDriver("chrome");
            driver.get("https:/www.coinpaprika.com");
            WebElement XRPprice=driver.findElement(By.className("cp-table__cell cp-table__cell--diff cp-table__column--price_price__overview"));

            System.out.println("Current XRP Price: $"+XRPprice);

    }
}
