package org.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AlertsFrameWindowsSteps extends BaseSteps{

    @Step
    public void goToAlertsFrameWindows(){
        homePage.clickAlertsFrameWindowsLink();
        alertsFrameWindowsPage.isUserInAlertsFrameWindowsPage();
    }

    @Step
    public void goToBrowserWindows(){
        alertsFrameWindowsPage.clickBrowserWindows();
    }

    @Step
    public void checkNewTabButton(){
        alertsFrameWindowsPage.clickTabButton();
        alertsFrameWindowsPage.switchToNewWindow();
        alertsFrameWindowsPage.isUserInNewTab();
    }

    @Step
    public void checkNewWindowButton(){
        alertsFrameWindowsPage.clickNewWindowButton();
        alertsFrameWindowsPage.switchToNewWindow();
        alertsFrameWindowsPage.isUserInNewTab();
    }

    @Step
    public void goToAlerts(){
        alertsFrameWindowsPage.clickAlertsButton();
    }

    @Step
    public void checkFirstAlertButton(){
        alertsFrameWindowsPage.clickFirstAlertButton();
        alertsFrameWindowsPage.isAlertPresent();
    }

    @Step
    public void checkTimerAlertButton(){
        alertsFrameWindowsPage.clickTimerAlertButton();

    }

    @Step
    public void acceptAlertOption(){
        alertsFrameWindowsPage.confirmBoxButtonAlert();
        alertsFrameWindowsPage.checkAlertIsConfirmed();
    }

    @Step
    public void dismissAlertOption(){
        alertsFrameWindowsPage.dismissBoxButtonAlert();
        alertsFrameWindowsPage.checkAlertIsDismissed();
    }

    @Step
    public void verifyPromptBoxAlert(String name){
        alertsFrameWindowsPage.enterNameInAlertAndAccept(name);
       Assert.assertTrue("Please enter your name", alertsFrameWindowsPage.checkPromptAlertSuccessMsg("You entered" + name));
    }
}
