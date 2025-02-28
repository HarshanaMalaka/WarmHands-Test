package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import java.time.Duration;

public class TC001_RegistrationTest {

    WebDriver driver;

    @BeforeMethod
    public void OpenLink(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://localhost:5173/");

    }

    @Test
    public void TC001()  {
        HomePage homePage = new HomePage(driver);
        homePage.selectRegisterMenu();


        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.setFirstName("Test");
        registerPage.setLastName("User");
        registerPage.setAddress("19/C,Bandaragama Rd,Kaluthara");
        registerPage.setProvince();
        registerPage.setDistrict();
        registerPage.setCity();
        registerPage.setNIC("1234567890");
        registerPage.setPhoneNo("0771234568");
        registerPage.NextBtn();
        registerPage.setEmail("testuserwestern@gmail.com");
        registerPage.setPassword("testpassword");
        registerPage.setConfirmPassword("testpassword");
        registerPage.RegisterBtn();

    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
