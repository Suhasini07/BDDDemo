Feature: Feature to test search functionality

  Scenario: Verify item gets searched or not
    Given Browser is launched
    And User is on home page
    When User enters text in serach box
    And user clecks on search button
    Then user is navigated to related search results.
