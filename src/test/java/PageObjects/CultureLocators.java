package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CultureLocators extends PageObject{

   // @FindBy(xpath = "(//nav[@id='comp-kp442h95navContainer']//child::li)[3]")
    //public WebElementFacade selectCategory;

    public WebElementFacade selectCategory(String category) {
        return $("//nav[@id='comp-kp442h95navContainer']//child::p[text()='"+category+"']");
    }

    public WebElementFacade selectItem(String itemName) {
        return $("//*[contains(text(),'"+itemName+"')]");
    }

    ////div[@data-hook='dropdown-content']//following::div[@title='9M']
    ////*[@role="listbox"]

    @FindBy(xpath = "//*[@class='DropdownBase1303894399__arrowIcon']")
    public WebElementFacade listBox;

    public WebElementFacade selectSizeOrColor(String sizeOrColor) {
        return $("//div[@data-hook='dropdown-content']//following::div[@title='"+sizeOrColor+"']");
    }

    @FindBy(xpath = "//div[@class='_2uERl']")
    public WebElementFacade quantityField;

    @FindBy(xpath = "//div[@class='_2uERl']//child::div//child::span[1]")
    public WebElementFacade increaseQty;

    @FindBy(xpath = "//button[@type='button']//child::span[text()='Agregar al carrito']")
    public WebElementFacade addToCartButton;


    @FindBy(xpath = "//div[@class='item-price']//child::span[2]")
    public WebElementFacade itemPrice;

    @FindBy(xpath = "//section[@class='cart-widget-subtotal']//child::div[2]")
    public WebElementFacade subTotal;

}
