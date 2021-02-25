package ddt.page;


import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SiteMapPage extends BasePage {
    @FindBy(linkText = "Search")
    private WebElement searchLink;
    @FindBy(linkText = "News")
    private WebElement newsLink;
    @FindBy(linkText = "Blog")
    private WebElement blogLink;
    @FindBy(linkText = "My account")
    private WebElement myAccountsLink;
    //categories
    @FindBy(linkText = "Books")
    private WebElement booksLink;
    @FindBy(linkText = "Computers")
    private WebElement computersLink;
    @FindBy(linkText = "Desktops")
    private WebElement desktopsLink;
    @FindBy(linkText = "Notebooks")
    private WebElement notebooksLink;
    @FindBy(linkText = "Accessories")
    private WebElement accessoriesLink;
    @FindBy(linkText = "Electronics")
    private WebElement electronicsLink;
    @FindBy(linkText = "Camera, photo")
    private WebElement cameraPhotoLink;
    @FindBy(linkText = "Cell phones")
    private WebElement cellPhonesLink;
    @FindBy(linkText = "Apparel & Shoes")
    private WebElement apparelShoesLink;
    @FindBy(linkText = "Digital downloads")
    private WebElement digitalDownloadsLink;
    @FindBy(linkText = "Jewelry")
    private WebElement jewelryLink;
    @FindBy(linkText = "Gift Cards")
    private WebElement giftCardsLink;
    //manufactures
    @FindBy(linkText = "Tricentis")
    private WebElement tricentisLink;

    public SiteMapPage(WebDriver driver) {
        super(driver);
    }
}
