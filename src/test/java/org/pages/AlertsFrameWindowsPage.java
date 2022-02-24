package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AlertsFrameWindowsPage extends BasePage{

    @FindBy(className = "main-header")
    private WebElementFacade pageTitle;

    @FindBy(css = ".element-group:nth-child(3) #item-0")
    private WebElementFacade browserWindowsButton;

    @FindBy(css = "#tabButton")
    private WebElementFacade tabButton;

    @FindBy(css = "#sampleHeading")
    private WebElementFacade samplePageTxt;

    @FindBy(css = "#windowButton")
    private WebElementFacade windowButton;

    @FindBy(css = ".element-group:nth-child(3) #item-1")
    private WebElementFacade alertsPageButton;

    @FindBy(css = "#alertButton")
    private WebElementFacade alertClickMeButton;

    @FindBy(css = "#timerAlertButton")
    private WebElementFacade timerAlertButton;

    @FindBy(css = "#confirmButton")
    private WebElementFacade confirmBoxButton;

    @FindBy(css = "#confirmResult")
    private WebElementFacade confirmResultText;

    @FindBy(css = "#promtButton")
    private WebElementFacade promptAlertButton;

    @FindBy(css = "#promptResult")
    private WebElementFacade promptSuccessMsg;


    public boolean isUserInAlertsFrameWindowsPage(){
        return pageTitle.containsText("Alerts, Frame & Windows");
    }

    public void clickBrowserWindows(){
        clickOn(browserWindowsButton);
    }

    public void clickTabButton(){
        clickOn(tabButton);
    }

    public boolean isUserInNewTab(){
        return samplePageTxt.containsText("This is a sample page");

    }

    public void clickNewWindowButton(){
        clickOn(windowButton);
    }

    public void clickAlertsButton(){
        scrollToElement(alertsPageButton);
        clickOn(alertsPageButton);
    }

    public void clickFirstAlertButton(){
        clickOn(alertClickMeButton);
        getAlert().accept();
    }

    public void clickTimerAlertButton(){
        clickOn(timerAlertButton);
        waitABit(6000);
        getAlert().accept();
    }

    public void confirmBoxButtonAlert(){
        clickOn(confirmBoxButton);
        getAlert().accept();
    }

    public void dismissBoxButtonAlert(){
        clickOn(confirmBoxButton);
        getAlert().dismiss();
    }

    public void checkAlertIsConfirmed(){
        confirmResultText.shouldContainOnlyText("You selected Ok");
    }

    public void checkAlertIsDismissed(){
        confirmResultText.shouldContainOnlyText("You selected Cancel");
    }

    public void enterNameInAlertAndAccept(String text){
        clickOn(promptAlertButton);
        getAlert().getText();
        getAlert().sendKeys(text);
        getAlert().accept();
        waitABit(3000);
    }

    public boolean checkPromptAlertSuccessMsg(String name){
        return promptSuccessMsg.isDisplayed();

    }
}
