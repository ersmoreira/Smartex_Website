package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginSteps {
    private WebDriver driver;

    @Given("I am on the login page")
    public void navigateToLoginPage() {
        ChromeOptions opts = new ChromeOptions();
        opts.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver(opts);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
    }

    @When("I enter valid username and password")
    public void enterValidCredentials() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector(".btn_action")).click();
    }

    @When("I enter invalid username and password")
    public void enterInvalidCredentials() {
        driver.findElement(By.id("user-name")).sendKeys("invalid_user");
        driver.findElement(By.id("password")).sendKeys("invalid_password");
        driver.findElement(By.cssSelector(".btn_action")).click();
    }

    @When("I enter empty username and password")
    public void enterEmptyCredentials() {
        driver.findElement(By.id("user-name")).sendKeys("");
        driver.findElement(By.id("password")).sendKeys("");
        driver.findElement(By.cssSelector(".btn_action")).click();
    }

    @Then("I should be logged in successfully")
    public void verifySuccessfulLogin() {
        String welcomeMessage = driver.findElement(By.cssSelector(".title")).getText();
        assertEquals("Products", welcomeMessage);
    }

    @Then("I should see an error message")
    public void verifyErrorMessage() {
        String errorMessage = driver.findElement(By.cssSelector("[data-test='error']")).getText();
        assertTrue(errorMessage.contains("Epic sadface"));
    }

    @And("I close the browser")
    public void closeBrowser() {
        driver.quit();
    }
}

