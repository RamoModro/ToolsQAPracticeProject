package org.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RadioButtonSteps extends BaseSteps{

    @Step
    public void goToRadioButtonPage(){
        elementsPage.clickRadioButtonElement();
    }

    @Step
    public void isRadioButtonPageDisplayed(){
        Assert.assertTrue("User is not redirected to Radio Button page",radioButtonPage.isUserInRadioButtonPage());
    }
}
