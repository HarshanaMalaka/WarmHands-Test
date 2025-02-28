package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//input[@name='fname']")
    WebElement FirstNAme;

    @FindBy(xpath = "//input[@name='lname']")
    WebElement LastName;

    @FindBy(xpath = "//input[@name='address']")
    WebElement Address;

    @FindBy(xpath = "//select[@name='province']")
    WebElement Province;

    @FindBy(xpath = "//select[@name='district']")
    WebElement District;

    @FindBy(xpath = "//select[@name='city']")
    WebElement City;

    @FindBy(xpath = "//input[@name='nic']")
    WebElement NIC;

    @FindBy(xpath = "//input[@name='mobile']" )
    WebElement MobileNumber;

    @FindBy(xpath = "//button[@class='next-btn']")
    WebElement NextBtn;

    @FindBy(xpath = "//input[@name='email']")
    WebElement Email;

    @FindBy(xpath = "//input[@placeholder='Enter Password']")
    WebElement Password;

    @FindBy(xpath = "//input[@placeholder='Enter Password again']")
    WebElement ConfirmPassword;

    @FindBy(xpath = "//button[@class='register-btn']")
    WebElement RegisterBtn;



    //first name
    public void setFirstName (String fName){
        FirstNAme.sendKeys(fName);
    }

    //last name
    public void setLastName (String lName){
        LastName.sendKeys(lName);
    }

    //address
    public void setAddress (String address){
        Address.sendKeys(address);
    }

    //province
    public void setProvince (){
        Select selectprovince = new Select(Province);
        selectprovince.selectByVisibleText("Western");
    }

    //district
    public void setDistrict (){
        Select selectdistrict = new Select(District);
        selectdistrict.selectByVisibleText("Kalutara");
    }

    //city
    public void setCity (){
        Select selectcity = new Select(City);
        selectcity.selectByVisibleText("Panadura");
    }

    //nic
    public void setNIC(String nic){
        NIC.sendKeys(nic);
    }

    //phone number
    public void setPhoneNo(String phoneNo){
        MobileNumber.sendKeys(phoneNo);
    }

    //03.click next button
    public void NextBtn(){
        NextBtn.click();
    }

    //email
    public void setEmail(String email){
        Email.sendKeys(email);
    }

    //password
    public void setPassword(String password){
        Password.sendKeys(password);
    }

    //confirm password
    public void setConfirmPassword(String confirmPass){
        ConfirmPassword.sendKeys(confirmPass);

    }

    //04.click register button
    public void RegisterBtn(){
        RegisterBtn.click();
    }


}
