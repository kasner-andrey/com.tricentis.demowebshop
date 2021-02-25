package ddt.page;


import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeRegisterPage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(HomeRegisterPage.class);

    @FindBy(className = "account")
    private WebElement emailAccount;
    @FindBy(className = "ico-logout")
    private WebElement logOutLink;

    public HomeRegisterPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmailAccount() {
        LOG.debug("HomeRegisterPage. getEmailAccount-WebElement");
        return emailAccount;
    }

    public CustomerInfoPage emailAccountClick() {
        emailAccount.click();
        LOG.debug("HomeRegisterPage. emailAccountClick");
        return new CustomerInfoPage(driver);
    }
    public HomePage logOutClick() {
        logOutLink.click();
        LOG.debug("HomeRegisterPage. logOutClick");
        return new HomePage (driver, baseUrl);
    }
}
