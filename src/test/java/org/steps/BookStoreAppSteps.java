package org.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.yecht.Data;

public class BookStoreAppSteps extends BaseSteps{

    @Step
    public void goToBookStoreApp(){
        homePage.clickBookStoreAppLink();
        bookStoreAppPage.isUserInBookStoreAppPage();
    }

    @Step
    public void goToUserLogin(){
        Assert.assertTrue("User is not in Login page",bookStoreAppPage.goToUserLogin());
    }

    @Step
    public void goToUserRegistration(){
        Assert.assertTrue("User is not in Register page", bookStoreAppPage.clickNewUserButton());
    }

    @Step
    public void insertCredentialsInRegistrationForm(String frstnm, String lstnm, String usrnm, String text){
        registerPage.setFirstNameField(frstnm);
        registerPage.setLastNameField(lstnm);
        registerPage.setUserNameField(usrnm);
        registerPage.setPasswordField(text);
    }

    @Step
    public void thickRecaptchaCheckBox(){
        registerPage.thickRecaptchaCheckBox();
    }

    @Step
    public void clickRegisterButton(){
        registerPage.clickRegister();
    }

    @Step
    public void loginWithValidCredentials(String username, String pass){
        bookStoreAppPage.enterLoginCredentials(username, pass);
        bookStoreAppPage.clickLoginButton();
    }

    @Step
    public void checkUserIsInProfilePage(){
        Assert.assertTrue("User is not redirected to Profile page", profilePage.isUserInProfilePage());
    }
}
