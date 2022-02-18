package org.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class BrokenLinksSteps extends BaseSteps{

    @Step
    public void goToBrokenLinks(){
        elementsPage.clickElementsDropDownButton();
        elementsPage.clickBrokenLinksButton();
    }

    @Step
    public void isBrokenLinksPageDisplayed(){
        Assert.assertTrue("User is not redirected to Broken Links - Images page", brokenLinksPage.isUserInBrokenLinksPage());
    }
}
