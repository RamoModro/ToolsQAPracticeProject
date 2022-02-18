package org.features;

import org.junit.Test;

public class WebTablesTest extends BaseTest{

    @Test
    public void isWebTablesPageDisplayed(){
        webTablesSteps.navigateToHomePage();
        webTablesSteps.navigateToElementsPage();
        webTablesSteps.goToWebTables();
        webTablesSteps.isWebTablesPageDisplayed();
    }

    @Test
    public void checkSearchResultContainsSearchedText(){
        webTablesSteps.navigateToHomePage();
        webTablesSteps.navigateToElementsPage();
        webTablesSteps.goToWebTables();
        webTablesSteps.executeSearch("example");
        webTablesSteps.checkListContainsTheSearchedText("example");
    }

    @Test
    public void addNewEmployeeTest(){
        webTablesSteps.navigateToHomePage();
        webTablesSteps.navigateToElementsPage();
        webTablesSteps.goToWebTables();
        webTablesSteps.clickAddButton();
        webTablesSteps.insertRegistrationDetails(random, random, random +"@example.com","33", "22500","Accounting");
        webTablesSteps.clickSubmit();
        webTablesSteps.checkListContainsNewAddedDetails(random);
        webTablesSteps.executeSearch(random);
        webTablesSteps.clickDelete();
        webTablesSteps.executeSearch(random);
        webTablesSteps.checkListContainsTheSearchedText(random);
    }
}
