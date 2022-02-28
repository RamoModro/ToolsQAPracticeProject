package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ToolTipsPage extends BasePage{

    @FindBy(className = "main-header")
    private WebElementFacade pageTitle;

    @FindBy(css = "#buttonToolTopContainer .btn")
    private WebElementFacade toolTipButton;

    @FindBy(id = "toolTipTextField")
    private WebElementFacade toolTipText;

    public void isUserInToolTipsPage(){
        pageTitle.shouldContainOnlyText("Tool Tips");
    }

    public void hoverToolTipButton(){
        withAction().moveToElement(toolTipButton).build().perform();
        System.out.println(element(By.cssSelector("#buttonToolTip .tooltip-inner")).getText());
    }
}
