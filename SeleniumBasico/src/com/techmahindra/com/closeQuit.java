package com.techmahindra.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeQuit {

    static WebDriver driver;
    static String baseUrl= "https://www.popuptest.com/desktop/home";
    static String chromePath = System.getProperty("user.dir")+"//drivers//chromedriver.exe";

    public static void close(){

        driver = new ChromeDriver();
        driver.navigate().to(baseUrl);
        driver.close();
    }

    public static void quit() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get(baseUrl);
        Thread.sleep(2000);
        driver.quit();

    }

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", chromePath);
        close();

    }
}
