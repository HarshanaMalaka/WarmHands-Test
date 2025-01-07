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
        //01.click register button
        driver.findElement(By.xpath("//a[@class='link btn-a register']")).click();
        Thread.sleep(1000);

        //Fill the form
        driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Test");
        Thread.sleep(500);

        driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("User");
        Thread.sleep(500);

        driver.findElement(By.xpath("//input[@name='address']")).sendKeys("19/C,Bandaragama Rd,Kaluthara");
        Thread.sleep(500);

        WebElement dropdown =driver.findElement(By.xpath("//select[@name='province']"));
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText("Western");
    }




}
