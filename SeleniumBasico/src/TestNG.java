import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG {

    WebDriver driver;
    String baseUrl = "https://www.advantageonlineshopping.com/#/";
    String chromePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
    String expectedResult = "";
    String actualResult = "";

    @BeforeTest
    public void launchBrowser()

    {

        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();

    }

    @BeforeMethod
    public void verifyHomePageTittle() throws InterruptedException {

        Thread.sleep(3000);
        expectedResult = " Advantage Shopping";
        actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Tittle is not equals");
    }

    @AfterMethod
    public void menuHelp() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id=\"helpLink\"]")).click();
        driver.findElement(By.xpath("//label[@class=\"option ng-scope\" and contains(text(), \"Management Console\") and @href = \"javascript:void(0)\"]")).click();
        Thread.sleep(2000);
        expectedResult = " Advantage Shopping";
        actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Tittle is not equals");
        Assert.assertEquals(actualResult, expectedResult, "Error");
        Assert.assert

    }

    @AfterTest
    public void tearDown()

    {

        driver.quit();

    }

    @Test(priority = 0, enabled = false)
    public void popularItems() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText("POPULAR ITEMS"));
        expectedResult = " Advantage Shopping";
        actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Tittle is not equals");

    }

    @Test(priority = 1)
    public void contactUs() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.linkText("CONTACT US"));
        expectedResult = " Advantage Shopping";
        actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Tittle is not equals");
    }


  }
