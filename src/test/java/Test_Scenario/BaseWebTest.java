package Test_Scenario;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseWebTest {

    private WebDriver driver;

    @Before
    public void beforeTest(){

        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");
    }

    @After
    public void afterTest(){
        driver.quit();
    }
}
