package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class WebTablesPage extends BasePage{

    @FindBy(className = "main-header")
    private WebElementFacade pageTitle;

    @FindBy(id = "addNewRecordButton")
    private WebElementFacade addButton;

    @FindBy(id = "searchBox")
    private WebElementFacade searchField;

    @FindBy(id = "basic-addon2")
    private WebElementFacade searchButton;

    @FindBy(className = "rt-td")
    private List<WebElementFacade> listOfEmployees;

    @FindBy(id = "firstName")
    private WebElementFacade firstNameField;

    @FindBy(id = "lastName")
    private WebElementFacade lastNameField;

    @FindBy(id = "userEmail")
    private WebElementFacade emailField;

    @FindBy(id = "age")
    private WebElementFacade ageField;

    @FindBy(id = "salary")
    private WebElementFacade salaryField;

    @FindBy(id = "department")
    private WebElementFacade departmentField;

    @FindBy(id = "submit")
    private WebElementFacade submitButton;

    @FindBy(css = ".action-buttons span[title='Delete']")
    private WebElementFacade deleteButton;

    public boolean isUserInWebTablesPage(){
        return pageTitle.containsText("Web Tables");
    }

    public void clickAddButton(){
        clickOn(addButton);
    }

    public void setSearchField(String value){
        typeInto(searchField, value);
    }

    public void clickSearchButton(){
        clickOn(searchButton);
    }

    public boolean isKeywordInList(String searchKeyword){
        for (WebElementFacade element : listOfEmployees) {
            if (!element.getText().contains(searchKeyword)){
                return true;
            }
        }
        return false;
    }

    public void setFirstNameField(String firstName){
        typeInto(firstNameField, firstName);
    }

    public void setLastNameField(String lastName){
        typeInto(lastNameField, lastName);
    }

    public void setEmailField(String mail){
        typeInto(emailField, mail);
    }

    public void setAgeField(String number){
        typeInto(ageField, number);
    }

    public void setSalaryField(String value){
        typeInto(salaryField, value);
    }

    public void setDepartmentField(String text){
        typeInto(departmentField, text);
    }

    public void clickSubmitButton(){
        clickOn(submitButton);
    }

    public void clickDeleteButton(){
        clickOn(deleteButton);
    }
}
