package Definitions;

import Steps.CultureSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CultureDefinitions {

    CultureSteps cultureSteps;
    @Given("^User opens Culture Apparel main page$")
    public void userOpensCultureApparelMainPage() {
        cultureSteps.openBrowser();
    }

    @When("^user clicks on the navbar for the (.*) Category$")
    public void userClicksOnTheNavbarForTheSneakersCategory(String category) {
        cultureSteps.selectCategory(category);
    }
    @And("^User selects the item with name (.*)$")
    public void userSelectsTheItemWithNameItemName(String itemName) {
        cultureSteps.selectItem(itemName);
    }

    @And("^User selects size: (.*)$")
    public void userSelectsSizeSizeNumber(String size) {
        cultureSteps.selectSize(size);

    }

    @And("^User selects the quantity: (.*)$")
    public void userSelectsTheQuantityQty(int qty) {
        cultureSteps.selectQty(qty);
    }

    @And("^User clicks on Agregar Al Carrito$")
    public void userClicksOnAgregarAlCarrito() {
        cultureSteps.addToCart();

    }


    @Then("^User should be able to see the correct summary amount multiplying price by (.*)$")
    public void userShouldBeAbleToSeeTheCorrectSummaryAmountMultiplyingPriceByQty(int qty) {
        cultureSteps.checkSummaryAmount(qty);
    }
}
