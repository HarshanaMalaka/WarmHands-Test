package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;


    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@class='link btn-a signin']")
    WebElement Email;

    @FindBy(xpath = "/input[@placeholder='Enter Password']")
    WebElement Passsword;


    public void entEmail(String email){
        Email.sendKeys(email);
    }

    public void entPassword(String password){
        Passsword.sendKeys(password);
    }


}
