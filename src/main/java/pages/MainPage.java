package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;

public class MainPage {
    private WebDriver browser;

    public MainPage(WebDriver browser) {
        this.browser = browser;
    }

    public MainPage clickInButtonField() {
        browser.findElement(Locators.MainPage.BUTTON).click();
        return this;
    }
    public String getHeaderText() {
        return browser.findElement(Locators.SearchResultPage.HEADER_TEXT).getText();

    }

}