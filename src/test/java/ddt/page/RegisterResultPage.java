package ddt.page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegisterResultPage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(RegisterResultPage.class);

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")
    private WebElement continueButton;

    public RegisterResultPage(WebDriver driver) {
        super(driver);
    }

    public HomeRegisterPage registerAccount() {
        continueButton.click();
        LOG.debug("RegisterResultPage. registerAccount-method. continueButton.click()");
        return new HomeRegisterPage(driver);
    }

}
