package org.features;

import org.junit.Test;

public class AlertsFrameWindowsTest extends BaseTest{

    @Test
    public void verifyWebpageOpensInNewTab(){
        alertsFrameWindowsSteps.navigateToHomePage();
        alertsFrameWindowsSteps.goToAlertsFrameWindows();
        alertsFrameWindowsSteps.goToBrowserWindows();
        alertsFrameWindowsSteps.checkNewTabButton();
    }

    @Test
    public void verifyWebpageOpensInNewWindow(){
        alertsFrameWindowsSteps.navigateToHomePage();
        alertsFrameWindowsSteps.goToAlertsFrameWindows();
        alertsFrameWindowsSteps.goToBrowserWindows();
        alertsFrameWindowsSteps.checkNewWindowButton();
    }

    @Test
    public void checkSimpleAlertIsPresent(){
        alertsFrameWindowsSteps.navigateToHomePage();
        alertsFrameWindowsSteps.goToAlertsFrameWindows();
        alertsFrameWindowsSteps.goToAlerts();
        alertsFrameWindowsSteps.checkFirstAlertButton();
    }

    @Test
    public void checkTimerAlertIsPresent(){
        alertsFrameWindowsSteps.navigateToHomePage();
        alertsFrameWindowsSteps.goToAlertsFrameWindows();
        alertsFrameWindowsSteps.goToAlerts();
        alertsFrameWindowsSteps.checkTimerAlertButton();

    }

    @Test
    public void verifyConfirmBoxAlert(){
        alertsFrameWindowsSteps.navigateToHomePage();
        alertsFrameWindowsSteps.goToAlertsFrameWindows();
        alertsFrameWindowsSteps.goToAlerts();
        alertsFrameWindowsSteps.acceptAlertOption();
        alertsFrameWindowsSteps.navigateToHomePage();
        alertsFrameWindowsSteps.goToAlertsFrameWindows();
        alertsFrameWindowsSteps.goToAlerts();
        alertsFrameWindowsSteps.dismissAlertOption();
    }

    @Test
    public void checkPromptBoxAlert(){
        alertsFrameWindowsSteps.navigateToHomePage();
        alertsFrameWindowsSteps.goToAlertsFrameWindows();
        alertsFrameWindowsSteps.goToAlerts();
        alertsFrameWindowsSteps.verifyPromptBoxAlert(random);
    }
}

