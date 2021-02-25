package ddt.page;


import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewProductsPage extends BasePage {
    @FindBy(className = "page-title")
    private WebElement titleNewProductsPage;

    public WebElement getTitleNewProductsPage() {
        return titleNewProductsPage;
    }
    public NewProductsPage(WebDriver driver) {
        super(driver);
    }
}
