package org.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ProgressBarSteps extends BaseSteps{

    @Step
    public void goToProgressBarPage() {
        widgetsPage.goToProgressBarPage();
        progressBarPage.isUserInProgressBarPage();
    }

    @Step
    public void clickStartButton(){
        progressBarPage.clickStartStopButton();
    }

    @Step
    public void checkProgressBarIsFullyCharged(){
    progressBarPage.readProgressBar();
    }

    @Step
    public void resetProgressBar(){
        progressBarPage.clickResetButton();
    }
}
