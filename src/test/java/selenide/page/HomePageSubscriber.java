package selenide.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class HomePageSubscriber {
    @FindBy(xpath = "/html/body/div/div[2]/div/a")
    private SelenideElement subscriberLink;

    public SubscriberPage goToSubscriber() {
        subscriberLink.click();
        return page(SubscriberPage.class);
    }
}
