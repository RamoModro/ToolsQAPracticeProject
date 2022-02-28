package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class WidgetsPage extends BasePage{

    @FindBy(className = "main-header")
    private WebElementFacade pageTitle;

    @FindBy(css = ".element-list.collapse.show #item-3")
    private WebElementFacade sliderPageButton;

    @FindBy(css = ".element-list.collapse.show #item-4")
    private WebElementFacade progressBarPageButton;

    @FindBy(css = ".element-list.collapse.show #item-6")
    private WebElementFacade toolTipsPageButton;

    @FindBy(css = ".element-list.collapse.show #item-7")
    private WebElementFacade menuPageButton;

    public boolean isUserInWidgetsPage(){
        return pageTitle.containsText("Widgets");
    }

    public void goToSliderPage(){
        scrollToPageBottom();
        clickOn(sliderPageButton);
    }

    public void goToProgressBarPage(){
        scrollToPageBottom();
        clickOn(progressBarPageButton);
    }

    public void goToToolTipsPage(){
        scrollToPageBottom();
        clickOn(toolTipsPageButton);
    }

    public void goToMenuPage(){
        scrollToPageBottom();
        clickOn(menuPageButton);
    }
}
