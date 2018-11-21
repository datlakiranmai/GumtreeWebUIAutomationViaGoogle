package main.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GumtreeResultsPage {
    private WebDriver driver;

    @FindBy(className = "h1-responsive")
    private WebElement searchResultsCount;

    public GumtreeResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getSearchResultsCount() {
        String[] words = searchResultsCount.getText().split(" ");
        return words[0];
    }

}
