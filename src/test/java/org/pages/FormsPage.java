package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

import java.util.List;

public class FormsPage extends BasePage{

    @FindBy(className = "main-header")
    private WebElementFacade pageTitle;

    @FindBy(css = ".element-group:nth-child(2) #item-0")
    private WebElementFacade practiceFormButton;

    @FindBy (className = "col-md-6")
    private WebElementFacade itemSelectionText;

    @FindBy(css = "#firstName")
    private WebElementFacade firstNameField;

    @FindBy(css = "#lastName")
    private WebElementFacade lastNameField;

    @FindBy(css = "#userEmail")
    private WebElementFacade emailField;

    @FindBy(css = "#genterWrapper .custom-control")
    private List<WebElementFacade> genderSelection;

    @FindBy(css = "#userNumber")
    private WebElementFacade mobileField;

    @FindBy(css = "#dateOfBirthInput")
    private WebElementFacade dateOfBirthField;

    @FindBy(css = ".react-datepicker__month-select")
    private WebElementFacade monthOfBirth_Dropdown;

    @FindBy(css = ".react-datepicker__year-select")
    private WebElementFacade yearOfBirth_Dropdown;

    @FindBy(css = ".react-datepicker__day")
    private List<WebElementFacade> dayOfBirthList;

    @FindBy(css = "#uploadPicture")
    private WebElementFacade uploadPictureButton;

    @FindBy(css = "#submit")
    private WebElementFacade submitButton;

    @FindBy(css = "#example-modal-sizes-title-lg")
    private WebElementFacade successfulSubmissionMsg;

    @FindBy(css = "#closeLargeModal")
    private WebElementFacade closeSubmittedFormButton;

    @FindBy(css = "#close-fixedban")
    private WebElementFacade closeAddButton;

    @FindBy(css = "#react-select-3-input")
    private WebElementFacade state_Dropdown;

    @FindBy(css = ".form-file")
    private WebElementFacade chooseFileButton;


    public void isUserInPracticeFormPage(){
        pageTitle.containsText("Practice Form");
    }

    public void clickPracticeFormButton(){
        clickOn(practiceFormButton);
    }
    public void checkFormsPageIsDisplayed(){
        itemSelectionText.shouldContainOnlyText("Please select an item from left to start practice.");
    }

    public void setFirstNameField(String firstName){
        typeInto(firstNameField, firstName);
    }

    public void setFirstLastField(String lastName){
        typeInto(lastNameField, lastName);
    }

    public void checkSubmissionMsg(){
        successfulSubmissionMsg.shouldContainOnlyText("Thanks for submitting the form");
    }

    public void setEmailField(String mail){
        typeInto(emailField, mail);
    }

    public boolean setGender(String gender){
        for (WebElementFacade element : genderSelection) {
            if (element.getText().equals(gender)) {
                clickOn(element);
            }
        }
        return false;
}

    public void setMobileField(String number){
        typeInto(mobileField, number);
    }

    public void clickDateOfBirthField(){
        clickOn(dateOfBirthField);
    }

    public void setMonthOfBirth(String month){
        monthOfBirth_Dropdown.selectByVisibleText(month);
    }

    public void setYearOfBirth(String year){
       yearOfBirth_Dropdown.selectByValue(year);
    }

    public boolean setDayOfBirth(int number){
        for (WebElementFacade element : dayOfBirthList) {
            if (element.getText().equals(number+"")) {
                clickOn(element);
                return true;
            }
        }
        return false;
    }

    public void clickSubmit(){
        scrollToPageBottom();
        clickOn(submitButton);}

    public void closeSubmittedFormMsg(){
        clickOn(closeAddButton);
        clickOn(closeSubmittedFormButton);
    }

    public void setState(String state){
        typeInto(state_Dropdown, state);
    }

    public void clickChooseFileButton(){
        clickOn(chooseFileButton);
    }

   // public void uploadPicture(){
       // chooseFileButton.sendKeys("C:\\Users\\ramonamodrogan\\Desktop\\Capture.PNG");
        //if(chooseFileButton.isDisplayed()) {
           // Assert.assertTrue("Picture is Uploaded", true);
       // }else {
           // Assert.fail("Picture not Uploaded");
       // }
    }



