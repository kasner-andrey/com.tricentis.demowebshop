package ddt.page;


import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrivacyPolicyPage extends BasePage {
    @FindBy(className = "page-title")
    private WebElement titlePrivacyPolicyPage;

    public PrivacyPolicyPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getTitlePrivacyPolicyPage() {
        return titlePrivacyPolicyPage;
    }
}
