package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/")
public class HomePage extends BasePage {

    @FindBy(css = ".top-card:first-child")
    private WebElementFacade elementsLink;

    @FindBy(css = "header a")
    private WebElementFacade pageHeader;

    @FindBy(css = ".top-card:nth-child(2)")
    private WebElementFacade formsLink;

    @FindBy(css = ".top-card:nth-child(3)")
    private WebElementFacade alertsFrameWindowsLink;

    @FindBy(css = ".top-card:nth-child(4)")
    private WebElementFacade widgetsButton;

    @FindBy(css = ".top-card:nth-child(5)")
    private WebElementFacade interactionsLink;

    @FindBy(css = ".top-card:nth-child(6)")
    private WebElementFacade bookStoreAppLink;

    public void clickElementsLink(){
        clickOn(elementsLink);
    }

    public void checkUserIsInHomePage(){
        pageHeader.isPresent();
    }

    public void clickFormsLink(){
        scrollToPageBottom();
        clickOn(formsLink);
    }

    public void clickAlertsFrameWindowsLink(){
        scrollToPageBottom();
        clickOn(alertsFrameWindowsLink);
    }

    public void clickWidgetsLink(){
        clickOn(widgetsButton);
    }

    public void clickInteractionsLink(){
        clickOn(interactionsLink);
    }

    public void clickBookStoreAppLink(){
        clickOn(bookStoreAppLink);
    }
}
