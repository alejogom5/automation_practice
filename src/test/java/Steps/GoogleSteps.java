package Steps;

import PageObjects.Locators;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

public class GoogleSteps extends PageObject {

    Locators locators;
    public void openBrowser(){
        getDriver().get("https://www.google.com/");
    }

    public void doSearch(String textToSearch){
        locators.searchBox.type(textToSearch);
        locators.searchButton.click();
    }

    public void selectFirstResult(){
        locators.firstResult.click();
    }

    public void verifyTitle(String titleToVerify){
        Assert.assertEquals(locators.titleToVerify.getText(), titleToVerify);
    }
}
