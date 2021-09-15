package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GiftingPage {
    public WebDriver driver;
    public WebDriverWait wait;

    public GiftingPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,120);
    }
    public boolean isEcoFriendlyGiftingPage() {
        String currUrl = driver.getCurrentUrl();
        return currUrl.contains("eco-friendly-gifts");
    }

}
