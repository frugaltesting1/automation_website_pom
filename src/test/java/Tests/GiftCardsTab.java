package Tests;
import org.testng.Assert;
import org.testng.annotations.*;

import Base.BaseTest;
import Pages.HomePage;
import Pages.GiftingPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class GiftCardsTab extends BaseTest {
    private HomePage homePage;
    private GiftingPage giftingPage;

    @BeforeMethod
    public void setupTests() throws Exception {
        super.setup();
        homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".acceptcookies")).click();
    }


    @AfterMethod
    public void clearTests() throws InterruptedException {
        // AllureReport.Screenshot(driver,this.getClass().getName());
        driver.quit();
    }

    @Test(description = "Congratulations button working and all cards displayed or not")
    public void verifyIfCongratulationsCard1IsWorking() {
        homePage.clickOnCongratulations();
        Boolean card = homePage.congratulationsCard1IsDisplayed();
        if (!card) {
            Assert.fail("Error : Broken image in congratulations tab 01");
        }
        homePage.closeTab();
    }

    @Test(description = "Congratulations button working and all cards displayed or not")
    public void verifyIfCongratulationsCard2sWorking() {
        homePage.clickOnCongratulations();
        Boolean card = homePage.congratulationsCard2IsDisplayed();
        if (!card) {
            Assert.fail("Error : Broken image in congratulations tab 02");
        }
        homePage.closeTab();
    }

    @Test(description = "Congratulations button working and all cards displayed or not")
    public void verifyIfCongratulationsTabIsWorking() {
        homePage.clickOnCongratulations();
        Boolean card = homePage.congratulationsCard3IsDisplayed();
        if (!card) {
            Assert.fail("Error : Broken image in congratulations tab 03");
        }
        homePage.closeTab();
    }

    @Test(description = "Birthday button working and all cards displayed or not")
    public void verifyIfBirthdayCard1IsWorking() {
        homePage.clickOnBirthday();
        Boolean card = homePage.birthdayCard1IsDisplayed();
        if (!card) {
            Assert.fail("Error : Broken image in congratulations tab 01");
        }
        homePage.closeTab();
    }

    @Test(description = "Birthday button working and all cards displayed or not")
    public void verifyIfBirthdayCard2IsWorking() {
        homePage.clickOnBirthday();
        Boolean card = homePage.birthdayCard2IsDisplayed();
        if (!card) {
            Assert.fail("Error : Broken image in birthday tab 02");
        }
        homePage.closeTab();
    }

    @Test(description = "Birthday button working and all cards displayed or not")
    public void verifyIfBirthdayCard3IsWorking() {
        homePage.clickOnBirthday();
        Boolean card = homePage.birthdayCard3IsDisplayed();
        if (!card) {
            Assert.fail("Error : Broken image in birthday tab 02");
        }
        homePage.closeTab();
    }


}
