package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class MenuPage extends BasePage{

    @FindBy(className = "main-header")
    private WebElementFacade pageTitle;

    @FindBy(css = "#nav > li:nth-child(2) > ul > li:nth-child(3) > ul > li:nth-child(2) > a")
    private WebElementFacade subSubItem2Element;

    @FindBy(css = "#nav > li:nth-child(2)")
    private WebElementFacade mainItem2Element;

    @FindBy (css = "#nav > li:nth-child(2) > ul > li:nth-child(3) > a")
    private WebElementFacade subSubListItem;


    public void isUserInMenuPage(){
        pageTitle.shouldContainOnlyText("Menu");
    }

    public void goToSubSubItem2ElementInMenu(){
    mainItem2Element.click();
    subSubListItem.click();
    subSubItem2Element.click();
}
}
