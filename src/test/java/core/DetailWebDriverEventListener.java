package core;

import org.openqa.selenium.*;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.PropertyProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DetailWebDriverEventListener extends AbstractWebDriverEventListener {
    private static Logger LOG = LoggerFactory.getLogger(DetailWebDriverEventListener.class);
    protected static final Logger LOG_BROWSER = LoggerFactory.getLogger("BROWSER");
    protected static final Logger LOG_PERFORMANCE = LoggerFactory.getLogger("PERFORMANCE");
    private  boolean logPerformance;
    private  boolean logBrowser;

    public DetailWebDriverEventListener(boolean logPerformance, boolean logBrowser) {
        this.logPerformance = logPerformance;
        this.logBrowser = logBrowser;
    }

    @Override
    public void afterNavigateTo(String url, WebDriver driver) {
        if(logBrowser){
            LOG_BROWSER.debug("Navigated to {}", url);
            driver.manage().logs().get(LogType.BROWSER).forEach(e->LOG_BROWSER.debug(e.getMessage()));
        }
        if(logPerformance){
            LOG_PERFORMANCE.debug("Navigated to {}", url);
            driver.manage().logs().get(LogType.PERFORMANCE).forEach(e->LOG_PERFORMANCE.debug(e.getMessage()));
        }
    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        LOG.debug("try find element  by '{}'", by);
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        String tagName = "";

        if (element != null)
            tagName = element.getTagName();

        LOG.debug("Found element <{}>  by '{}'", tagName, by);
    }

    //все ошибки будут переданы в этот метод от драйвера
    @Override
    public void onException(Throwable throwable, WebDriver driver) {
        LOG.error("Error. Details: {}", throwable.getMessage());
        makeScreenshot(driver);
    }

    private void makeScreenshot(WebDriver driver) {
        String screenshotDir = PropertyProvider.get("screenshot.dir");
        File tmp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenName = "screen_" + System.currentTimeMillis()+".png";
        String screenPath =  screenshotDir + "/" + screenName;
        try {
            Files.copy(new FileInputStream(tmp), Path.of(screenPath));
        } catch (IOException exc) {
            LOG.error("Error copying screenshot from '{}' to '{}'. Details: {}",
                    tmp, screenPath, exc);
        }
    }
}
