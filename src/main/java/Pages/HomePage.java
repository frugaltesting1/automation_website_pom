package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    private By gifting = By.xpath("");

    private By forest2 = By.xpath("");
    private By ourApproach = By.xpath("");
    private By globalClimateIndicators = By.xpath("");
    private By forestOnTheCLoud = By.xpath("");
    private By habitatsWeProtect = By.xpath("");
    private By coedRhyal = By.xpath("");
    private By gigrinPrysg = By.xpath("");

    private By blogs = By.xpath("");

    private By aboutUs = By.xpath("");
    private By  = By.xpath("");
    private By ourApproach = By.xpath("");





}
