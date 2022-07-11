@AlejandroTest3
Feature: Search Culture

  Scenario Outline: Search for item
    Given User opens Culture Apparel main page
    When User click on search box
    And User types in <textToSearch>
    Then User should be able to see the item in the results
    Examples:
      | textToSearch |
      | Durag        |