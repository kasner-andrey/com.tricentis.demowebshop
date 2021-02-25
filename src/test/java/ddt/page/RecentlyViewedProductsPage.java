package ddt.page;


import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecentlyViewedProductsPage extends BasePage {
    @FindBy(className = "page-title")
    private WebElement titleRecentlyViewedProductsPage;

    public RecentlyViewedProductsPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getTitleRecentlyViewedProductsPage() {
        return titleRecentlyViewedProductsPage;
    }
}
