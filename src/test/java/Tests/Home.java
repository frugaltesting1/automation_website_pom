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
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".acceptcookies")).click();
    }

/*
   @AfterMethod
    public void clearTests() throws InterruptedException {
        AllureReport.Screenshot(driver,this.getClass().getName());
        driver.quit();
    }*/

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
