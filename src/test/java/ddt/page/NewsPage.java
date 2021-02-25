package ddt.page;


import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsPage extends BasePage {
    @FindBy(className = "page-title")
    private WebElement newsTitle;

    public NewsPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getNewsTitle(){
        return newsTitle;
    }

}
