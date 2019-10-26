package com.cybertek.tests.d1_basic_navigation;
        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
public class OpenBrowserDemo {
    public static void main(String[] args) {
        // option+enter MAC
        // alt+enter    WIN

        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();
    }
}
