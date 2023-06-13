package pageobjects;

public interface Constants {
    // Generic
    String URL = "https://www.saucedemo.com";
    String ValidUser = "standard_user";
    String ValidPassword = "secret_sauce";
    String InvalidUser = "invalid_user";
    String InvalidPassword = "invalid_password";
    String LoginErrorMessage = "Epic sadface";

    // Login Page
    String Element_Login_Username = "user-name";
    String Element_Login_Password = "password";
    String Element_Login_BtnAction = ".btn_action";
    String Element_Login_Error = "[data-test='error']";

    // Products Page

    String Element_Products_Title = ".title";
    String Products_Title = "Products";
}
