package ddt.page;



import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegisterPage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);

    //register form block
    @FindBy(className = "page registration-page")
    private WebElement registrationBlock;
    //registration block elements
    @FindBy(xpath = "//*[@id=\"gender-male\"]")
    private WebElement maleRadioButton;
    @FindBy(xpath = "//*[@id=\"gender-female\"]")
    private WebElement femaleRadioButton;
    @FindBy(xpath = "//*[@id=\"FirstName\"]")
    private WebElement firstNameField;
    @FindBy(xpath = "//*[@id=\"LastName\"]")
    private WebElement lastNameField;
    @FindBy(xpath = "//*[@id=\"Email\"]")
    private WebElement emailField;
    //password
    @FindBy(xpath = "//*[@id=\"Password\"]")
    private WebElement passwordField;
    @FindBy(xpath = "//*[@id=\"ConfirmPassword\"]")
    private WebElement confirmPasswordField;
    //button
    @FindBy(xpath = "//*[@id=\"register-button\"]")
    private WebElement registerButton;

    //constructor
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    //methods
    public RegisterPage maleOrFemaleRadioButtonClick(String maleOrFemale) {
        LOG.debug("RegisterPage. maleOrFemaleRadioButtonClick {}", maleOrFemale);
        if(maleOrFemale.equals("m")){
            maleRadioButton.click();
        }
        else {
            femaleRadioButton.click();
        }
        return this;
    }
    public RegisterPage inputFirstName(String firstName) {
        inputField(firstNameField, firstName);
        LOG.info("RegisterPage. inputFirstName {}", firstName);
        return this;
    }
    public RegisterPage inputLastName(String lastName) {
        inputField(lastNameField, lastName);
        LOG.info("RegisterPage. inputLastName {}", lastName);
        return this;
    }
    public RegisterPage inputEmail(String email) {
        inputField(emailField, email);
        LOG.info("RegisterPage. inputEmail {}", email);
        return this;
    }
    public RegisterPage inputPassword(String password) {
        inputField(passwordField, password);
        LOG.info("RegisterPage. inputPassword {}", password);
        return this;
    }
    public RegisterPage inputConfirmPassword(String confirmPassword) {
        inputField(confirmPasswordField, confirmPassword);
        LOG.info("RegisterPage. inputConfirmPassword {}", confirmPassword);
        return this;
    }
    public RegisterResultPage clickRegisteredButton() {
        registerButton.click();
        LOG.info("RegisterPage. clickRegisteredButton ");
        return new RegisterResultPage(driver);
    }


}
