# Author: Alejandro Gomez

@AlejandroTest
Feature: Alejandro Test

  Scenario Outline: Google search
    Given User opens google main page
    When User searches for: <textToSearch>
    And User selects the first result
    Then The user should see this title: <titleToVerify>
    Examples:
      | textToSearch    | titleToVerify                            |
      | Cucumber Guru99 | Cucumber Testing Tutorials for Beginners |

