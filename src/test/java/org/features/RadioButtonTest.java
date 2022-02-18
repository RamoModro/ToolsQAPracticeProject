package org.features;

import org.junit.Test;

public class RadioButtonTest extends BaseTest{

    @Test
    public void isRadioButtonPageDisplayed(){
        radioButtonSteps.navigateToHomePage();
        radioButtonSteps.navigateToElementsPage();
        radioButtonSteps.goToRadioButtonPage();
        radioButtonSteps.isRadioButtonPageDisplayed();
    }
}
