package testCases;

import base.BaseClass;
import com.aventstack.chaintest.plugins.ChainTestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;


public class TC001_RegistrationTest extends BaseClass {

    @Test
    public void TC001() throws InterruptedException {
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
        Thread.sleep(1000);

        // Verify Registration Functionality
        registerPage.VerifyRegistration();

    }


}
