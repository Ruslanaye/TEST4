import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.MainPage;

public class SmokeTest {

    private WebDriver browser;

    @Before
    public void precondition() {

        browser = new EdgeDriver();
        browser.manage().window().maximize();
        browser.get("https://gleb.solutions/");
    }

    @Test
    public void checkSiteSearcher() {
        MainPage mainPage = new MainPage(browser);

        String headerText = mainPage
                .clickInButtonField()
                .getHeaderText();
        String assertionError = null;
        try {
            Assert.assertEquals(headerText,"Radio");
        }
        catch (AssertionError ae) {
            assertionError = ae.toString();
        }

        if (assertionError != null) {
            System.out.println(assertionError);
        }
        else {
            System.out.println("Тестирование прошло успешно");
        }
    }




    @After
    public void postCondition() {
        browser.quit();

    }

}