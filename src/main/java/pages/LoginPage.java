package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

    WebDriver driver;


    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@type='email']")
    WebElement Email;

    @FindBy(xpath = "//input[@placeholder='Enter Password']")
    WebElement Passsword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement LoginBtn;

    @FindBy(xpath = "//a[@class='report-btn']")
    WebElement VerifyBtn;


    public void entEmail(String email){
        Email.sendKeys(email);
    }

    public void entPassword(String password){
        Passsword.sendKeys(password);
    }

    public void LoginBtn(){
        LoginBtn.click();
    }

    public void VerifyLogin(){
        String expectedText = "Make Report";
        String actualTest = VerifyBtn.getText();
        Assert.assertEquals(actualTest, expectedText);
    }


}
