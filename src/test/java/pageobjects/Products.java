package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class Products implements Constants {

    public static String getTextTitlePage(WebDriver driver) {
        return driver.findElement(By.cssSelector(Element_Products_Title)).getText();
    }
}
