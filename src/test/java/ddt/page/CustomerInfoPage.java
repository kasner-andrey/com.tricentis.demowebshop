package ddt.page;


import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CustomerInfoPage extends BasePage {

    @FindBy(id = "gender-male")
    private WebElement maleRadioButton;
    @FindBy(id = "gender-female")
    private WebElement femaleRadioButton;
    @FindBy(id = "FirstName")
    private WebElement firstNameField;
    @FindBy(id = "LastName")
    private WebElement lastNameField;
    @FindBy(id = "Email")
    private WebElement emailField;
    @FindBy(className = "button-1 save-customer-info-button")
    private WebElement saveButton;

    public CustomerInfoPage(WebDriver driver) {
        super(driver);
    }

    public CustomerInfoPage inputFirstName(String firstName) {
        inputField(firstNameField, firstName);
        return this;
    }
    public CustomerInfoPage inputLastName(String lastName) {
        inputField(lastNameField, lastName);
        return this;
    }
    public CustomerInfoPage inputEmail(String email) {
        inputField(emailField, email);
        return this;
    }
    public CustomerInfoPage saveButtonClick() {
        saveButton.click();
        return this;
    }
}
