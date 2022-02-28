package org.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class MenuSteps extends BaseSteps{

    @Step
    public void goToMenuPage() {
        widgetsPage.goToMenuPage();
        menuPage.isUserInMenuPage();
    }

    @Step
    public void goToSubSubItem2ElementInMenu(){
       menuPage.goToSubSubItem2ElementInMenu();
    }
}
