package ddt.page;


import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(HomePage.class);
    private final String baseUrl;

    public HomePage(WebDriver driver, String baseUrl) {
        super(driver);
        super.baseUrl = baseUrl;
        this.baseUrl = baseUrl;
    }

    public HomePage goToHome() {
        LOG.debug("HomePage. goToHome {}", baseUrl);
        driver.get(baseUrl);
        return this;
    }

    public LoginPage loginClick() {
        signInLink.click();
        LOG.debug("HomePage. loginClick ");
        return new LoginPage(driver);
    }



}
