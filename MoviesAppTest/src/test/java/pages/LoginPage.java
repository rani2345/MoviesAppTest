package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    // Methods to interact with elements on the Login Page
    public boolean isLogoDisplayed() {
        WebElement logo = driver.findElement(By.className("login-website-logo"));   // update this line
        return logo.isDisplayed();
    }

    public String getHeadingText() {
        WebElement heading = driver.findElement(By.tagName("h1"));
        return heading.getText();
    }

    public String getUsernameLabelText() {
        WebElement usernameLabel = driver.findElement(By.xpath("//label[contains(text(), 'USERNAME')]"));
        return usernameLabel.getText();
    }

    public String getPasswordLabelText() {
        WebElement passwordLabel = driver.findElement(By.xpath("//label[contains(text(), 'PASSWORD')]"));
        return passwordLabel.getText();
    }

    public boolean isLoginButtonDisplayed() {
        WebElement loginButton = driver.findElement(By.className("login-button"));    // update this line
        return loginButton.isDisplayed();
    }

    public void login(String username, String password) {
        WebElement usernameField = driver.findElement(By.id("usernameInput"));
        WebElement passwordField = driver.findElement(By.id("passwordInput"));
        WebElement loginButton = driver.findElement(By.className("login-button"));    // update this line

        usernameField.sendKeys("rahul");
        passwordField.sendKeys("rahul@2021");
        loginButton.click();
    }

    public boolean isErrorMessageDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("error-message")));
        WebElement errorMessage = driver.findElement(By.className("error-message"));
        return errorMessage.isDisplayed();
    }

    public boolean isUserLoggedIn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech"));
        // Check if user is logged in by verifying elements visible after successful login
        return driver.getCurrentUrl().equals("https://qamoviesapp.ccbp.tech");
    }
}