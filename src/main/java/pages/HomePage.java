package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver; //to more actions

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this); //to identify elements

    }

    @FindBy(xpath = "//a[@class='link btn-a register']")
    public WebElement RegisterBtn;

    @FindBy(xpath = "//a[@class='link btn-a signin']")
    public WebElement LoginBtn;

    public void selectRegisterMenu(){
        RegisterBtn.click();
    }

    public void selectLoginMenu(){
        LoginBtn.click();
    }

}
