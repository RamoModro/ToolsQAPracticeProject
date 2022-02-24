package org.steps;

import net.thucydides.core.annotations.Step;

public class FormsSteps extends BaseSteps {


    @Step
    public void goToPracticeForm() {
        homePage.clickFormsLink();
        formsPage.clickPracticeFormButton();
        formsPage.isUserInPracticeFormPage();
    }

    @Step
    public void insertFormDetails(String firstName, String lastName, String email, String gender, String number){
        formsPage.setFirstNameField(firstName);
        formsPage.setFirstLastField(lastName);
        formsPage.setEmailField(email);
        formsPage.setGender(gender);
        formsPage.setMobileField(number);
    }

    @Step
    public void setDateOfBirth(String month, String year, int number){
        formsPage.clickDateOfBirthField();
        formsPage.setMonthOfBirth(month);
        formsPage.setYearOfBirth(year);
        formsPage.setDayOfBirth(number);
    }

    @Step
    public void verifyFormWasSubmitted(){
        formsPage.clickSubmit();
        formsPage.checkSubmissionMsg();
    }

    @Step
    public void closeSubmittedFormMessage(){
        formsPage.closeSubmittedFormMsg();
    }

    @Step
    public void setState(String state){
        formsPage.setState(state);
    }

    @Step
    public void clickChooseFileButton(){
        formsPage.clickChooseFileButton();
    }
}
