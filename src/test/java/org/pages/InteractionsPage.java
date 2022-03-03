package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class InteractionsPage extends BasePage{

    @FindBy(className = "main-header")
    private WebElementFacade pageTitle;

    @FindBy(css = ".element-list.collapse.show #item-0")
    private WebElementFacade sortablePageButton;

    public boolean isUserInInteractionsPage(){
        pageTitle.isPresent();
        return pageTitle.containsText("Interactions");
        }

    public boolean goToSortablePage(){
        scrollToPageBottom();
        clickOn(sortablePageButton);
        pageTitle.isPresent();
        return pageTitle.containsText("Sortable");
    }
    }


