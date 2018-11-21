package main.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
    private WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[name='q'][title='Search']")
    private WebElement searchBox;

    @FindBy(css = "input[name='btnK'][value='Google Search']")
    private WebElement searchBtn;

    public void searchFor(String searchText) {
        searchBox.sendKeys(searchText);
        searchBox.submit();
    }
}

