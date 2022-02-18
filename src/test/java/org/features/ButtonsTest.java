package org.features;

import org.junit.Test;

public class ButtonsTest extends BaseTest{

    @Test
    public void checkButtonsPageIsDisplayed(){
        buttonsSteps.navigateToHomePage();
        buttonsSteps.navigateToElementsPage();
        buttonsSteps.goToButtons();
        buttonsSteps.isButtonsPageDisplayed();
    }
}
