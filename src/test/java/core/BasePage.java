package core;

import ddt.page.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);
    protected WebDriver driver;
    protected String baseUrl;
    //header
    @FindBy(linkText = "Register")
    protected WebElement registerLink;
    @FindBy(linkText = "Log in")
    protected WebElement signInLink;
    @FindBy(className = "cart-label")
    protected WebElement soppingCartLink;
    @FindBy(className = "ico-wishlist")
    protected WebElement wishListLink;
    @FindBy(className = "button-1 search-box-button")
    protected WebElement searchButton;
    @FindBy(id = "small-searchterms")
    protected WebElement searchField;

    //header logo
    @FindBy(className = "header-logo")
    protected WebElement logoHeader;

    //Header Menu block
    @FindBy(className = "header-menu")
    protected WebElement headerMenuTopBlock;

    //menu
    @FindBys({@FindBy(className = "header-menu"),
              @FindBy(linkText = "Books")})
    protected WebElement booksMenuLink;
    @FindBys({@FindBy(className = "header-menu"),
            @FindBy(linkText = "Computers")})
    protected WebElement computersMenuLink;
    @FindBys({@FindBy(className = "header-menu"),
            @FindBy(linkText = "Desktops")})
    protected WebElement desktopsMenuLink;
    @FindBys({@FindBy(className = "header-menu"),
            @FindBy(linkText = "Notebooks")})
    protected WebElement noteBooksMenuLink;
    @FindBys({@FindBy(className = "header-menu"),
            @FindBy(linkText = "Accessories")})
    protected WebElement accessoriesMenuLink;
    @FindBys({@FindBy(className = "header-menu"),
            @FindBy(linkText = "Electronics")})
    protected WebElement electronicsMenuLink;
    @FindBys({@FindBy(className = "header-menu"),
            @FindBy(linkText = "Camera, photo")})
    protected WebElement cameraPhotoMenuLink;
    @FindBys({@FindBy(className = "header-menu"),
            @FindBy(linkText = "Cell phones")})
    protected WebElement cellPhonesMenuLink;
    @FindBys({@FindBy(className = "header-menu"),
            @FindBy(linkText = "Apparel & Shoes")})
    protected WebElement apparelAndShoesMenuLink;
    @FindBys({@FindBy(className = "header-menu"),
            @FindBy(linkText = "Digital downloads")})
    protected WebElement digitalDownloadsMenuLink;
    @FindBys({@FindBy(className = "header-menu"),
            @FindBy(linkText = "Jewelry")})
    protected WebElement jewelryMenuLink;
    @FindBys({@FindBy(className = "header-menu"),
            @FindBy(linkText = "Gift Cards")})
    protected WebElement giftCardsMenuLink;

    //block block-category-navigation
    @FindBy(className = "block block-category-navigation")
    protected WebElement categoryNavigationBlock;
    //menu block navigation
    @FindBys({@FindBy(className = "block block-category-navigation"),
            @FindBy(linkText = "Books")})
    protected WebElement booksNavigationLink;
    @FindBys({@FindBy(className = "block block-category-navigation"),
            @FindBy(linkText = "Computers")})
    protected WebElement computersNavigationLink;
    @FindBys({@FindBy(className = "block block-category-navigation"),
            @FindBy(linkText = "Desktops")})
    protected WebElement desktopsNavigationLink;
    @FindBys({@FindBy(className = "block block-category-navigation"),
            @FindBy(linkText = "Notebooks")})
    protected WebElement noteBooksNavigationLink;
    @FindBys({@FindBy(className = "block block-category-navigation"),
            @FindBy(linkText = "Accessories")})
    protected WebElement accessoriesNavigationLink;
    @FindBys({@FindBy(className = "block block-category-navigation"),
            @FindBy(linkText = "Electronics")})
    protected WebElement electronicsNavigationLink;
    @FindBys({@FindBy(className = "block block-category-navigation"),
            @FindBy(linkText = "Camera, photo")})
    protected WebElement cameraPhotoNavigationLink;
    @FindBys({@FindBy(className = "block block-category-navigation"),
            @FindBy(linkText = "Cell phones")})
    protected WebElement cellPhonesNavigationLink;
    @FindBys({@FindBy(className = "block block-category-navigation"),
            @FindBy(linkText = "Apparel & Shoes")})
    protected WebElement apparelAndShoesNavigationLink;
    @FindBys({@FindBy(className = "block block-category-navigation"),
            @FindBy(linkText = "Digital downloads")})
    protected WebElement digitalDownloadsNavigationLink;
    @FindBys({@FindBy(className = "block block-category-navigation"),
            @FindBy(linkText = "Jewelry")})
    protected WebElement jewelryNavigationLink;
    @FindBys({@FindBy(className = "block block-category-navigation"),
            @FindBy(linkText = "Gift Cards")})
    protected WebElement giftCardsNavigationLink;


    //block block-manufacturer-navigation
    @FindBy(className = "block block-manufacturer-navigation")
    protected WebElement manufacturerNavigationBlock;
    //elements block block-manufacturer-navigation
    @FindBy(linkText = "Tricentis")
    protected WebElement tricentisLink;


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

    //footer block
    @FindBy(className = "footer")
    protected WebElement footerBlock;
    //information block
    @FindBy(className = "column information")
    protected WebElement informationBlock;
    //elements information block
    @FindBy(linkText = "Sitemap")
    protected WebElement siteMapLink;
    @FindBy(linkText = "Shipping & Returns")
    protected WebElement shippingAndReturnsLink;
    @FindBy(linkText = "Privacy Notice")
    protected WebElement privacyNoticeLink;
    @FindBy(linkText = "Conditions of Use")
    protected WebElement conditionsOfUseLink;
    @FindBy(linkText = "About us")
    protected WebElement aboutUsLink;
    @FindBy(linkText = "Contact us")
    protected WebElement contactUsLink;

    //Customer Service block
    @FindBy(className = "column customer-service")
    protected WebElement customerServiceBlock;
    //elements Customer Service block
    @FindBy(linkText = "Search")
    protected WebElement searchLink;
    @FindBy(linkText = "News")
    protected WebElement newsLink;
    @FindBy(linkText = "Blog")
    protected WebElement blogLink;
    @FindBy(linkText = "Recently viewed products")
    protected WebElement recentlyViewedProductsLink;
    @FindBy(linkText = "Compare products list")
    protected WebElement compareProductsListLink;
    @FindBy(linkText = "New products")
    protected WebElement newProductsLink;

    //My account block
    @FindBy(className = "column my-account")
    protected WebElement myAccountBlock;
    //elements My account block
    @FindBy(linkText = "My account")
    protected WebElement myAccountLink;
    @FindBy(linkText = "Orders")
    protected WebElement ordersLink;
    @FindBy(linkText = "Addresses")
    protected WebElement addressesLink;

    //follow us block
    @FindBy(className = "column follow-us")
    protected WebElement followUsBlock;
    //elements follow us block
    @FindBy(linkText = "Facebook")
    protected WebElement facebookLink;
    @FindBy(linkText = "Twitter")
    protected WebElement twitterLink;
    @FindBy(linkText = "RSS")
    protected WebElement RSSLink;
    @FindBy(linkText = "YouTube")
    protected WebElement youTubeLink;
    @FindBy(linkText = "Google+")
    protected WebElement googlePlusLink;





    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // необходимо, чтобы проинициализировать аннотированные поля
    }
    public void baseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void inputField(WebElement textField, String value) {
        textField.click();
        textField.clear();
        textField.sendKeys(value);
        LOG.info("transition in {}, and send value: {}", textField, value);
    }
    //Methods Header
    public HomePage logoHeaderClick(){
        logoHeader.click();
        return new HomePage(driver, baseUrl);
    }
    public RegisterPage registerLinkClick() {
        registerLink.click();
        return new RegisterPage(driver);
    }
    public LoginPage singInClick() {
        signInLink.click();
        return new LoginPage(driver);
    }

    //menu header
    public BooksPage booksMenuLinkClick() {
        booksMenuLink.click();
        return new BooksPage(driver);
    }
    //Computers and podMenu inMenu
    public ComputersPage computersMenuLinkClick() {
        computersMenuLink.click();
        return new ComputersPage(driver);
    }
    public DesktopPage desktopsMenuLinkClick() {
        desktopsMenuLink.click();
        return new DesktopPage(driver);
    }
    public NotebooksPage noteBooksMenuLinkClick() {
        noteBooksMenuLink.click();
        return new NotebooksPage(driver);
    }
    public AccessoriesPage accessoriesMenuLinkClick() {
        accessoriesMenuLink.click();
        return new AccessoriesPage(driver);
    }
    //electronics and podMenu inMenu
    public ElectronicsPage electronicsMenuLinkClick() {
        electronicsMenuLink.click();
        return new ElectronicsPage(driver);
    }
    public CameraPhotoPage cameraPhotoMenuLinkClick() {
        cameraPhotoMenuLink.click();
        return new CameraPhotoPage(driver);
    }
    public CellPhonesPage cellPhonesMenuLinkClick() {
        cellPhonesMenuLink.click();
        return new CellPhonesPage(driver);
    }
    //apparel-shoes inMenu
    public ApparelShoesPage apparelAndShoesMenuLinkClick(){
        apparelAndShoesMenuLink.click();
        return new ApparelShoesPage(driver);
    }
    //digital-downloads inMenu
    public DigitalDownloadsPage digitalDownloadsMenuLinkClick(){
        digitalDownloadsMenuLink.click();
        return new DigitalDownloadsPage(driver);
    }
    //jewelry inMenu
    public JewelryPage jewelryMenuLinkClick(){
        jewelryMenuLink.click();
        return new JewelryPage(driver);
    }
    //gift-cards inMenu
    public GiftCardsPage giftCardsMenuLinkClick(){
        giftCardsMenuLink.click();
        return new GiftCardsPage(driver);
    }

    //Navigation block
    public BooksPage booksNavigationLinkClick(){
        booksNavigationLink.click();
        return new BooksPage(driver);
    }
    //Computers and podMenu inNavigation
    public ComputersPage computersNavigationLinkClick() {
        computersNavigationLink.click();
        return new ComputersPage(driver);
    }
    public DesktopPage desktopsNavigationLinkClick() {
        desktopsNavigationLink.click();
        return new DesktopPage(driver);
    }
    public NotebooksPage noteBooksNavigationLinkClick() {
        noteBooksNavigationLink.click();
        return new NotebooksPage(driver);
    }
    public AccessoriesPage accessoriesNavigationLinkClick() {
        accessoriesNavigationLink.click();
        return new AccessoriesPage(driver);
    }
    //electronics and podMenu inNavigation
    public ElectronicsPage electronicsNavigationLinkClick() {
        electronicsNavigationLink.click();
        return new ElectronicsPage(driver);
    }
    public CameraPhotoPage cameraPhotoNavigationLinkClick() {
        cameraPhotoNavigationLink.click();
        return new CameraPhotoPage(driver);
    }
    public CellPhonesPage cellPhonesNavigationLinkClick() {
        cellPhonesNavigationLink.click();
        return new CellPhonesPage(driver);
    }
    //apparel-shoes inNavigation
    public ApparelShoesPage apparelAndShoesNavigationLinkClick(){
        apparelAndShoesNavigationLink.click();
        return new ApparelShoesPage(driver);
    }
    //digital-downloads inNavigation
    public DigitalDownloadsPage digitalDownloadsNavigationLinkClick(){
        digitalDownloadsNavigationLink.click();
        return new DigitalDownloadsPage(driver);
    }
    //jewelry inNavigation
    public JewelryPage jewelryNavigationLinkClick(){
        jewelryNavigationLink.click();
        return new JewelryPage(driver);
    }
    //gift-cards inNavigation
    public GiftCardsPage giftCardsNavigationLinkClick(){
        giftCardsNavigationLink.click();
        return new GiftCardsPage(driver);
    }
    //Manufactures
    public TricentisPage tricentisLinkClick() {
        tricentisLink.click();
        return new TricentisPage(driver);
    }
    //newsLetter
    public NewsLetterPage newsLetterEmailFieldSend(String email) {
        inputField(newsLetterEmailField, email);
        return new NewsLetterPage(driver);
    }
    public NewsLetterPage newsLetterButtonClick() {
        newsLetterButton.click();
        return new NewsLetterPage(driver);
    }
    //footer
    //information block
    public SiteMapPage siteMapLinkClickFooter (){
        siteMapLink.click();
        return new SiteMapPage(driver);
    }
    public ShippingReturnsPage shippingAndReturnsLinkClickFooter() {
        shippingAndReturnsLink.click();
        return new ShippingReturnsPage(driver);
    }
    public PrivacyPolicyPage privacyNoticeLinkClickFooter() {
        privacyNoticeLink.click();
        return new PrivacyPolicyPage(driver);
    }
    public ConditionsOfUsePage conditionsOfUseLinkClickFooter() {
        conditionsOfUseLink.click();
        return new ConditionsOfUsePage(driver);
    }
    public AboutUsPage aboutUsLinkClickFooter() {
        aboutUsLink.click();
        return new AboutUsPage(driver);
    }
    public ContactUsPage contactUsLinkClickFooter() {
        contactUsLink.click();
        return new ContactUsPage(driver);
    }
    //CUSTOMER SERVICE block
    public SearchPage searchLinkClickFooter(){
        searchLink.click();
        return new SearchPage(driver);
    }
    public NewsPage newsLinkClickFooter() {
        newsLink.click();
        return new NewsPage(driver);
    }
    public BlogPage blogLinkClickFooter() {
        blogLink.click();
        return new BlogPage(driver);
    }
    public RecentlyViewedProductsPage recentlyViewedProductsLinkClickFooter(){
        recentlyViewedProductsLink.click();
        return new RecentlyViewedProductsPage(driver);
    }
    public CompareProductsPage compareProductsListLinkClickFooter() {
        compareProductsListLink.click();
        return new CompareProductsPage(driver);
    }
    public NewProductsPage newProductsLinkClickFooter(){
        newProductsLink.click();
        return new NewProductsPage(driver);
    }
    public LoginPage notMyAccountLinkClickFooter(){
        myAccountLink.click();
        return new LoginPage(driver);
    }
    public CustomerInfoPage isMyAccountLinkClickFooter() {
        myAccountLink.click();
        return new CustomerInfoPage(driver);
    }
    public AddressesPage tt(){
        addressesLink.click();
        return new AddressesPage(driver);
    }







}
