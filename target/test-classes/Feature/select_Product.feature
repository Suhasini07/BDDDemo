Feature: Test select product page is working or not

  Scenario: Select particular product from search result.
    Given browser is launched
    And user is on search page
    When user clicks on particular product
    And user clicks on search button
    Then product details get open in another window
