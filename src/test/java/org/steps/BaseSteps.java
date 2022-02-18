package org.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.pages.*;

public class BaseSteps extends ScenarioSteps {

    public HomePage homePage;
    public ElementsPage elementsPage;
    public TextBoxPage textBoxPage;
    public CheckBoxPage checkBoxPage;
    public RadioButtonPage radioButtonPage;
    public WebTablesPage webTablesPage;
    public LinksPage linksPage;
    public BrokenLinksPage brokenLinksPage;
    public ButtonsPage buttonsPage;

    @Step
    public void navigateToHomePage(){
        homePage.open();
    }

    @Step
    public void navigateToElementsPage(){
        homePage.clickElementsLink();
        elementsPage.checkElementsPageIsDisplayed();
    }

}
