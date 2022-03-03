package org.features;

import org.junit.Test;

public class InteractionsTest extends BaseTest{

    @Test
    public void checkUserIsInInteractionsPage(){
        interactionsSteps.goToInteractionsPage();
        interactionsSteps.checkUserIsInInteractionsPage();
    }

    @Test
    public void verifySortablePageList(){
    interactionsSteps.goToInteractionsPage();
    interactionsSteps.goToSortablePage();
    interactionsSteps.selectListTab();
    interactionsSteps.moveElementFromTopToBottomOfList();
    interactionsSteps.checkElementWasMovedInListAsIndicated();
}

    @Test
    public void verifySortableGridList(){
        interactionsSteps.goToInteractionsPage();
        interactionsSteps.goToSortablePage();
        interactionsSteps.selectGridTab();
        interactionsSteps.moveElementInGrid();

    }
}
