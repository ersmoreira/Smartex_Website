package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.netty.util.Constant;
import org.openqa.selenium.WebDriver;
import pageobjects.Constants;
import pageobjects.Login;
import pageobjects.Products;
import pageobjects.Utils;

import java.lang.constant.Constable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginSteps extends Login implements Constants {
    private WebDriver driver;

    @Given("I am on the login page")
    public void navigateToLoginPage() {
        driver = Utils.initializeDriver();
        openLoginPage(driver);
    }

    @When("I enter valid username and password")
    public void enterValidCredentials() {
        fillCredentials(driver, ValidUser, ValidPassword);
    }

    @When("I enter invalid username and password")
    public void enterInvalidCredentials() {
        fillCredentials(driver, InvalidUser, InvalidPassword);
    }

    @When("I enter empty username and password")
    public void enterEmptyCredentials() {
        fillCredentials(driver, "", "");
    }

    @Then("I should be logged in successfully")
    public void verifySuccessfulLogin() {
        assertEquals(Products.getTextTitlePage(driver), Products_Title);
    }

    @Then("I should see an error message")
    public void verifyErrorMessage() {
        assertTrue(Login.getErrorMessage(driver).contains(LoginErrorMessage));
    }

    @And("I close the browser")
    public void closeBrowser() {
        driver.quit();
    }
}

