Feature: Test the Google search functionality

  Scenario: User should be able to perform a search
    Given user is on Google home page
    When user searches for Cars in London
    Then user should be presented with search results

  Scenario: User should see Gumtree links within the search results displayed seraching for "Cars in London"
    Given user is on Google home page
    When user searches for Cars in London
    Then user should be presented with search results
    And user should see Gumtree links within the search results displayed

  Scenario: User should be able to navigate to Gumtree links from the search results
    Given user is on Google home page
    When user searches for Cars in London
    Then user should see Gumtree links within the search results displayed
    And user should be able to navigate to each Gumtree link and view the results
