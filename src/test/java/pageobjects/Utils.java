package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Utils {

    public static WebDriver initializeDriver() {
        WebDriver driver;
        ChromeOptions opts = new ChromeOptions();
        opts.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver(opts);
        driver.manage().window().maximize();
        return driver;
    }
}
