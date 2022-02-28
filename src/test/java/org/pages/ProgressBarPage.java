package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class ProgressBarPage extends BasePage{

    @FindBy(className = "main-header")
    private WebElementFacade pageTitle;

    @FindBy(css = "#startStopButton")
    private WebElementFacade startStopButton;

    @FindBy(css = "#progressBar")
    private WebElementFacade progressBar;

    @FindBy(css = "#resetButton")
    private WebElementFacade resetButton;

    @FindBy(css = "#progressBar .bg-success")
    private WebElementFacade progressBarFullProgress;

    public void isUserInProgressBarPage(){
        pageTitle.shouldContainOnlyText("Progress Bar");
    }

    public void clickStartStopButton(){
        clickOn(startStopButton);
        waitABit(13000);
    }

    public void clickResetButton(){
        clickOn(resetButton);
    }

    public void readProgressBar(){
        Assert.assertEquals("100%", progressBar.getText());
    }
}
