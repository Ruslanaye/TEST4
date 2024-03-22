package utils;

import org.openqa.selenium.By;

public interface Locators {

    public interface MainPage {
        By BUTTON = By.xpath("(//span[@class='title'][normalize-space()='Radio'])[1]");
    }

    public interface SearchResultPage {
        By HEADER_TEXT = By.xpath("(//span[@class='dialog-title'][normalize-space()='Radio'])[1]");
    }

}