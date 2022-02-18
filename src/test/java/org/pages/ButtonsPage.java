package org.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ButtonsPage extends BasePage {

    @FindBy(className = "main-header")
    private WebElementFacade pageTitle;

    public boolean isUserInButtonsPage(){
        return pageTitle.containsText("Buttons");
    }
}
