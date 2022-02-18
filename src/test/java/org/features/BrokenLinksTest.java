package org.features;

import org.junit.Test;

public class BrokenLinksTest extends BaseTest{

    @Test
    public void isBrokenLinksPageIsDisplayed(){
        brokenLinksSteps.navigateToHomePage();
        brokenLinksSteps.navigateToElementsPage();
        brokenLinksSteps.goToBrokenLinks();
        brokenLinksSteps.isBrokenLinksPageDisplayed();
    }
}
