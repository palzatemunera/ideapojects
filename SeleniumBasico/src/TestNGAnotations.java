import org.testng.annotations.*;

public class TestNGAnotations {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("@BeforeSuite Este método se ejecuta antes de una suite de pruebas");

    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("@BeforeTest Este método se ejecuta antes de las pruebas @Test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("@BeforeClass Este método se ejecuta antes de la clase");

                    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("@BeforeMethod Se ejecuta antes de cada método de prueba @Test");

    }

    @Test
    public void testCase1(){
        System.out.println("@Test Caso de prueba No.1");

    }

    @Test
    public void testCase2(){
        System.out.println("@Test Caso de prueba No.2");

    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("@AfterMethod Se ejecuta después de cada método de prueba");

    }

    @AfterClass
    public void afterClass(){
        System.out.println("@AfterClass Este método se ejecuta después de la clase");

    }
    @AfterTest
    public void afterTest(){
        System.out.println("@AfterTest Este método se ejecuta después de todas las pruebas");

    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("@AfterSuite Este método se ejecuta después de una suite de pruebas");

    }
    }

