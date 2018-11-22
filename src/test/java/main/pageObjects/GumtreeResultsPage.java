package main.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.NumberFormat;
import java.util.Locale;

public class GumtreeResultsPage {
    private WebDriver driver;
    @FindBy(className = "h1-responsive")
    private WebElement searchResultsCount;

    public GumtreeResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public int getSearchResultsCount() throws Exception {
        String[] words = searchResultsCount.getText().split(" ");
        NumberFormat format = NumberFormat.getInstance(Locale.UK);
        Number searchCount = format.parse(words[0]);
        return searchCount.intValue();
    }

}
