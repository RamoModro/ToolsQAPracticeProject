package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckBoxPage extends BasePage{

    @FindBy(className = "main-header")
    private WebElementFacade pageTitle;

    @FindBy(className = "rct-collapse-btn")
    private WebElementFacade collapseHomeButton;

    @FindBy(className = "rct-checkbox")
    private WebElementFacade checkboxItem;

    @FindBy(className = "rct-option-expand-all")
    private WebElementFacade expandAllButton;

    @FindBy(className = "rct-option-collapse-all")
    private WebElementFacade collapseAllButton;


    public boolean isUserInCheckBoxPage(){
        return pageTitle.containsText("Check Box");
    }

    public void clickCollapseButton(){
        clickOn(collapseHomeButton);
    }

    public void selectCheckboxButton(){
        clickOn(checkboxItem);
    }

    public void clickExpandAllButton(){
        clickOn(expandAllButton);
    }

    public void clickCollapseAllButton(){
        clickOn(collapseAllButton);
    }
}
