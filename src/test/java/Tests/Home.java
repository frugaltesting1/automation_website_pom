package Tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import Base.BaseTest;
import Pages.HomePage;
import Pages.GiftingPage;

import utility.AllureReport;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Home extends BaseTest{
    private HomePage homePage;
    private GiftingPage giftingPage;

   @BeforeMethod
    public void setupTests() throws Exception {
        super.setup();
        homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".acceptcookies")).click();
    }


   @AfterMethod
    public void clearTests() throws InterruptedException {
       // AllureReport.Screenshot(driver,this.getClass().getName());
        driver.quit();
    }

    @Test(description = "Test:To check if sacred groves logo is visible or not")
    public void verifySacredGrovesLogoVisibility(){
        Boolean homeIcon = homePage.visibilityOfHomePage();
        if(!homeIcon)
        {
            Assert.fail();
        }
        homePage.closeTab();
    }

    @Test(description = "Test:Check to see if we landed on home page")
    public void verifyIfHomePage() {
        Boolean homePageUrl = homePage.visibilityOfHomePage();
        if(!homePageUrl)
        {
            Assert.fail();
        }
        homePage.closeTab();

    }

    @Test(description="Test:Click On join us, verifying if it is taking to join us page")
    public void verifyIfJoinUsIconIsWorking() {
        homePage.clickOnJoinUsPage();
        String url = homePage.getNextTabUrl();
        if(!url.contains("environmental-volunteering")){
            Assert.fail();
        }
        homePage.closeTab();
    }

    @Test(description="Test:Click On partnerships, verifying if it is taking to partnerships page")
    public void verifyIfPartnershipsIsWorking() {
        homePage.clickOnPartnershipsPage();
        String url = homePage.getNextTabUrl();
        if(!url.contains("partnerships")){
            Assert.fail();
        }
        homePage.closeTab();
    }

    @Test(description="Test:Click On global climate indicators, verifying if it is taking to correct page")
    public void verifyIfGlobalClimateIndicatorsIsWorking() {
        homePage.clickOnGlobalClimateIndicators();
        String url = homePage.getNextTabUrl();
        if(!url.contains("global-climate-indicators")){
            Assert.fail();
        }
        homePage.closeTab();
    }

    @Test(description="Test:Click On forest on the cloud, verifying if it is taking to correct page")
    public void verifyIfForestOnTheCloudIsWorking() {
        homePage.clickOnForestOnTheCloud();
        String url = homePage.getNextTabUrl();
        if(!url.contains("forest-on-the-cloud")){
            Assert.fail();
        }
        homePage.closeTab();
    }

    @Test(description="Test:Click On Coed Rhyal, verifying if it is taking to correct page")
    public void verifyIfCoedRhyalIsWorking() {
        homePage.clickOnCoedRhyal();
        String url = homePage.getNextTabUrl();
        if(!url.contains("forest-coed-rhyal")){
            Assert.fail();
        }
        homePage.closeTab();
    }

    @Test(description="Test:Click On Gigrin Prysg, verifying if it is taking to correct page")
    public void verifyIfGigrinPrysgIsWorking() {
        homePage.clickOnGigrinPrysg();
        String url = homePage.getNextTabUrl();
        if(!url.contains("forest-gigrin-prysg")){
            Assert.fail();
        }
        homePage.closeTab();
    }

    @Test(description="Test:Click On our approach, verifying if it is taking to our approach page")
    public void verifyIfOurApproachIsWorking() {
        homePage.clickOnOurApproach();
        String url = homePage.getNextTabUrl();
        if(!url.contains("forest-2.0")){
            Assert.fail();
        }
        homePage.closeTab();
    }

    @Test(description="Test:Click On Gifting, verify if it is taking to eco-friendly gifting page")
    public void verifyIfClickOnGiftingLeadsToEcoFriendlyGiftingPage() {

        giftingPage = homePage.clickOnGiftingPage();
        if(giftingPage.isEcoFriendlyGiftingPage()) {
            System.out.println("Eco-Friendly Gifting Page is Opened");
        } else {
            System.out.println("ERROR: It should Open Gifting Page, But Not opened now.");
            Assert.fail();
        }
    }

    @Test(description="Test:Click On Login, verifying if it is taking to Login page")
    public void verifyIfLoginButtonIsWorking() {
        homePage.clickOnLoginButton();
        String url = homePage.getNextTabUrl();
        if(!url.endsWith("/login")){
            Assert.fail();
        }
        homePage.closeTab();
    }

    @Test(description="Test:Click On SignUp, verifying if it is taking to SignUp page")
    public void verifyIfSignUpIsWorking() {
        homePage.clickOnSignUpButton();
        String url = homePage.getNextTabUrl();
        if(!url.endsWith("/signup")){
            Assert.fail();
        }
        homePage.closeTab();
    }

    @Test(description="Test:Click On Feedback, verifying if it is opening feedback PopUp")
    public void verifyIfFeedbackToolIsOpening() {
        homePage.clickOnFeedbackButton();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Boolean feedbackCloseIcon = homePage.feedbackCloseButtonIsDisplayed();
        if(!feedbackCloseIcon) {
            System.out.println("Fail : Feedback Tool is not opening");
            Assert.fail();
        }
        homePage.clickOnFeedbackClose();
        homePage.closeTab();

    }

    @Test(description="Test:Click On HowItWorks Button")
    public void verifyIfHowItWorksIsWorking() {
        homePage.clickOnHowItWorks();
        String url = homePage.getCurrentUrl();
        if(!url.endsWith("#partnerfive")){
            Assert.fail();
        }
        homePage.closeTab();
    }

    @Test(description="Test:Click On Become A Guardian Button")
    public void verifyIfBecomeGuardianWorking() {
        homePage.clickOnBecomeGuardian();
        String url = homePage.getCurrentUrl();
        if(!url.endsWith("#homeTwo")){
            Assert.fail();
        }
        homePage.closeTab();
    }

    @Test(description="Test:Click On Learn More Button")
    public void verifyIfLearnMoreWorking() {
        homePage.clickOnLearnMore();
        String url = homePage.getNextTabUrl();
        if(!url.endsWith("/deeproots")){
            Assert.fail();
        }
        homePage.closeTab();
    }

    @Test(description="Test:Click On Google Earth Button")
    public void verifyIfGoogleEarthButtonWorking() {
        homePage.clickOnGoogleEarth();
        String url = homePage.getNextTabUrl();
        if(!url.contains("https://earth.google.com/web/")){
            Assert.fail();
        }
        homePage.closeTab();
    }

    @Test(description="Test:Click On Stripe Button")
    public void verifyIfStripeButtonWorking() {
        homePage.clickOnStripe();
        String url = homePage.getNextTabUrl();
        if(!url.contains("https://stripe.com/en-in")){
            Assert.fail();
        }
        homePage.closeTab();
    }

    @Test(description="Test:Click On Join Us Button")
    public void verifyIfJoinUsButtonWorking() {
        homePage.clickOnJoinUs2();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        String url = homePage.getNextTabUrl();
        if(!url.endsWith("/signup")){
            Assert.fail();
        }
        homePage.closeTab();
    }



    @Test(description="Test:Click on Facebook Icon on Footer, verify if it is taking to facebook page or not.")
    public void verifyIfFacebookIconLeadsToFacebookPage() {
        homePage.clickOnFacebook();
        String url = homePage.getNextTabUrl();
        if(!url.contains("facebook")){
            Assert.fail();
        }
        homePage.closeTab();
    }

    @Test(description="Test:Click on Instagram Icon on Footer, verify if it is taking to instagram page or not.")
    public void verifyIfInstagramIconLeadsToInstagramPage() {
        homePage.clickOnInstagram();
        String url = homePage.getNextTabUrl();
        if(!url.contains("instagram")){
            Assert.fail();
        }
        homePage.closeTab();
    }

    @Test(description="Test:Click on Linkedin Icon on Footer, verify if it is taking to facebook page or not.")
    public void verifyIfLinkedinIconLeadsToLinkedinPage() {
        homePage.clickOnLinkedin();
        String url = homePage.getNextTabUrl();
        if(!url.contains("linkedin")){
            Assert.fail();
        }
        homePage.closeTab();
    }

    @Test(description="Test:Click on Youtube Icon on Footer, verify if it is taking to youtube page or not.")
    public void verifyIfYoutubeIconLeadsToYoutubePage() {
        homePage.clickOnYoutube();
        String url = homePage.getNextTabUrl();
        if(!url.contains("youtube")){
            Assert.fail();
        }
        homePage.closeTab();
    }



}
