package org.features;

import org.junit.Test;

public class FormsTest extends BaseTest{

    @Test
    public void registerNewStudentTest(){
        formSteps.navigateToHomePage();
        formSteps.goToPracticeForm();
        formSteps.insertFormDetails(random, random, random+"@email.com", "Other", "0000000000");
        formSteps.setDateOfBirth("July", "1990",10);
        formSteps.setState("NCR");
        formSteps.verifyFormWasSubmitted();
        formSteps.closeSubmittedFormMessage();
    }
}
