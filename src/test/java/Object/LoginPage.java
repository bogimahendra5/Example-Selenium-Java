package Object;

import Test_Scenario.BaseWebTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage extends BaseWebTest {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    By Username = By.xpath("//input[@id='user-name']");
    By Password = By.xpath("//input[@id='password']");
    By btnLogin = By.xpath("//input[@id='login-button']");
    By invalidUserPass = By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]");
    By invalidUser = By.xpath("//h3[normalize-space()='Epic sadface: Username is required']");
    By invalidPass = By.xpath("//h3[normalize-space()='Epic sadface: Password is required']");


    public void InputUsername(String username){ driver.findElement(Username).sendKeys(username); }

    public void InputPassword(String password){
        driver.findElement(Password).sendKeys(password);
    }

    public void ClickBtnLogin(){
        driver.findElement(btnLogin).click();
    }

    public void errorUserPass(){
        driver.findElement(invalidUserPass).isDisplayed();
    }

    public void errorUser(){
        driver.findElement(invalidUser).isDisplayed();
    }

    public void errorPass(){
        driver.findElement(invalidPass).isDisplayed();
    }



}
