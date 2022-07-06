@AlejandroTest2
Feature: Culture Test

  Scenario Outline: Add shoes to cart
    Given User opens Culture Apparel main page
    When user clicks on the navbar for the <category> Category
    And User selects the item with name <itemName>
    And User selects size: <sizeNumber>
    And User selects the quantity: <qty>
    And User clicks on Agregar Al Carrito
    Then User should be able to see the correct summary amount multiplying price by <qty>
    Examples:
      | sizeNumber | category | itemName                                 | qty |
      | 8M         | Sneakers | Nike Sportswear Wmns Air Max 90 (No Box) | 20  |
