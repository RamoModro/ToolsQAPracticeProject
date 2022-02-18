package org.features;

import org.junit.Test;

public class CheckBoxTest extends BaseTest{

@Test
    public void isCheckBoxPageDisplayed(){
    checkBoxSteps.navigateToHomePage();
    checkBoxSteps.navigateToElementsPage();
    checkBoxSteps.goToCheckBox();
    checkBoxSteps.isCheckBoxPageDisplayed();
}
}
