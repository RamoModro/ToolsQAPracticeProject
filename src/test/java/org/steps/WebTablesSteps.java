package org.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class WebTablesSteps extends BaseSteps{

    @Step
    public void goToWebTables(){
        elementsPage.clickElementsDropDownButton();
        elementsPage.clickWebTablesButton();
    }

    @Step
    public void isWebTablesPageDisplayed(){
        Assert.assertTrue("User is not redirected to Check Box page", webTablesPage.isUserInWebTablesPage());
    }

    @Step
    public void executeSearch(String keyword){
        webTablesPage.setSearchField(keyword);
        webTablesPage.clickSearchButton();
    }

    @Step
    public void checkListContainsTheSearchedText(String keyword){
        Assert.assertTrue("Result doesn't contain the searched keyword", webTablesPage.isKeywordInList(keyword));
    }

    @Step
    public void clickAddButton(){
        webTablesPage.clickAddButton();
    }

    @Step
    public void insertRegistrationDetails(String firstNm, String lastNm, String mail, String number, String value, String text){
        webTablesPage.setFirstNameField(firstNm);
        webTablesPage.setLastNameField(lastNm);
        webTablesPage.setEmailField(mail);
        webTablesPage.setAgeField(number);
        webTablesPage.setSalaryField(value);
        webTablesPage.setDepartmentField(text);
    }

    @Step
    public void clickSubmit(){
        webTablesPage.clickSubmitButton();
    }

    @Step
    public void checkListContainsNewAddedDetails(String keyword){
        Assert.assertTrue("Result doesn't contain the new added details", webTablesPage.isKeywordInList(keyword));
    }

    @Step
    public void clickDelete(){
       webTablesPage.clickDeleteButton();
    }
}
