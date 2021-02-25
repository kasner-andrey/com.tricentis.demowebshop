package ddt.page;


import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsLetterPage extends BasePage {
    //block block-newsletter
    @FindBy(className = "block block-newsletter")
    protected WebElement newsLetterBlock;
    //elements block block-newsletter
    @FindBy(id = "newsletter-email")
    protected WebElement newsLetterEmailField;
    @FindBy(id = "newsletter-subscribe-button")
    protected WebElement newsLetterButton;
    @FindBy(id = "newsletter-result-block")
    protected WebElement newsletterErrorMessageText;

    public NewsLetterPage(WebDriver driver) {
        super(driver);
    }

    public NewsLetterPage newsLetterEmailFieldSend(String email) {
        inputField(newsLetterEmailField, email);
        return this;
    }
    public NewsLetterPage newsLetterButtonClick() {
        newsLetterButton.click();
        return this;
    }
    public WebElement getNewsletterErrorMassageText() {
        return newsletterErrorMessageText;
    }
}
