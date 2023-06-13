package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login implements Constants {

    public static void openLoginPage(WebDriver driver) {
        driver.get(URL);
    }

    public static void fillCredentials(WebDriver driver, String username, String password) {
        driver.findElement(By.id(Element_Login_Username)).sendKeys(username);
        driver.findElement(By.id(Element_Login_Password)).sendKeys(password);
        driver.findElement(By.cssSelector(Element_Login_BtnAction)).click();
    }

    public static String getErrorMessage(WebDriver driver){
        return driver.findElement(By.cssSelector(Element_Login_Error)).getText();
    }
}
