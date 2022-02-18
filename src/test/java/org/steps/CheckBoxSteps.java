package org.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CheckBoxSteps extends BaseSteps{

    @Step
    public void goToCheckBox(){
        elementsPage.clickElementsDropDownButton();
        elementsPage.clickCheckBoxButton();
    }

    @Step
    public void isCheckBoxPageDisplayed(){
        Assert.assertTrue("User is not redirected to Check Box page",checkBoxPage.isUserInCheckBoxPage());
    }
}
