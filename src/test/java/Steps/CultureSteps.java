package Steps;

import PageObjects.CultureLocators;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;


public class CultureSteps extends PageObject {

    CultureLocators cultureLocators;

    public void openBrowser() {
        getDriver().get("https://alejogom5.wixsite.com/culture");
    }

    public void selectCategory(String category) {
        cultureLocators.selectCategory(category).click();
    }

    public void selectItem(String itemName) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,400)", "");
        cultureLocators.selectItem(itemName).click();
    }

    public void selectSize(String size) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,350)", "");
        waitFor(2).seconds();
        cultureLocators.listBox.click();
        cultureLocators.selectSizeOrColor(size).click();
    }

    public void selectQty(int qty) {
        cultureLocators.quantityField.click();
        for (int i = 0; i < qty-1; i++) {
            cultureLocators.increaseQty.click();
        }
    }

    public void addToCart(){
        cultureLocators.addToCartButton.click();
    }

    public  void checkSummaryAmount(int qty){
        WebElementFacade iframe = $("//div[@class='WF3Qj']//following::iframe");
        getDriver().switchTo().frame(iframe);
        String[] price = cultureLocators.itemPrice.getText().split("\\$");
        String[] subTotal = cultureLocators.subTotal.getText().split("\\$");
        Assert.assertTrue((Integer.parseInt(price[1].replace(".","").replace(",00","")) * qty) == Integer.parseInt(subTotal[1].replace(".","").replace(",00","")));
    }

    public void searchBox(){
        cultureLocators.searchBox.click();
    }

    public void searchForItem(String textToSearch){
        cultureLocators.searchBox.sendKeys(textToSearch + Keys.ENTER);
        waitFor(5).seconds();
    }

    public void searchResult(){
        Assert.assertTrue(cultureLocators.searchResult.getText(),true);
    }


}
