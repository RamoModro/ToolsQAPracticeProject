package org.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ButtonsSteps extends BaseSteps {

    @Step
    public void goToButtons(){
        elementsPage.clickElementsDropDownButton();
        elementsPage.clickButtonsButton();
    }

    @Step
    public void isButtonsPageDisplayed(){
        Assert.assertTrue("User is not redirected to Buttons page", buttonsPage.isUserInButtonsPage());
    }
}
