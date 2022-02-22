package org.features;

import org.junit.Test;

public class FormsTest extends BaseTest{

    @Test
    public void registerNewStudentTest(){
        formSteps.navigateToHomePage();
        formSteps.goToPracticeForm();
        formSteps.insertFormDetails(random, random, random+"@email.com", "Other", "0772234567");
        formSteps.setDateOfBirth("July", "1990",10);
        formSteps.verifyFormWasSubmitted();
        formSteps.closeSubmittedFormMessage();
    }
}
