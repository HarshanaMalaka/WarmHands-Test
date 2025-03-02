package testCases;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;


public class TC002_LoginTest extends BaseClass {


    @Test
    public void TC002() throws InterruptedException {
        HomePage homePage  = new HomePage(driver);
        homePage.selectLoginMenu();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.entEmail("testuserwestern@gmail.com");
        loginPage.entPassword("testpassword");
        loginPage.LoginBtn();
        Thread.sleep(1000);

        // Verify Login Functionality
        loginPage.VerifyLogin();
    }

}
