package main.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class GoogleSearchResultsPage {
    private WebDriver driver;

    public GoogleSearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//cite")
    private List<WebElement> resultLinks;

    @FindBy(id="resultStats")
    private WebElement resultsStat;

    public List<String> getLinkResultsText() {
        List<String> resultList = new ArrayList();
        for (WebElement element : resultLinks) {
            resultList.add(element.getText());
        }
        return resultList;
    }

    public void clickLinkResult() {
        List<String> resultList = new ArrayList();
        for (WebElement element : resultLinks) {
            if(element.getText().startsWith("https://www.gumtree.com")) {
                element.click();
            }
        }
    }

    public boolean isStatsPresent() {
        return resultsStat.isDisplayed();
    }

}
