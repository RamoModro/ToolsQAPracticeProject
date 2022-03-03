package org.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class InteractionsSteps extends BaseSteps{

    @Step
    public void goToInteractionsPage(){
        navigateToHomePage();
        homePage.clickInteractionsLink();
    }

    @Step
    public void checkUserIsInInteractionsPage(){
        Assert.assertTrue("User is not in Interactions page", interactionsPage.isUserInInteractionsPage());
    }

    @Step
    public void goToSortablePage(){
        Assert.assertTrue("User is not in Sortable Page", interactionsPage.goToSortablePage());
    }

    @Step
    public void selectListTab(){
       sortablePage.clickListTab();
    }

    @Step
    public void selectGridTab(){
        sortablePage.clickGridTab();
    }

    @Step
    public void moveElementFromTopToBottomOfList(){
        sortablePage.moveElementToListBottom();
    }

    @Step
    public void moveElementInGrid(){
        sortablePage.moveElementInGrid();
    }

    @Step
    public void checkElementWasMovedInListAsIndicated(){
        Assert.assertFalse("Element was not moved as indicated", sortablePage.checkElementWasMovedInListAsIndicated());
    }

}
