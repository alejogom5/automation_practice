package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SuperIntLocators extends PageObject {

    @FindBy(xpath = "//div[@class='nav-collapse ']//child::ul//child::li[3]//child::a[contains(text(),'Atención y servicios a la ciudadanía')]")
    public WebElementFacade elementFromMenu;

    @FindBy(xpath = "//div[@class='nav-collapse ']//child::ul//child::li[3]//child::a[contains(text(),'Atención y servicios a la ciudadanía')]//following::div[@class='mega-dropdown-inner'][1]//child::a[contains(text(),'Consulte el Estado de su Trámite')]")
    public WebElementFacade elementFromSubMenu;

    public WebElementFacade YearSelector(String year){
        return $("//select[@name='fanoradi']//child::option[text()='"+year+"']");
    }
    @FindBy(xpath = "//input[@id='fnumeradi']")
    public WebElementFacade filingNumberInput;

    @FindBy(xpath = "//input[@name='consultar']")
    public WebElementFacade searchBtn;


   // public WebElementFacade confirmationLabel(String filingNumber){
    //    return $("//table[@id='tablaResultados']//child::tr[2]//child::td[text()='"+filingNumber+"']");
   // }

    @FindBy(xpath = "//table[@id='tablaResultados']//child::tr[2]//child::td[3]")
    public WebElementFacade confirmationLabel;
}
