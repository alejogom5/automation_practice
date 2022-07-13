package Definitions;

import Steps.SuperIntSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.tools.ant.taskdefs.WaitFor;

public class SuperIntDefinitions {

    SuperIntSteps superIntSteps;
    @Given("^User opens SIC main page$")
    public void userOpensSICMainPage() {
        superIntSteps.openBrowser();

    }

    @When("^User hoves over Atencion Y Servicios A la Ciudadania$")
    public void userHovesOverAtencionYServiciosALaCiudadania() {

    }

    @And("^User clicks on Consulte El Estado De Su Tramite$")
    public void userClicksOnConsulteElEstadoDeSuTramite() {
        superIntSteps.selectFromNavbar();
    }

    @And("^User selects (.*) from the dropdown$")
    public void userSelectsYearFromTheDropdown(String year) {
        superIntSteps.selectYear(year);

    }

    @And("^User type in (.*)$")
    public void userTypeInFilingNumber(String filingNumber) {
        superIntSteps.filingNumberInput(filingNumber);
    }

    @And("^User clicks on Consultar$")
    public void userClicksOnConsultar() {
        superIntSteps.searchBtn();
    }

    @Then("^User should be able to see the information about that (.*)$")
    public void userShouldBeAbleToSeeTheInformationAboutThatFilingNumber(String filingNumber) {
        superIntSteps.confirmationLabel(filingNumber);
    }


}
