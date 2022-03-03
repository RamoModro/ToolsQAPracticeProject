package org.features;

import org.junit.Test;

public class BookStoreAppTest extends BaseTest{

    @Test
    public void checkNewUserRegistration(){
        bookStoreAppSteps.goToBookStoreApp();
        bookStoreAppSteps.goToUserLogin();
        bookStoreAppSteps.goToUserRegistration();
        bookStoreAppSteps.insertCredentialsInRegistrationForm("User", "Name", "UserName", "Parolaexpirata123#");
        bookStoreAppSteps.thickRecaptchaCheckBox();
       // bookStoreAppSteps.clickRegisterButton();
    }
}
