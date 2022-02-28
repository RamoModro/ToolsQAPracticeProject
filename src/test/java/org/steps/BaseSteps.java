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
    public FormsPage formsPage;
    public AlertsFrameWindowsPage alertsFrameWindowsPage;
    public WidgetsPage widgetsPage;
    public SliderPage sliderPage;
    public ProgressBarPage progressBarPage;
    public ToolTipsPage toolTipsPage;
    public MenuPage menuPage;

    @Step
    public void navigateToHomePage(){
        homePage.open();
    }

    @Step
    public void navigateToElementsPage(){
        homePage.clickElementsLink();
        elementsPage.checkElementsPageIsDisplayed();
    }

    @Step
    public void navigateToFormsPage(){
        homePage.clickFormsLink();
        formsPage.checkFormsPageIsDisplayed();
    }

}
