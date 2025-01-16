package UseRegistrationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;


public class RegistrationTest {
    WebDriver driver;

    @BeforeMethod
    public void OpenLink(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://localhost:5173/");

    }

    @DataProvider ( name = "registerData")
    public String[][] registerDataProvider(){
        String[][] data={
                {"Test","User","19/C,Bandaragama Rd,Kaluthara","1234567890","0771234568","testuserwestern@gmail.com","testpassword","testpassword","valid"}
        };

        return data;

    }






    @Test(dataProvider = "registerData")
    public void UserRegistration(String fName,String lName,String address,String nic,String telNo,String gmail,String pass,String confirmPass,String validation) throws InterruptedException {

        //Register Page

        //01.click register button
        driver.findElement(By.xpath("//a[@class='link btn-a register']")).click();
        Thread.sleep(1000);

        //02 .Fill the form

        //first name
        driver.findElement(By.xpath("//input[@name='fname']")).sendKeys(fName);
        Thread.sleep(500);

        //last name
        driver.findElement(By.xpath("//input[@name='lname']")).sendKeys(lName);
        Thread.sleep(500);

        //address
        driver.findElement(By.xpath("//input[@name='address']")).sendKeys(address);
        Thread.sleep(500);

        //province
        WebElement dropdownprovince =driver.findElement(By.xpath("//select[@name='province']"));
        dropdownprovince.click();
        Select selectprovince = new Select(dropdownprovince);
        selectprovince.selectByVisibleText("Western");

        //district
        WebElement dropdowndistrict=driver.findElement(By.xpath("//select[@name='district']"));
        dropdowndistrict.click();
        Select selectdistrict = new Select(dropdowndistrict);
        selectdistrict.selectByVisibleText("Kalutara");

        //city
        WebElement dropdowncity=driver.findElement(By.xpath("//select[@name='city']"));
        dropdowncity.click();
        Select selectcity = new Select(dropdowncity);
        selectcity.selectByVisibleText("Panadura");

        //nic
        driver.findElement(By.xpath("//input[@name='nic']")).sendKeys(nic);

        //phone number
        driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys(telNo);

        //03.click next button
        driver.findElement(By.xpath("//button[@class='next-btn']")).click();

        //email
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(gmail);

        //password
        driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys(pass);
        Thread.sleep(1000);

        //confirm password
        driver.findElement(By.xpath("//input[@placeholder='Enter Password again']")).sendKeys(confirmPass);

        //04.click register button
        driver.findElement(By.xpath("//button[@class='register-btn']")).click();


        Thread.sleep(2000);

        Boolean verification= driver.getCurrentUrl().contains("signin");

        if (validation.equals("valid")){
            Assert.assertTrue(verification,"Registration is successful but not redirecting to the Signin page");
        }else {
            Assert.assertFalse(verification, "Registration is unsuccessful but redirecting to the signin page");
        }


    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }




}
