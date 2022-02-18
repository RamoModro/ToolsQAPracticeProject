package org.features;

import org.junit.Test;

public class LinksTest extends BaseTest{

    @Test
    public void isLinksPageDisplayed(){
        linksSteps.navigateToHomePage();
        linksSteps.navigateToElementsPage();
        linksSteps.goToLinksPage();
        linksSteps.isLinksPageDisplayed();
    }

    @Test
    public void checkLinkOpensInNewTab(){
        linksSteps.navigateToHomePage();
        linksSteps.navigateToElementsPage();
        linksSteps.goToLinksPage();
        linksSteps.clickHomeLink();
        linksSteps.isLinkOpeningInNewTab();
    }
}
