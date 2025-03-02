package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseClass {

    public WebDriver driver;

    @BeforeMethod

    public void OpenLink(){

        String browser = "Chrome";

        switch (browser.toLowerCase()){
            case    "chrome":
                driver = new ChromeDriver(); break;
            case    "edge":
                driver = new EdgeDriver(); break;
            case "firefox":
                driver = new FirefoxDriver(); break;
            default:
                System.out.println("Browser Not Supported : " + browser);
                return;
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://localhost:5173/");

    }
    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
