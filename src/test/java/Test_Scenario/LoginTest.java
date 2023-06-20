package Test_Scenario;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import Object.HomePage;
import Object.LoginPage;

public class LoginTest extends BaseWebTest{

    WebDriver driver;
    HomePage home;
    LoginPage login;

    @Test
    public void LoginValid() {
        login = new LoginPage(driver);
        home = new HomePage(driver);
        login.InputUsername("standard_user");
        login.InputPassword("secret_sauce");
        login.ClickBtnLogin();
        home.Logo();
        //Assert.assertEquals();
    }

    @Test
    public void LoginUserPassInvalid() {

        login = new LoginPage(driver);
        login.InputUsername("standard_use");
        login.InputPassword("");
        login.ClickBtnLogin();
        login.errorUserPass();
        //Assert.assertEquals();
    }

    @Test
    public void LoginUserInvalid() {

        login = new LoginPage(driver);
        login.InputUsername("");
        login.InputPassword("secret_sauce");
        login.ClickBtnLogin();
        login.errorUser();
        //Assert.assertEquals();
    }

    @Test
    public void LoginPassInvalid() {

        login = new LoginPage(driver);
        login.InputUsername("standard_user");
        login.InputPassword("");
        login.ClickBtnLogin();
        login.errorPass();
        //Assert.assertEquals();
    }

}
