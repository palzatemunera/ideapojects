package com.techmahindra2.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

    public static void main(String[] args) {

        WebDriver driver;
        String baseUrl="http://live.demoguru99.com/index.php/checkout/cart/";
        String actualResult = "";
        String expectedResult = "$615.00";
        String chromePath = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver",chromePath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();

        //click en link TV
        driver.findElement(By.linkText("TV")).click();

        //click en botón ADD TO CART
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/div/a/span[2]")).click();

        //obtener el precio
        actualResult = driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr > td.product-cart-price > span > span")).getText();

        if(actualResult.contentEquals(expectedResult)){
            System.out.println("Prueba pasada! el resultado actual es: "+actualResult+ "es igual a " +expectedResult);
        }else {
            System.out.println("Prueba Fallida! el resultado actual es: "+actualResult+ "No es igual a " +expectedResult);
        }
        driver.close();
    }
}
