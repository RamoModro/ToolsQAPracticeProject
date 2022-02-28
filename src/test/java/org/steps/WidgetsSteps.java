package org.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class WidgetsSteps extends BaseSteps{

    @Step
    public void goToWidgetsPage(){
        navigateToHomePage();
        homePage.clickWidgetsLink();
    }

    @Step
    public void checkUserIsInWidgetsPage(){
        Assert.assertTrue("User is not in Widgets page", widgetsPage.isUserInWidgetsPage());
    }
}

