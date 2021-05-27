package com.techmahindra.com;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverExceptions {

    static WebDriver driver;

    public static void main(String[] args) {

        try {

            String baseUrl = "http://live.demoguru99.com/index.php/checkout/cart/";
            String actualResult = "";
            String expectedResult = "$615.00";
            String chromePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";

            System.setProperty("webdriver.chrome.driver", chromePath);
            driver = new ChromeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();

            //click en link TV
            WebElement lnkTV = driver.findElement(By.linkText("TV"));
            lnkTV.click();

            WebElement btnAddToCart = driver.findElement(By.xpath("//*[@id=\"to\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/button/span/span"));
            btnAddToCart.click();

            WebElement lblSubTotal = driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr > td.product-cart-total > span > span"));
            actualResult = lblSubTotal.getText();

            if (actualResult.contentEquals(expectedResult)) {
                System.out.println("Prueba pasada! el resultado actual es: " + actualResult + "es igual a " + expectedResult);
            } else {
                System.out.println("Prueba Fallida! el resultado actual es: " + actualResult + "No es igual a " + expectedResult);
            }
        }
            catch(NoSuchElementException ne){
                System.err.println("No se encontró el WebElement: " + ne.getMessage());
            }catch(WebDriverException we){
            System.err.println("WebDriver falló: " + we.getMessage());
        }catch(Exception ex){
            System.err.println(ex.getMessage());

        } finally{
            driver.close();
        }
    }

}