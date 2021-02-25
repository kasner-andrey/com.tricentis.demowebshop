package selenide.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class AddPage {
    @FindBy(xpath = "/html/body/div/div[2]/a")
    private SelenideElement homeLink;

    @FindBy(id = "fname")
    private SelenideElement firstNameField;

    @FindBy(id = "lname")
    private SelenideElement lastNameField;

    @FindBy(id = "FEMALE")
    private SelenideElement femaleRadioButton;

    @FindBy(id = "MALE")
    private SelenideElement maleRadioButton;

    @FindBy(id = "age")
    private SelenideElement ageField;

    @FindBy(xpath = "/html/body/div/form/button")
    private SelenideElement createButton;

    public AddPage firsNameSend(String firstName) {
        firstNameField.setValue(firstName);
        return this;
    }

    public AddPage lastNameSend( String lastName) {
        lastNameField.setValue(lastName);
        return this;
    }

    public AddPage maleOrFemaleSend(String maleOrFemale) {
        if(maleOrFemale.equals("m")) maleRadioButton.click();
        else femaleRadioButton.click();
        return this;
    }

    public AddPage ageSend(int age){
        ageField.setValue(Integer.toString(age));
        return this;
    }

    public SubscriberPage createClick(){
        createButton.click();
        return page(SubscriberPage.class);
    }














    public HomePageSubscriber goToHome() {
        homeLink.click();
        return page(HomePageSubscriber.class);
    }


}
