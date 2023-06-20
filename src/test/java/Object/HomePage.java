package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    By InventoryContainer = By.xpath("//div[@id='inventory_container']//div//div[@id='inventory_container']");
    By logo = By.xpath("//div[@class='app_logo']");
    By btnHamburger = By.xpath("//button[@id='react-burger-menu-btn']");
    By btnLogout = By.id("logout_sidebar_link");
    WebElement BtnLogout = driver.findElement(By.xpath("logout_sidebar_link"));
    WebElement FilterOption = driver.findElement(By.className("product_sort_container"));

    public void Inventory(){
        driver.findElement(InventoryContainer).isDisplayed();
    }
    public void Logo(){
        driver.findElement(logo).isDisplayed();
    }
    public void HamburgerMenu() {
        driver.findElement(btnHamburger).click();
    }
    public void ClickBtnLogout() { driver.findElement(btnLogout).click(); }

}