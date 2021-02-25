package ddt.page;


import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends BasePage {
    private boolean advanceSearchIsDisplayed = false;

    @FindBy(className = "search-text")
    private WebElement searchField;
    @FindBy(className = "button-1 search-button")
    private WebElement searchButton;
    //advance Search button
    @FindBy(id = "As")
    private WebElement advanceSearchOnButton;
    //Advance search elements
    @FindBy(id = "Cid")
    private WebElement categoriesFieldDropDown;
    @FindBy(id = "Isc")
    private WebElement automaticallySearchCategoriesOnButton;
    @FindBy(id = "Mid")
    private WebElement manufacturesFieldDropDown;
    @FindBy(id = "Pf")
    private WebElement priceFromField;
    @FindBy(id = "Pt")
    private WebElement priceToField;
    @FindBy(id = "Sid")
    private WebElement productDescriptionSearchOnButton;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public SearchPage searchFieldSend(String text) {
        inputField(searchField, text);
        return this;
    }
    public SearchPage searchButtonClick() {
        searchButton.click();
        return this;
    }
    public SearchPage advanceSearchOnButtonClick() {
        advanceSearchOnButton.click();
        advanceSearchIsDisplayed = true;
        return this;
    }
    public SearchPage categoriesFieldDropDownSelect(String categories){
        if(advanceSearchIsDisplayed){
            Select categoriesDropDown = new Select(categoriesFieldDropDown);
            categoriesDropDown.deselectByVisibleText(categories);
        }
        return this;
    }
    public SearchPage manufacturesFieldDropDownSelect(String manufactures) {
        if(advanceSearchIsDisplayed){
            Select manufacturesDropDown = new Select(manufacturesFieldDropDown);
            manufacturesDropDown.deselectByVisibleText(manufactures);
        }
        return this;
    }
    public SearchPage automaticallySearchCategoriesOnButtonClick() {
        if(advanceSearchIsDisplayed) automaticallySearchCategoriesOnButton.click();
        return this;
    }
    public SearchPage priceFromFieldSend(String priceFrom) {
        if(advanceSearchIsDisplayed) inputField(priceFromField, priceFrom);
        return this;
    }
    public SearchPage priceToFieldSend(String priceTo) {
        if(advanceSearchIsDisplayed) inputField(priceToField, priceTo);
        return this;
    }
    public SearchPage productDescriptionSearchOnButtonClick() {
        if(advanceSearchIsDisplayed) productDescriptionSearchOnButton.click();
        return this;
    }
}
