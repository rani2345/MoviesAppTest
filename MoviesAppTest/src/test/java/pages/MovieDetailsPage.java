package pages;
import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
public class MovieDetailsPage {
    public WebDriver driver;
    private WebDriverWait  wait;

    private By LoginButton=By.className("login-button");
    private By USERNAME=By.id("usernameInput");
    private By PASSWORD=By.id("passwordInput");

    private By HomeNavBar=By.linkText("Home");
    private By PopularNavBar=By.linkText("Popular");
    private By AccountNavBar = By.className("avatar-button");
    private By websiteLogo = By.className("website-logo");
    private By movieTitle = By.className("movie-title");

    private By watchTime = By.className("watch-time");
    private By sensorRating = By.className("sensor-rating");
    private By releaseYear = By.className("release-year");
    private By movieOverview = By.className("movie-overview");
    private By playButton = By.className("play-button");


    private By  genresCategory = By.className("genres-category");
    private By genresHeading = By.className("genres-heading");
    private By genresParagraphContainer = By.className("genres-container");
    private By audioCategory = By.className("audio-category");
    private By audioHeading = By.className("audio-heading");
    private By audioParagraphListContainer = By.className("audio-container");


    private By ratingCategory =  By.className("rating-category");
    private By ratingHeading = By.className("rating-heading");
    private By categoryParagraph = By.className("category-paragraph");
    private By ratingAverageHeading = By.className("rating-average-heading");
    private By  ratingParagraph = By.className("category-paragraph");
    private By budgetCategory = By.className("budget-category");
    private By budgetHeading = By.className("budget-heading");
    private By budgetCategoryParagraph = By.className("category-paragraph");
    private By releaseDateHeading = By.className("release-date-heading");
    private By releaseDateParagraph = By.className("category-paragraph");
    private By similarMoviesContainer = By.className("similar-movies-container");
    private By similarMoviesHeading = By.className("similar-movies-heading");
    private By similarMoviesListContainer = By.className("similar-movies-list-container");
    private By footerContainer = By.className("footer-container");
    private By footerIconsContainer = By.className("footer-icons-container");

    private By googleIcon = By.className("google-icon");
    private By twitterIcon = By.className("twitter-icon");
    private By instagramIcon = By.className("instagram-icon");
    private By youTubeIcon = By.className("youtube-icon");
    private By contactUs = By.className("contact-us-paragraph");
    private By moreLikeThisMoviesList = By.className("image-style");
    private By popularMovieIconItem = By.className("movie-icon-item");

    public MovieDetailsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(20));
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
    public  boolean isSerachNavBarDisplayed(){return driver.findElement(AccountNavBar).isDisplayed();}

    public boolean checkTitleDetailsContainer(){
        boolean isAllDisplayed = driver.findElement(movieTitle).isDisplayed() && driver.findElement(watchTime).isDisplayed() && driver.findElement(sensorRating).isDisplayed()  && driver.findElement(releaseYear).isDisplayed() && driver.findElement(movieOverview).isDisplayed() && driver.findElement(playButton).isDisplayed();
        return isAllDisplayed;
    }


    public boolean checkDetailedMovieCategoriesContainer(){

        boolean iSAllDisplayed =

                driver.findElement(genresCategory).isDisplayed() && driver.findElement(genresHeading).isDisplayed() &&
                        driver.findElement(genresParagraphContainer).isDisplayed() && driver.findElement(audioCategory).isDisplayed() &&
                        driver.findElement(audioHeading).isDisplayed() && driver.findElement(audioParagraphListContainer).isDisplayed() &&
                        driver.findElement(ratingCategory).isDisplayed() && driver.findElement(ratingHeading).isDisplayed() &&
                        driver.findElement(categoryParagraph).isDisplayed() && driver.findElement(ratingAverageHeading).isDisplayed() &&
                        driver.findElement(ratingParagraph).isDisplayed() && driver.findElement(budgetCategory).isDisplayed() &&
                        driver.findElement(budgetHeading).isDisplayed() && driver.findElement(budgetCategoryParagraph).isDisplayed() &&
                        driver.findElement(releaseDateHeading).isDisplayed() && driver.findElement(releaseDateParagraph).isDisplayed();

        return  iSAllDisplayed;

    }

    public  boolean similarMoviesContainer(){
        boolean isAllDisplayed = driver.findElement(similarMoviesContainer).isDisplayed() &&
                driver.findElement(similarMoviesHeading).isDisplayed() && driver.findElement(similarMoviesListContainer).isDisplayed();
        return  isAllDisplayed;
    }

    public boolean checkFooterContainer(){
        boolean isAllDisplayed = driver.findElement(footerContainer).isDisplayed() &&  driver.findElement(footerIconsContainer).isDisplayed();
        return isAllDisplayed;
    }
    public boolean checkAllIcons(){
        boolean are_Visible = driver.findElement(googleIcon).isDisplayed() && driver.findElement(twitterIcon).isDisplayed() &&
                driver.findElement(instagramIcon).isDisplayed() &&
                driver.findElement(youTubeIcon).isDisplayed() &&
                driver.findElement(contactUs).isDisplayed() ;
        return are_Visible;
    }

    public boolean checkMoreLikeThisMoviesList(){
        return driver.findElement(moreLikeThisMoviesList).isDisplayed();
    }

    public boolean checkPopularsMovieList(){
        return driver.findElement(popularMovieIconItem).isDisplayed();

    }

    public void LoginToApplication(String username , String password){
        driver.findElement(USERNAME).sendKeys(username);
        driver.findElement(PASSWORD).sendKeys(password);
        driver.findElement(LoginButton).click();
    }
}