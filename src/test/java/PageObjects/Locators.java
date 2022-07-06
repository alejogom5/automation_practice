package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class Locators extends PageObject {

    @FindBy(xpath = "//input[@title='Buscar']")
    public WebElementFacade searchBox;

    @FindBy(xpath = "(//input[@class='gNO89b'])[1]")
    public WebElementFacade searchButton;

    @FindBy(xpath = "//h3[text()='Cucumber Testing Tutorials for Beginners - Guru99']")
    public WebElementFacade firstResult;

    @FindBy(xpath = "//h1[text()='Cucumber Testing Tutorials for Beginners']")
    public WebElementFacade titleToVerify;
}
