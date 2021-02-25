package selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenide.page.HomePageSubscriber;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {
    private String baseUrl = "";
    @BeforeClass
    public void beforeClass() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10;
        Configuration.startMaximized = true;
    }

    @Test(dataProvider = "subscriberADD")
    public void subscriberTest(String firstName, String lastName, String gender, int age) throws InterruptedException {

        HomePageSubscriber homePage = open(baseUrl, HomePageSubscriber.class);
        List<SelenideElement> before = homePage.goToSubscriber().allSubscribers();
        homePage.goToSubscriber()
                .goToAdd()
                .firsNameSend(firstName)
                .lastNameSend(lastName)
                .maleOrFemaleSend(gender)
                .ageSend(age)
                .createClick();
        List<SelenideElement> after = homePage.goToSubscriber().allSubscribers();

    }



    @AfterClass
    public void close() {
        closeWindow();
    }

    @DataProvider(name = "subscriberADD")
    private Object[][] subscriberADD() {
        Object[][] subscriber = {
                {"Andrey", "Kasner", "m", 35},
                {"Andrey", "Kasner", "m", 35},
                {"Andrey", "Kasner", "m", 35},
                {"Andrey", "Kasner", "m", 35},
                {"Andrey", "Kasner", "m", 35},
                {"Andrey", "Kasner", "m", 35},
                {"Andrey", "Kasner", "m", 35},
                {"Andrey", "Kasner", "m", 35},
                {"Andrey", "Kasner", "m", 35},
                {"Andrey", "Kasner", "m", 35},
                {"Andrey", "Kasner", "m", 35},
                {"Andrey", "Kasner", "m", 35},
                {"Andrey", "Kasner", "m", 35}
        };
        return subscriber;
    }


}
