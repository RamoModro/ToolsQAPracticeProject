package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LinksPage extends BasePage{

    @FindBy(className = "main-header")
    private WebElementFacade pageTitle;

    @FindBy(id = "simpleLink")
    private WebElementFacade homeLink;

    public boolean isUserInLinksPage(){
        return pageTitle.containsText("Links");
    }
    public void clickHomeLink(){
        clickOn(homeLink);}
}
