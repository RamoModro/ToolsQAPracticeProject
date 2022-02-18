package org.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class TextBoxSteps extends BaseSteps {

    @Step
    public void goToTextBox(){
        elementsPage.clickElementsDropDownButton();
        elementsPage.clickTextBoxButton();
    }

    @Step
    public void insertDetails(String fullName, String email, String address, String permAddress){
        textBoxPage.setUserNameField(fullName);
        textBoxPage.setUserEmailField(email);
        textBoxPage.setAddressField(address);
        textBoxPage.setPermanentAddressField(permAddress);
    }

    @Step
    public void clickSubmitButton(){
        textBoxPage.clickSubmitButton();
    }

    @Step
    public void checkOutputForm(String name, String mail, String address, String perm){
        textBoxPage.checkOutputName(name);
        textBoxPage.checkOutputEmail(mail);
        textBoxPage.checkOutputAddress(address);
        textBoxPage.checkOutputPermAddress(perm);
    }

    @Step
    public void checkFieldError(){
        textBoxPage.checkFieldError();
    }

    @Step
    public void isOutputBoxPresent(){
        Assert.assertTrue(textBoxPage.isOutputBoxPresent());
    }
}
