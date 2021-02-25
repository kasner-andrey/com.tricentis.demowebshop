package ddt.page;


import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersPage extends BasePage {
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div/div/a/img")
    private WebElement desktopImgLink;
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/a/img")
    private WebElement notebookImgLink;
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[3]/div/div/a/img")
    private WebElement accessoriesImgLink;

    public ComputersPage(WebDriver driver) {
        super(driver);
    }

    public DesktopPage desktopImgLinkClick() {
        desktopImgLink.click();
        return new DesktopPage(driver);
    }
    public NotebooksPage notebookImgLinkClick() {
        notebookImgLink.click();
        return new NotebooksPage(driver);
    }
    public AccessoriesPage accessoriesImgLinkClick() {
        accessoriesImgLink.click();
        return new AccessoriesPage(driver);
    }
}
