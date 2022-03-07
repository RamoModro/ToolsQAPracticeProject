package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends BasePage{

    @FindBy(css = "#register")
    private WebElementFacade registerButton;

    @FindBy(css = "#gotologin")
    private WebElementFacade goToLoginButton;

    @FindBy(css = "#firstname")
    private WebElementFacade firstNameField;

    @FindBy(css = "#lastname")
    private WebElementFacade lastNameField;

    @FindBy(css = "#userName")
    private WebElementFacade userNameField;

    @FindBy(css = "#password")
    private WebElementFacade passwordField;

    @FindBy(css = "iframe[title='reCAPTCHA']")
    private WebElementFacade recaptchaCheckBox;

    public void setFirstNameField(String frstnm){
        typeInto(firstNameField, frstnm);
    }

    public void setLastNameField(String lstnm){
        typeInto(lastNameField, lstnm);
    }

    public void setUserNameField(String usrnm){
        typeInto(userNameField, usrnm);
    }

    public void setPasswordField(String text){
        typeInto(passwordField,text);
    }

    public void thickRecaptchaCheckBox(){
 //       waitABit(5000);
        withAction().moveToElement(recaptchaCheckBox,2,2).click().build().perform();
        scrollToPageBottom();
    }

    public void clickRegister(){
        clickOn(registerButton);
        getAlert().accept();
    }
}
