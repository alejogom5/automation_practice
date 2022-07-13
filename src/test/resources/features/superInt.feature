@AlejandroTest4
Feature: Check for process status

  Scenario Outline: Verify whats the status of a valid process
    Given User opens SIC main page
    When User hoves over Atencion Y Servicios A la Ciudadania
    And User clicks on Consulte El Estado De Su Tramite
    And User selects <year> from the dropdown
    And User type in <filingNumber>
    And User clicks on Consultar
    Then User should be able to see the information about that <filingNumber>
    Examples:
      | filingNumber | year |
      | 35050       | 2022 |