package ddt.page;


import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends BasePage {
    @FindBy(id = "Email")
    private WebElement emailField;
    @FindBy(className = "button-1 password-recovery-button")
    private WebElement recoverButton;
    @FindBy(className = "result")
    private WebElement infoMessageText;

    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }
    public ForgotPasswordPage inputEmail(String email) {
        inputField(emailField, email);
        return this;
    }
    public ForgotPasswordPage recoverButtonClick() {
        recoverButton.click();
        return this;
    }
    public WebElement infoMessageField() {
        return infoMessageText;
    }

}
