package ddt.page;


import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConditionsOfUsePage extends BasePage {
    @FindBy(className = "page-title")
    private WebElement titleConditionsOfUsePage;

    public ConditionsOfUsePage(WebDriver driver) {
        super(driver);
    }
    public WebElement getTitleConditionsOfUsePage() {
        return titleConditionsOfUsePage;
    }
}
