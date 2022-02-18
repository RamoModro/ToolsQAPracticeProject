package org.features;

import org.junit.Test;

public class TextBoxTest extends BaseTest{

    @Test
    public void insertValidCredentialsTest(){
        textBoxSteps.navigateToHomePage();
        textBoxSteps.navigateToElementsPage();
        textBoxSteps.goToTextBox();
        textBoxSteps.insertDetails(random, random+ "@email.com", random, random);
        textBoxSteps.clickSubmitButton();
        textBoxSteps.checkOutputForm(random, random, random, random);
    }

    @Test
    public void insertInvalidEmailTest(){
        textBoxSteps.navigateToHomePage();
        textBoxSteps.navigateToElementsPage();
        textBoxSteps.goToTextBox();
        textBoxSteps.insertDetails(random, "sdfds.org", random, random);
        textBoxSteps.clickSubmitButton();
        textBoxSteps.checkFieldError();
    }

    @Test
    public void submitBlankForm(){
        textBoxSteps.navigateToHomePage();
        textBoxSteps.navigateToElementsPage();
        textBoxSteps.goToTextBox();
        textBoxSteps.clickSubmitButton();
        textBoxSteps.isOutputBoxPresent();
    }
}
