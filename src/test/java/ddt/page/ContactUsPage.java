package ddt.page;


import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {
    @FindBy(id = "FullName")
    private WebElement yourFullNameField;
    @FindBy(id = "Email")
    private WebElement emailField;
    @FindBy(id = "Enquiry")
    private WebElement textMessageField;
    @FindBy(className = "button-1 contact-us-button")
    private WebElement submitButton;
    @FindBy(className = "field-validation-error")
    private WebElement errorEmailMessageBlock;
    @FindBy(className = "result")
    private WebElement succesSendMessageBlock;

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public ContactUsPage yourFullNameFieldSend(String name) {
        inputField(yourFullNameField, name);
        return this;
    }
    public ContactUsPage emailFieldSend(String email) {
        inputField(emailField, email);
        return this;
    }
    public ContactUsPage textMessageFieldSend(String text) {
        inputField(textMessageField, text);
        return this;
    }
    public WebElement failSendMessage() {
        submitButton.click();
        return errorEmailMessageBlock;
    }
    public WebElement succesSendMessage() {
        submitButton.click();
        return succesSendMessageBlock;
    }
}
