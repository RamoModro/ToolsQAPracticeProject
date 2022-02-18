package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ElementsPage extends BasePage {

    @FindBy (className = "col-md-6")
    private WebElementFacade itemSelectionText;

    @FindBy (css = ".element-group:first-child")
    private WebElementFacade elementsDropDownButton;

    @FindBy (css = ".element-list.collapse.show li:first-child")
    private WebElementFacade textBoxButton;

    @FindBy(css = ".element-list.collapse.show #item-1")
    private WebElementFacade checkBoxButton;

    @FindBy(css = ".element-list.collapse.show #item-2")
    private WebElementFacade radioButton;

    @FindBy(css = ".element-list.collapse.show #item-3")
    private WebElementFacade webTablesButton;

    @FindBy(css = ".element-list.collapse.show #item-5")
    private WebElementFacade linksButton;

    @FindBy(css = ".element-list.collapse.show #item-6")
    private WebElementFacade brokenLinksButton;

    @FindBy(css = ".element-list.collapse.show #item-4")
    private WebElementFacade buttonsButton;


    public void checkElementsPageIsDisplayed(){
        itemSelectionText.shouldContainOnlyText("Please select an item from left to start practice.");
    }

    public void clickElementsDropDownButton(){
        clickOn(elementsDropDownButton);
    }

    public void clickTextBoxButton(){
        clickOn(textBoxButton);
    }

    public void clickCheckBoxButton(){
        clickOn(checkBoxButton);
    }

    public void clickRadioButtonElement(){
        clickOn(radioButton);
    }

    public void clickWebTablesButton(){
        clickOn(webTablesButton);
    }

    public void clickLinksButton(){
        scrollToPageBottom();
        clickOn(linksButton);
    }

    public void clickBrokenLinksButton(){
        scrollToPageBottom();
        clickOn(brokenLinksButton);
    }

    public void clickButtonsButton(){
        scrollToPageBottom();
        clickOn(buttonsButton);
    }

}
