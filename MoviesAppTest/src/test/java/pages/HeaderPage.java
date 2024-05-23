package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class HeaderPage {
    private WebDriver driver;


    private By LoginButton=By.className("login-button");
    private By USERNAME=By.id("usernameInput");
    private By PASSWORD=By.id("passwordInput");


    private By HomeNavBar=By.linkText("Home");
    private By PopularNavBar=By.linkText("Popular");
    private By AccountNavBar = By.className("avatar-button");

    private By SearchNavBar = By.className("search-empty-button");
    private By websiteLogo = By.className("website-logo");

    public HeaderPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }


    public boolean isLogoElementLocated(){
        return driver.findElement(websiteLogo).isDisplayed();
    }

    public boolean isHomeNavbarDisplayed() {
        return driver.findElement(HomeNavBar).isDisplayed();
    }
    public boolean isPopularNavBarDisplayed(){
        return  driver.findElement(PopularNavBar).isDisplayed();
    }
    public boolean isAccountNavBarDisplayed(){
        return  driver.findElement(AccountNavBar).isDisplayed();
    }

    public  boolean isSerachNavBarDisplayed(){return driver.findElement(SearchNavBar).isDisplayed();}


    public void LoginToApplication(String username , String password){
        driver.findElement(USERNAME).sendKeys(username);
        driver.findElement(PASSWORD).sendKeys(password);
        driver.findElement(LoginButton).click();
    }


}