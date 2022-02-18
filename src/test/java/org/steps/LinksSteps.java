package org.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LinksSteps extends BaseSteps{

    @Step
    public void goToLinksPage(){
        elementsPage.clickElementsDropDownButton();
        elementsPage.clickLinksButton();
    }

    @Step
    public void isLinksPageDisplayed(){
        Assert.assertTrue("User is not redirected to Links page",linksPage.isUserInLinksPage());
    }

    @Step
    public void clickHomeLink(){
        linksPage.clickHomeLink();
    }

    @Step
    public void isLinkOpeningInNewTab(){
        linksPage.switchToNewWindow();
        homePage.checkUserIsInHomePage();
    }
}
