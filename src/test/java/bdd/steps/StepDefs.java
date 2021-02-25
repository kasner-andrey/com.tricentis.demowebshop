package bdd.steps;

import ddt.page.HomePage;
import ddt.page.HomeRegisterPage;
import ddt.page.LoginPage;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import util.PropertyProvider;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class StepDefs {
    private String baseUrl = "http://demowebshop.tricentis.com/";
    private WebDriver driver;

    @Before
    public void setUp(Scenario scenario) throws IOException {
        // Инициализируем драйвер

        System.setProperty("webdriver.chrome.driver", PropertyProvider.get("driver.chrome"));
        driver = new ChromeDriver();

        // Неявное ожидание (Implicit Waits)
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Given("^I am on home page$")
    public void goToHomePage() {
        new HomePage(driver, baseUrl)
                .goToHome();
    }

    @Then("^I click on signIn link$")
    public void clickSignInLink() {
        new HomePage(driver, baseUrl)
                .loginClick();
    }

    @When("^I fill login '(.*?)'$")
    public void fillLogin(String login) {
        new LoginPage(driver)
                .inputEmail(login);
    }

    @And("^I fill password '(.*?)'$")
    public void fillPassword(String password) {
        new LoginPage(driver)
                .inputPassword(password);
    }

    @And("^click signIn button$")
    public void i_click_on_the_button() throws Throwable {
        new LoginPage(driver)
                .failLogInButtonClick();
    }

//    @Then("^I should see '(.*?)' link$")
//    public void i_should_see_the_button(String userName) throws Throwable {
//        Assert.assertEquals(
//                new (manager.getDriver()).getUserNameCapture(),
//                userName);
//    }

//    @Then("^I should make logout$")
//    public void i_should_see_the_button() throws Throwable {
//        new AccountPage(manager.getDriver())
//                .clickLogout();
//    }

    @Given("^Я нахожусь на домашней странице$")
    public void goToHomePage2() {
        new HomePage(driver, baseUrl)
                .goToHome();
    }

    @Then("^Я нажимаю ссылку signIn$")
    public void clickSignInLink2() {
        new HomePage(driver, baseUrl)
                .loginClick();
    }

    @When("Ввожу логин {string}")
    public void fillLogin2(String login) {
        new LoginPage(driver)
                .inputEmail(login);
    }

    @And("^Ввожу пароль '(.*?)'$")
    public void fillPassword2(String password) {
        new LoginPage(driver)
                .inputPassword(password);
    }

    @And("^нажимаю отправить$")
    public void i_click_on_the_button2() throws Throwable {
        new LoginPage(driver)
                .failLogInButtonClick();
    }

    @Then("^должен увидеть сообщение об ошибке '(.*?)'$")
    public void i_should_see_the_button2(String msg) throws Throwable {
        Assert.assertEquals(
                new LoginPage(driver).errorMessInputEmail(),
                msg);
    }

    @Then("^Я ожидаю увидеть '(.*?)' link$")
    public void IShouldSeeUserName(String userNameExpected) {
        String userNameActual = new HomeRegisterPage(driver).getEmailAccount().getText();
        Assert.assertEquals(userNameActual, userNameExpected);
    }

    @Then("^Нажимаю logout$")
    public void clickLogout() {
        new HomeRegisterPage(driver)
                .logOutClick();
    }


//    @Then("^I go on women page$")
//    public void goOnWomenPage(){
//        new HomePage(manager.getDriver()).clickWomenPageLink();
//    }
//    @Then("^I click on dresses link$")
//    public void clickDressLink (){
//        new WomenPage(manager.getDriver()).clickToDressesLink();
//    }
//    @Then("^I click on to list link$")
//    public void clickToListLink(){
//        new WomenPage(manager.getDriver()).clickToList();
//    }
//    @And("^I sort product by '(.*?)'$")
//    public void sortProductBy(String sortBy){
//        new WomenPage(manager.getDriver()).sortProductBy(sortBy);
//    }
//    @And("^I check actual product list and expected product list$")
//    public void checkSortBy (){
//        manager.women().verifySort();
//    }

    @After
    public void tearDown(Scenario scenario){
        driver.close();
    }
}
