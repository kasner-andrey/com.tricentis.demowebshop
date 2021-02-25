package ddt.page;


import core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    //new customer block
    @FindBy(className = "button-1 register-button")
    private WebElement registerButton;
    //returning customer
    @FindBy(id = "Email")
    private WebElement emailField;
    @FindBy(id = "Password")
    private WebElement passwordField;
    //remember
    @FindBy(id = "RememberMe")
    private WebElement rememberOnButton;
    //forgot password
    @FindBy(linkText = "Forgot password?")
    private WebElement forgotPasswordLink;
    //Log in
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
    private WebElement logInButton;
    //error log in
    @FindBy(className = "validation-summary-errors")
    private WebElement errorLogInText;
    //error inValid email
    @FindBy(className = "field-validation-error")
    private WebElement errorEmailText;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("inputEmail")
    public LoginPage inputEmail(String email) {
        inputField(emailField, email);
        return this;
    }
    @Step("inputPassword")
    public LoginPage inputPassword(String password) {
        inputField(passwordField, password);
        return this;
    }
    public LoginPage inputRememberMe() {
        rememberOnButton.click();
        return this;
    }
    @Step("succesLogInButtonClick")
    public HomeRegisterPage succesLogInButtonClick(){
        logInButton.click();
        return new HomeRegisterPage(driver);
    }
    @Step("failLogInButtonClick")
    public LoginPage failLogInButtonClick(){
        logInButton.click();
        return this;
    }
    public WebElement errorMessInputEmail(){
        return errorEmailText;
    }
    public WebElement ErrorInputLogIn(){
        return errorLogInText;
    }
    public ForgotPasswordPage forgotPasswordClick() {
        forgotPasswordLink.click();
        return new ForgotPasswordPage(driver);
    }

}
