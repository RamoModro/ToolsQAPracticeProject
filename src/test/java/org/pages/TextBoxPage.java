package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TextBoxPage extends BasePage{

    @FindBy(id = "userName")
    private WebElementFacade userNameField;

    @FindBy(id = "userEmail")
    private WebElementFacade userEmailField;

    @FindBy(id = "currentAddress")
    private WebElementFacade addressField;

    @FindBy(id = "permanentAddress")
    private WebElementFacade permanentAddressField;

    @FindBy(id = "submit")
    private WebElementFacade submitButton;

    @FindBy(id = "output")
    private WebElementFacade outputBox;

    @FindBy(css = ".border #name")
    private WebElementFacade outputName;

    @FindBy(css = ".border #email")
    private WebElementFacade outputEmail;

    @FindBy(css = ".border #currentAddress")
    private WebElementFacade outputAddress;

    @FindBy(css = ".border #permanentAddress")
    private WebElementFacade outputPermAddress;

    @FindBy(className = "field-error")
    private WebElementFacade fieldError;


    public void setUserNameField(String fullName){
        typeInto(userNameField, fullName);
    }

    public void setUserEmailField(String email){
        typeInto(userEmailField, email);
    }

    public void setAddressField(String address){
        typeInto(addressField,address);
    }

    public void setPermanentAddressField(String permAddress){
        typeInto(permanentAddressField, permAddress);
    }

    public void clickSubmitButton(){
        scrollToPageBottom();
        clickOn(submitButton);
    }

    public void checkOutputName(String name){
        outputName.shouldContainOnlyText("Name:"+ name);
    }

    public void checkOutputEmail(String mail){
        outputEmail.shouldContainOnlyText("Email:"+ mail+ "@email.com");
    }

    public void checkOutputAddress(String address){
        outputAddress.shouldContainOnlyText("Current Address :"+ address);
    }

    public void checkOutputPermAddress(String perm){
        outputPermAddress.shouldContainOnlyText("Permananet Address :"+ perm);
    }

    public void checkFieldError(){
        fieldError.isPresent();
    }

    public boolean isOutputBoxPresent(){
        return outputBox.isPresent();
    }
}
