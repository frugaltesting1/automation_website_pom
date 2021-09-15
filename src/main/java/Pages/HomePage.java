package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class HomePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,120);
    }
//private By laterButtonInPendingGiftsPopup = By.xpath("//*[contains(text(),'Later')]");

    //headers
    private By sacredGrovesIcon = By.xpath("//header/nav[1]/div[1]/a[1]/img[1]");

    private By guardians = By.xpath("//a[@id='navLink1']");
    private By joinUs = By.xpath("//a[contains(text(),'Join Us')]");
    private By partnerships = By.xpath("//a[contains(text(),'Partnerships')]");

    private By gifting = By.xpath("//header/nav[1]/div[1]/div[1]/ul[1]/li[2]/a[1]");

    private By forest2 = By.xpath("//a[@id='navLink3']");
    private By ourApproach = By.xpath("//a[contains(text(),'Our Approach')]");
    private By globalClimateIndicators = By.xpath("//a[contains(text(),'Global Climate Indicators')]");
    private By forestOnTheCloud = By.xpath("//a[contains(text(),'Forest on the Cloud')]");
    private By habitatsWeProtect = By.xpath("//a[@id='navLink4']");
    private By coedRhyal = By.linkText("Coed Rhyal");
    private By gigrinPrysg = By.linkText("Gigrin Prysg");

    private By blogs = By.xpath("//a[contains(text(),'Blogs')]");

    private By aboutUs = By.xpath("//a[@id='navLink2']");
    private By deepRoots = By.linkText("Deep Roots");
    private By ourJourney = By.linkText("Our Journey");

    private By loginButton = By.xpath("//button[contains(text(),'Login')]");
    private By signUp = By.xpath("//button[contains(text(),'Sign Up')]");

    private By feedback = By.xpath("//body/div[7]/div[1]/div[1]/div[1]/div[1]/button[1]");
    private By feedbackClose = By.xpath("//body/div[7]/div[1]/div[1]/div[1]/div[1]/button[1]/i[1]");

    private By howItWorks = By.xpath("//button[contains(text(),'How it works')]");
    private By becomeGuardian = By.xpath("//a[contains(text(),'Become a Guardian')]");
    private By learnMore = By.xpath("//button[contains(text(),'Learn more')]");

    private By gbp = By.xpath("//label[contains(text(),'GBP')]");
    private By usd = By.xpath("//label[contains(text(),'USD')]");
    private By euro = By.xpath("//label[contains(text(),'EURO')]");

    private By amountInGBP = By.xpath("//h1[contains(text(),'£ 40')]");
    private By amountInUSD = By.xpath("//h1[contains(text(),'$ 50')]");
    private By amountInEURO = By.xpath("//h1[contains(text(),'€ 45')]");
    //private By amount

    private By signUpNow = By.xpath("//button[contains(text(),'Sign up Now')]");

    private By googleEarth = By.xpath("//body/section[7]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/a[1]/img[1]");
    private By stripe = By.xpath("//body/section[7]/div[1]/div[3]/div[3]/div[1]/div[1]/div[2]/a[1]/img[1]");

    private By joinUs2 = By.xpath("//button[contains(text(),'Join us!')]");
    private By congratulations = By.xpath("//a[@id='nav-gift-tab-1']");
    private By birthday = By.xpath("//a[@id='nav-gift-tab-2']");
    private By general = By.xpath("//a[@id='nav-gift-tab-3']");
    private By thankyou = By.xpath("//a[@id='nav-gift-tab-4']");
    private By anniversary = By.xpath("//a[@id='nav-gift-tab-5']");
    private By findOutHow = By.xpath("//body/section[@id='indexGift']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/div[2]/button[1]");

    //private By facebook = By.xpath("//i[contains(@href,'facebook')]");

    private By facebook = By.xpath("//i[contains(@href,'facebook')]");
    private By linkedin = By.xpath("//i[contains(@class,'linkedin')]");
    private By instagram = By.xpath("//i[contains(@class,'instagram')]");
    private By youtube = By.xpath("//i[contains(@class,'youtube')]");

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getNextTabUrl(){
        ArrayList<String> wins = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(wins.get(wins.size()-1));
        return driver.getCurrentUrl();
    }

    public void closeTab(){
        ArrayList<String> wins = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(wins.get(0));
    }

    public boolean isHomePage() {
        String currUrl = driver.getCurrentUrl();
        return currUrl.contains("developer");
    }

    public boolean visibilityOfHomePage() {
        return driver.findElement(sacredGrovesIcon).isDisplayed();
    }

    public boolean feedbackCloseButtonIsDisplayed() {
        return driver.findElement(feedbackClose).isDisplayed();
    }
    /*public SquadPage clickOnFindOutHowButton() {
        driver.findElement(findOutHowButton).click();
        return new SquadPage(driver);
    }*/

    public GiftingPage clickOnGiftingPage(){
        driver.findElement(gifting).click();
        return new GiftingPage(driver);
    }

    //to click on guardians dropdown
    public void clickOnJoinUsPage(){
        Actions a= new Actions(driver);
        WebElement mainmenu=driver.findElement(guardians);
        a.moveToElement(mainmenu).build().perform();
        WebElement Sub = driver.findElement(joinUs);
        Sub.click();
    }

    public void clickOnPartnershipsPage(){
        Actions a= new Actions(driver);
        WebElement mainmenu=driver.findElement(guardians);
        a.moveToElement(mainmenu).build().perform();
        WebElement Sub = driver.findElement(partnerships);
        Sub.click();
    }


    //to click on forest2.0 dropdown
    public  void clickOnOurApproach(){
        Actions a= new Actions(driver);
        WebElement mainmenu=driver.findElement(forest2);
        a.moveToElement(mainmenu).build().perform();
        WebElement Sub = driver.findElement(ourApproach);
        Sub.click();
    }

    public  void clickOnGlobalClimateIndicators(){
        Actions a= new Actions(driver);
        WebElement mainmenu=driver.findElement(forest2);
        a.moveToElement(mainmenu).build().perform();
        WebElement Sub = driver.findElement(globalClimateIndicators);
        Sub.click();
    }

    public  void clickOnForestOnTheCloud(){
        Actions a= new Actions(driver);
        WebElement mainmenu=driver.findElement(forest2);
        a.moveToElement(mainmenu).build().perform();
        WebElement Sub = driver.findElement(forestOnTheCloud);
        Sub.click();
    }

    public  void clickOnCoedRhyal(){
        Actions a= new Actions(driver);
        WebElement mainmenu=driver.findElement(forest2);
        a.moveToElement(mainmenu).build().perform();
        WebElement Sub = driver.findElement(habitatsWeProtect);
        a.moveToElement(Sub).build().perform();
        WebElement Submenu = driver.findElement(coedRhyal);
        Submenu.click();
    }

    public  void clickOnGigrinPrysg(){
        Actions a= new Actions(driver);
        WebElement mainmenu=driver.findElement(forest2);
        a.moveToElement(mainmenu).build().perform();
        WebElement Sub = driver.findElement(habitatsWeProtect);
        a.moveToElement(Sub).build().perform();
        WebElement Submenu = driver.findElement(gigrinPrysg);
        Submenu.click();
    }

    //to click on about us dropdown
    public void clickOnDeepRoots(){
        Actions a= new Actions(driver);
        WebElement mainmenu=driver.findElement(aboutUs);
        a.moveToElement(mainmenu).build().perform();
        WebElement Sub = driver.findElement(deepRoots);
        Sub.click();
    }

    public void clickOnOurJourney(){
        Actions a= new Actions(driver);
        WebElement mainmenu=driver.findElement(aboutUs);
        a.moveToElement(mainmenu).build().perform();
        WebElement Sub = driver.findElement(ourJourney);
        Sub.click();
    }

    //to click on other button
    public void clickOnLoginButton(){
        driver.findElement(loginButton).click();
    }
    public void clickOnSignUpButton(){
        driver.findElement(signUp).click();
    }
    public void clickOnBlogsButton(){
        driver.findElement(blogs).click();
    }
    public void clickOnFeedbackButton(){
        driver.findElement(feedback).click();
    }
    public void clickOnFeedbackClose(){
        driver.findElement(feedbackClose).click();
    }
    public void clickOnHowItWorks(){
        driver.findElement(howItWorks).click();
    }
    public void clickOnBecomeGuardian(){
        driver.findElement(becomeGuardian).click();
    }
    public void clickOnLearnMore(){
        driver.findElement(learnMore).click();
    }
    public void clickOnGBP(){
        driver.findElement(gbp).click();
    }
    public void clickOnUSD(){
        driver.findElement(usd).click();
    }
    public void clickOnEURO(){
        driver.findElement(euro).click();
    }
    public String getClusterAmountInGBP(){
        return driver.findElement(amountInGBP).getText();
    }
    public String getClusterAmountInUSD(){
        return driver.findElement(amountInUSD).getText();
    }
    public String getClusterAmountInEURO(){
        return driver.findElement(amountInEURO).getText();
    }
    public void clickOnSignUpNow(){
        driver.findElement(signUpNow).click();
    }
    public void clickOnCongratulations(){
        driver.findElement(congratulations).click();
    }
    public void clickOnBirthday(){
        driver.findElement(birthday).click();
    }
    public void clickOnGeneral(){
        driver.findElement(general).click();
    }
    public void clickOnThankYou(){
        driver.findElement(thankyou).click();
    }
    public void clickOnAnniversary(){
        driver.findElement(anniversary).click();
    }public void clickOnFindOUtHow(){
        driver.findElement(findOutHow).click();
    }
    public void clickOnFacebook() {
        driver.findElement(facebook).click();
    }

    public void clickOnInstagram() {
        driver.findElement(instagram).click();
    }

    public void clickOnLinkedin() {
        driver.findElement(linkedin).click();
    }

    public void clickOnYoutube() {
        driver.findElement(youtube).click();
    }



}
