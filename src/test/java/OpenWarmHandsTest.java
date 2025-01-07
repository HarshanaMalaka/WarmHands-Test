import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenWarmHandsTest {

    WebDriver driver;

    @Test
    public void openLinkTest() throws InterruptedException {
        //create new object
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:5173/");


        //navigation link tests
        WebElement homelink = driver.findElement(By.linkText("Home"));
        homelink.click();
        Thread.sleep(2000);

        WebElement newslink = driver.findElement(By.linkText("News"));
        newslink.click();
        Thread.sleep(5000);

        WebElement maplink = driver.findElement(By.linkText("Map"));
        maplink.click();
        Thread.sleep(5000);

        WebElement contactlink = driver.findElement(By.linkText("Contact"));
        contactlink.click();
        Thread.sleep(5000);

        driver.quit();



    }
}
