package ddt.page;


import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingReturnsPage extends BasePage {
    @FindBy(className = "page-title")
    private WebElement titleShippingReturnsPage;

    public ShippingReturnsPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getTitleShippingReturnsPage() {
        return titleShippingReturnsPage;
    }
}
