package org.steps;

import net.thucydides.core.annotations.Step;

public class AutoCompleteSteps extends BaseSteps{

    @Step
    public void goToAutoCompletePage(){
        widgetsPage.goToAutoCompletePage();
        autoCompletePage.isUserInAutoCompletePage();
    }

    @Step
    public void setMultipleColorField(){
        autoCompletePage.setMultipleColorsField();
    }
}
