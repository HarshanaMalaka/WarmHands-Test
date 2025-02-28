package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;


import java.time.Duration;

public class TC002_LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void OpenLink(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://localhost:5173/");

    }

    @Test
    public void TC002() throws InterruptedException {
        HomePage homePage  = new HomePage(driver);
        homePage.selectLoginMenu();
        Thread.sleep(1000);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.entEmail("testuserwestern@gmail.com");
        loginPage.entPassword("testpassword");
        loginPage.LoginBtn();
    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
