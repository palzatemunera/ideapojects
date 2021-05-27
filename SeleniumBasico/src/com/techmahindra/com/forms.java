package com.techmahindra.com;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class forms {

    static WebDriver driver;

    public static void main(String[] args) {


        String baseUrl = "http://advantageonlineshopping.com/#/";
        String chromePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();


        try {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id = \"menuUserSVGPath\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("CREATE NEW ACCOUNT")).click();
            WebElement txtusername = driver.findElement(By.name("usernameRegisterPage"));
            txtusername.sendKeys("pruebaqa");
            Thread.sleep(1500);
            txtusername.clear();
            Thread.sleep(1500);
            txtusername.sendKeys("pruebaqa2");
            WebElement txtemail = driver.findElement(By.name("emailRegisterPage"));
            txtemail.sendKeys("pruebaqa2@gmail.com");
            WebElement txtpassword = driver.findElement(By.name("passwordRegisterPage"));
            txtpassword.sendKeys("Zse45rdx");
            WebElement txtconfirmpass = driver.findElement(By.name("confirm_passwordRegisterPage"));
            txtconfirmpass.sendKeys("Zse45rdx");
            WebElement txtFirstName = driver.findElement(By.name("first_nameRegisterPage"));
            txtFirstName.sendKeys("Pruebas Calidad");
            WebElement txtLastName = driver.findElement(By.name("last_nameRegisterPage"));
            txtLastName.sendKeys("Assurance Assurance");
            Select drpCountry = new Select(driver.findElement(By.name("countryListboxRegisterPage")));
            Thread.sleep(1500);
            drpCountry.selectByVisibleText("Costa Rica");
            driver.findElement(By.name("cityRegisterPage")).sendKeys("Cartago");
            driver.findElement(By.name("addressRegisterPage")).sendKeys("Avenida las Palmas 56");
            driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("1155223");
            driver.findElement(By.name("i_agree")).click();
            Thread.sleep(1500);
            driver.findElement(By.id("register_btnundefined")).click();

            System.out.println("Prueba exitosa! " + driver.findElement(By.id("menuUserLink")).getText());

        }
        catch(NoSuchElementException ne){
                System.err.println("No se encontró el WebElement: " + ne.getMessage());
            }catch(WebDriverException we){
                System.err.println("WebDriver falló: " + we.getMessage());
            }catch(Exception ex){
                System.err.println(ex.getMessage());

            } finally{
                driver.quit();
            }

        }
    }


