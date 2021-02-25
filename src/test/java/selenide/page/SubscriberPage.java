package selenide.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.codeborne.selenide.Selenide.page;

public class SubscriberPage {
    @FindBy(id = "contact-edit-id")
    private List<SelenideElement> idS;

    @FindBy(id = "add")
    private SelenideElement addButton;

    @FindBy(id = "del")
    private SelenideElement delButton;

    @FindBy(xpath = "/html/body/div/div[2]/a")
    private SelenideElement homeLink;

    public HomePageSubscriber goToHome() {
        homeLink.click();
        return page(HomePageSubscriber.class);
    }

    public AddPage goToAdd(){
        addButton.click();
        return page(AddPage.class);
    }

    public DelPage goToDel(){
        delButton.click();
        return page(DelPage.class);
    }

    public List<SelenideElement> allSubscribers() {
        return idS;
    }


}
