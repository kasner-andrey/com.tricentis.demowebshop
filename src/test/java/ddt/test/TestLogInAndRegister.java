package ddt.test;



import core.AssertWrapper;
import ddt.page.HomePage;
import ddt.page.HomeRegisterPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import util.PropertyProvider;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TestLogInAndRegister extends BaseTest{
    private static Logger LOG = LoggerFactory.getLogger(TestLogInAndRegister.class);

    private String baseUrl = PropertyProvider.get("url.home.page");

    @Ignore
    @Test(dataProvider = "register")
    public void testRegister(String maleOrFemale,String firstName, String lastName, String email, String password, String confirmPassword) {
        HomeRegisterPage homeRegisterPage = new HomePage(driver, baseUrl)
                .goToHome()
                .loginClick()
                .registerLinkClick()
                .maleOrFemaleRadioButtonClick(maleOrFemale)
                .inputFirstName(firstName)
                .inputLastName(lastName)
                .inputEmail(email)
                .inputPassword(password)
                .inputConfirmPassword(confirmPassword)
                .clickRegisteredButton()
                .registerAccount();

        String registerEmail = homeRegisterPage.getEmailAccount().getText();
        homeRegisterPage.logOutClick();
        AssertWrapper.assertEquals(registerEmail, email);
    }

    @DataProvider(name = "registerSuccess")
    private Object[][] registerSuccess() {
        List<Object[]> cases = new ArrayList<>();
        try(InputStream is = new FileInputStream(PropertyProvider.get("registerDataSuccess"))){
            Scanner read = new Scanner(is);
            while (read.hasNext()) {
                cases.add(read.nextLine().split(";"));
            }
        }catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
        return cases.toArray(Object[][]::new);
    }
    @Test(dataProvider = "loginSuccess",  description = "severity level")
    public void testLogIn(String email, String password) {
        HomeRegisterPage homeRegisterPage = new HomePage(driver, baseUrl)
                .goToHome()
                .loginClick()
                .inputEmail(email)
                .inputPassword(password)
                .succesLogInButtonClick();

        String registerEmail = homeRegisterPage.getEmailAccount().getText();
        AssertWrapper.assertEquals(registerEmail, email);
    }

    @DataProvider(name = "loginSuccess")
    private Object[][] loginSuccess() {
        List<Object[]> cases = new ArrayList<>();
        try(InputStream is = new FileInputStream(PropertyProvider.get("loginDataSuccess"))){
            Scanner read = new Scanner(is);
            while (read.hasNext()) {
                cases.add(read.nextLine().split(";"));
            }
        }catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
        return cases.toArray(Object[][]::new);
    }
    @Ignore
    @Test(dataProvider = "registrationFail")
    public void registerFail(String maleOrFemale,String firstName, String lastName, String email, String password, String confirmPassword) {

    }

}
