package ddt.page;


import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

public class AddressesPage extends BasePage {
    private boolean isSavedAddress = false;
    @FindBy(className = "button-1 add-address-button")
    private WebElement createNewAddressButton;
    //new form create address
    @FindBy(id = "Address_FirstName")
    private WebElement firstNameField;
    @FindBys({@FindBy(id = "Address_FirstName"),
             @FindBy(className = "field-validation-error")})
    private WebElement firstNameErrorMess;
    @FindBy(id = "Address_LastName")
    private WebElement lastNameField;
    @FindBys({@FindBy(id = "Address_LastName"),
            @FindBy(className = "field-validation-error")})
    private WebElement lastNameErrorMess;
    @FindBy(id = "Address_Email")
    private WebElement emailField;
    @FindBys({@FindBy(id = "Address_Email"),
            @FindBy(className = "field-validation-error")})
    private WebElement emailErrorMess;
    @FindBy(id = "Address_Company")
    private WebElement companyField;
    @FindBy(id = "Address_CountryId")
    private WebElement countryIdFieldDropDown;
    @FindBy(id = "Address_StateProvinceId")
    private WebElement provinceIDFieldDropDown;
    @FindBy(id = "Address_City")
    private WebElement cityField;
    @FindBys({@FindBy(id = "Address_City"),
            @FindBy(className = "field-validation-error")})
    private WebElement cityErrorMess;
    @FindBy(id = "Address_Address1")
    private WebElement address1Field;
    @FindBys({@FindBy(id = "Address_Address1"),
            @FindBy(className = "field-validation-error")})
    private WebElement address1ErrorMess;
    @FindBy(id = "Address_Address2")
    private WebElement address2Field;
    @FindBy(id = "Address_ZipPostalCode")
    private WebElement zipPostalCodeField;
    @FindBys({@FindBy(id = "Address_ZipPostalCode"),
            @FindBy(className = "field-validation-error")})
    private WebElement zipPostalCodeErrorMess;
    @FindBy(id = "Address_PhoneNumber")
    private WebElement phoneNumberField;
    @FindBys({@FindBy(id = "Address_PhoneNumber"),
            @FindBy(className = "field-validation-error")})
    private WebElement phoneNumberErrorMess;
    @FindBy(id = "Address_FaxNumber")
    private WebElement faxNumberField;
    //button Save
    @FindBy(className = "button-1 save-address-button")
    private WebElement saveButton;
    @FindBy(className = "button-2 edit-address-button")
    private WebElement editButton;
    @FindBy(className = "button-2 delete-address-button")
    private WebElement deleteButton;

    public AddressesPage saveButtonClick() {
        saveButton.click();
        isSavedAddress = true;
        return this;
    }
    public AddressesPage editButtonclick(){
        if(isSavedAddress) editButton.click();
        return this;
    }
    public AddressesPage deleteButtonClick() {
        if(isSavedAddress) deleteButton.click();
        return this;
    }

    public AddressesPage(WebDriver driver) {
        super(driver);
    }
    public AddressesPage createNewAddressButtonClick(){
        createNewAddressButton.click();
        return this;
    }
    public WebElement getFirstNameErrorMess() {
        return firstNameErrorMess;
    }

    public WebElement getLastNameErrorMess() {
        return lastNameErrorMess;
    }

    public WebElement getEmailErrorMess() {
        return emailErrorMess;
    }

    public WebElement getCityErrorMess() {
        return cityErrorMess;
    }

    public WebElement getAddress1ErrorMess() {
        return address1ErrorMess;
    }

    public WebElement getZipPostalCodeErrorMess() {
        return zipPostalCodeErrorMess;
    }

    public WebElement getPhoneNumberErrorMess() {
        return phoneNumberErrorMess;
    }
    //send field
    public AddressesPage firstNameFieldSend(String firstName) {
        inputField(firstNameField, firstName);
        return this;
    }
    public AddressesPage lastNameFieldSend(String lastName) {
        inputField(lastNameField, lastName);
        return this;
    }
    public AddressesPage emailFieldSend(String email) {
        inputField(emailField, email);
        return this;
    }
    public AddressesPage companyFieldSend(String company) {
        inputField(companyField, company);
        return this;
    }
    public AddressesPage countryIdFieldDropDownSelect(String country) {
        Select countySelect = new Select(countryIdFieldDropDown);
        countySelect.deselectByVisibleText(country);
        return this;
    }
    public AddressesPage provinceIDFieldDropDownSelect(String province) {
        Select provinceSelect = new Select(provinceIDFieldDropDown);
        provinceSelect.deselectByVisibleText(province);
        return this;
    }
    public AddressesPage cityFieldSend(String city) {
        inputField(cityField, city);
        return this;
    }
    public AddressesPage address1FieldSend(String address) {
        inputField(address1Field, address);
        return this;
    }
    public AddressesPage address2FieldSend(String address) {
        inputField(address2Field, address);
        return this;
    }
    public AddressesPage zipPostalCodeFieldSend(String zip) {
        inputField(zipPostalCodeField, zip);
        return this;
    }
    public AddressesPage phoneNumberFieldSend(String phoneNumber) {
        inputField(phoneNumberField, phoneNumber);
        return this;
    }
    public AddressesPage faxNumberField(String faxNumber) {
        inputField(faxNumberField, faxNumber);
        return this;
    }


}
