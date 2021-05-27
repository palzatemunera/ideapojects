import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseTeclado {

    static WebDriver driver;

    public static void main(String[] args) {

        String baseUrl = "https://www.facebook.com/";
        String chromePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();

        try {

            WebElement txtemail = driver.findElement(By.id("email"));
            Actions builder = new Actions(driver);
            Action seriesOfAction = builder
                    .moveToElement(txtemail)
                    .click()
                    .keyDown(Keys.SHIFT)
                    .sendKeys("hello")
                    .keyUp(Keys.SHIFT)
                    .doubleClick()
                    .contextClick(txtemail)
                    .build();
            seriesOfAction.perform();
            Thread.sleep(2000);
            System.out.println("Test passed!");

        } catch (NoSuchElementException ne) {
            System.err.println("No se encontró el WebElement: " + ne.getMessage());
        } catch (WebDriverException we) {
            System.err.println("WebDriver falló: " + we.getMessage());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());

        } finally {
            driver.close();
        }
    }

}