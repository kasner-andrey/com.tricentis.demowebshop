package ddt.page;



import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsPage extends BasePage {
    @FindBy(className = "page-title")
    private WebElement titleAboutUsPage;

    public AboutUsPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getTitleAboutUsPage() {
        return titleAboutUsPage;
    }
}
