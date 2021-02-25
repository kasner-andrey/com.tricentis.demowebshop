package ddt.page;


import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends BasePage {
    @FindBy(className = "page-title")
    private WebElement titleBlogPage;

    public WebElement getTitleBlogPage() {
        return titleBlogPage;
    }

    public BlogPage(WebDriver driver) {
        super(driver);
    }


}
