package ddt.page;


import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompareProductsPage extends BasePage {
    @FindBy(className = "page-title")
    private WebElement titleCompareProductsPage;

    public WebElement getTitleCompareProductsPage() {
        return titleCompareProductsPage;
    }

    public CompareProductsPage(WebDriver driver) {
        super(driver);
    }
}
