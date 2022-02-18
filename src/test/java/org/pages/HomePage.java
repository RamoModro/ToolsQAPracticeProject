package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://demoqa.com/")
public class HomePage extends PageObject {

    @FindBy(css = ".top-card:first-child")
    private WebElementFacade elementsLink;

    @FindBy(css = "header a")
    private WebElementFacade pageHeader;

    public void clickElementsLink(){
        clickOn(elementsLink);
    }

    public void checkUserIsInHomePage(){
        pageHeader.isPresent();
    }
}