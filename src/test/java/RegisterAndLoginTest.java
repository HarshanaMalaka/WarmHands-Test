import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class RegisterAndLoginTest {
    WebDriver driver;

    @BeforeMethod
    public void OpenLink(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:5173/");

    }

    @Test
    public void RegisterLogin() throws InterruptedException {

        //Register Page

        //01.click register button
        driver.findElement(By.xpath("//a[@class='link btn-a register']")).click();
        Thread.sleep(1000);

        //02 .Fill the form

        //first name
        driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Test");
        Thread.sleep(500);

        //last name
        driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("User");
        Thread.sleep(500);

        //address
        driver.findElement(By.xpath("//input[@name='address']")).sendKeys("19/C,Bandaragama Rd,Kaluthara");
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
        driver.findElement(By.xpath("//input[@name='nic']")).sendKeys("1234567890");

        //phone number
        driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("0771234568");

        //03.click next button
        driver.findElement(By.xpath("//button[@class='next-btn']")).click();

        //email
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testuserwestern@gmail.com");

        //password
        driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("testpassword");
        Thread.sleep(1000);

        //confirm password
        driver.findElement(By.xpath("//input[@placeholder='Enter Password again']")).sendKeys("testpassword");

        //04.click register button
        driver.findElement(By.xpath("//button[@class='register-btn']")).click();



    }




}
