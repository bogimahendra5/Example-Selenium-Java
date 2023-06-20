package Test_Scenario;

import Object.HomePage;
import Object.LoginPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LogoutTest extends BaseWebTest{

    WebDriver driver;
    @Test
    public void Logout(){
        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);

        login.InputUsername("standard_user");
        login.InputPassword("secret_sauce");
        login.ClickBtnLogin();
        home.HamburgerMenu();
        home.ClickBtnLogout();
        login.ClickBtnLogin();
    }
}
