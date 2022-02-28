package org.steps;

import net.thucydides.core.annotations.Step;

public class ToolTipsSteps extends BaseSteps{

    @Step
    public void goToToolTipsPage() {
        widgetsPage.goToToolTipsPage();
        toolTipsPage.isUserInToolTipsPage();
    }

    @Step
    public void checkToolTipButtonHoveredTextIsPresent(){
        toolTipsPage.hoverToolTipButton();
        waitABit(2000);
    }
}
