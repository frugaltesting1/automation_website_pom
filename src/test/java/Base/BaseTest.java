package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import Utility.Config;

    public class BaseTest {
        //this is base test
        public WebDriver driver;
        public String baseURL;
        Utility.Config config = new Utility.Config();


        public void setup() {
            System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();

            options.setHeadless(true);
            options.addArguments("--start-maximized");
            options.addArguments("--lang=en_US");

            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            baseURL=config.getBaseUrl();
            driver.get(baseURL);
        }


}
