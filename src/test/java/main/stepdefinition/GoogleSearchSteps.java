package main.stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main.CucumberRunner;
import main.pageObjects.GooglePage;
import main.pageObjects.GumtreeResultsPage;
import main.pageObjects.GoogleSearchResultsPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class GoogleSearchSteps extends CucumberRunner {


    @Given("^user is on Google home page$")
    public void user_is_on_Google_home_page() {
        driver.get("https://www.google.co.uk/");
    }

    @When("^user searches for (.*)$")
    public void user_searches_for_Cars_in_London(String searchText) {
        GooglePage googlePage = new GooglePage(driver);
        googlePage.searchFor(searchText);
    }

    @Then("^user should be presented with search results$")
    public void user_should_be_presented_with_search_results() throws Exception{
        GoogleSearchResultsPage resultsPage = new GoogleSearchResultsPage(driver);
        new ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
                    }
                };
        Assert.assertTrue(resultsPage.isStatsPresent());
    }

    @And("^user should see Gumtree links within the search results displayed$")
    public void user_should_see_Gumtree_links_within_the_search_results_displayed() {
        int linkCount = 0;
        GoogleSearchResultsPage resultsPage = new GoogleSearchResultsPage(driver);
        List<String> results = resultsPage.getLinkResultsText();
        System.out.println(results);
        for(String result: results) {
            if(result.startsWith("https://www.gumtree.com")) {
                linkCount++;
            }
        }
        Assert.assertTrue(linkCount > 0);
    }

    @And("^user should be able to navigate to each Gumtree link and view the results$")
    public void user_should_be_able_to_navigate_to_each_Gumtree_link_and_view_the_results() {
        GoogleSearchResultsPage resultsPage = new GoogleSearchResultsPage(driver);
        GumtreeResultsPage gumtreeResultsPage = new GumtreeResultsPage(driver);
        List<String> results = resultsPage.getLinkResultsText();
        SoftAssert softAssertion = new SoftAssert();
        for(String result: results) {
            if(result.startsWith("https://www.gumtree.com")) {
                driver.navigate().to(result);
                try {
                    Thread.sleep(1000);
                } catch(Exception e) {
                    softAssertion.assertTrue(false, "page load not completed on the specified time");
                }
//                softAssertion.assertEquals(driver.getTitle(), "Used Cars for sale in London - Gumtree");
//                int count = Integer.parseInt(gumtreeResultsPage.getSearchResultsCount());
//                softAssertion.assertTrue(count > 0);
            }
        }
        softAssertion.assertAll();
    }
}
