package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class BrokenLinksPage extends BasePage{

    @FindBy(className = "main-header")
    private WebElementFacade pageTitle;

    public boolean isUserInBrokenLinksPage(){
        return pageTitle.containsText("Broken Links - Images");
    }
}
