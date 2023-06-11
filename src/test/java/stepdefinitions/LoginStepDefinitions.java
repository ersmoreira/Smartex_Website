package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinitions {
    private WebDriver driver;

    @Given("I am on the login page")
    public void navigateToLoginPage() {
        // Set up WebDriver configuration
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @When("I enter valid credentials")
    public void enterValidCredentials() {
        // Enter valid credentials
        driver.findElement(By.id("email")).sendKeys("validemail@example.com");
        driver.findElement(By.id("passwd")).sendKeys("validpassword");
        driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then("I should be logged in")
    public void verifyLogin() {
        // Implement verification logic for successful login
        // For example, you can check if the user is redirected to the dashboard page
        // You can use assertions or any other verification technique here
    }

    @When("I enter invalid credentials")
    public void enterInvalidCredentials() {
        // Enter invalid credentials
        driver.findElement(By.id("email")).sendKeys("invalidemail@example.com");
        driver.findElement(By.id("passwd")).sendKeys("invalidpassword");
        driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then("I should see an error message")
    public void verifyErrorMessage() {
        // Implement verification logic for error message display
        // For example, you can check if an error message element is visible on the page
        // You can use assertions or any other verification technique here
    }

    @When("I leave the login credentials blank")
    public void leaveCredentialsBlank() {
        // Leave the login credentials blank
        driver.findElement(By.id("email")).sendKeys("");
        driver.findElement(By.id("passwd")).sendKeys("");
        driver.findElement(By.id("SubmitLogin")).click();
    }

    // Implement the verification step for blank login scenario
}
