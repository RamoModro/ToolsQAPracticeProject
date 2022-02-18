package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class RadioButtonPage extends BasePage{

    @FindBy(className = "main-header")
    private WebElementFacade pageTitle;

    public boolean isUserInRadioButtonPage(){
        return pageTitle.containsText("Radio Button");
    }
}
