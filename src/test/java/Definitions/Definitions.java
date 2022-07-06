package Definitions;


import Steps.GoogleSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Definitions {

    GoogleSteps googleSteps; //crear objeto de clase
    @Given("^User opens google main page$")
    public void userOpensGoogleMainPage(){
        googleSteps.openBrowser();
    }


    @When("^User searches for:(.*)$")
    public void userSearchesForCucumber(String textToSearch){
        googleSteps.doSearch(textToSearch);

    }

    @When("^User selects the first result$")
    public void userSelectsTheFirstResult(){
        googleSteps.selectFirstResult();
    }

    @Then("^The user should see this title: (.*)$")
    public void theUserShouldSeeThisTitle(String titleToVerify){
        googleSteps.verifyTitle(titleToVerify);
    }

}
