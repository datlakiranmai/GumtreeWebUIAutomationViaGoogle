$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/features/Search.feature");
formatter.feature({
  "name": "Test the Google search functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should be able to perform a search",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on Google home page",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchSteps.user_is_on_Google_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches for Cars in London",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchSteps.user_searches_for_Cars_in_London(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be presented with search results",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchSteps.user_should_be_presented_with_search_results()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should see Gumtree links within the search results displayed seraching for \"Cars in London\"",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on Google home page",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchSteps.user_is_on_Google_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches for Cars in London",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchSteps.user_searches_for_Cars_in_London(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be presented with search results",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchSteps.user_should_be_presented_with_search_results()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see Gumtree links within the search results displayed",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleSearchSteps.user_should_see_Gumtree_links_within_the_search_results_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to navigate to Gumtree links from the search results",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on Google home page",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchSteps.user_is_on_Google_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches for Cars in London",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchSteps.user_searches_for_Cars_in_London(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see Gumtree links within the search results displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchSteps.user_should_see_Gumtree_links_within_the_search_results_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to navigate to each Gumtree link and view the results",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleSearchSteps.user_should_be_able_to_navigate_to_each_Gumtree_link_and_view_the_results()"
});
formatter.result({
  "status": "passed"
});
});