package Steps;

import PageObjects.SuperIntLocators;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SuperIntSteps extends PageObject {

    SuperIntLocators superIntLocators;

    public void openBrowser() {
        getDriver().get("https://www.sic.gov.co/");
    }

    public void selectFromNavbar(){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(superIntLocators.elementFromMenu).perform();
        superIntLocators.elementFromSubMenu.click();
    }

    public void selectYear(String year){
        superIntLocators.YearSelector(year).click();
    }

    public void filingNumberInput(String filingNumber){
        superIntLocators.filingNumberInput.click();
        superIntLocators.filingNumberInput.sendKeys(filingNumber);
    }

    public void searchBtn(){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,550)", "");
        superIntLocators.searchBtn.click();
        waitFor(3).seconds();
        js.executeScript("window.scrollBy(0,850)", "");
    }

    public void confirmationLabel(String filingNumber){
            Assert.assertTrue(superIntLocators.confirmationLabel.getText().equals(filingNumber));
    }
}
