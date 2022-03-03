package org.features;

import net.bytebuddy.utility.RandomString;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.steps.*;
import utils.Constants;

@RunWith(SerenityRunner.class)
public class BaseTest {

    RandomString randomString = new RandomString();
    String random = randomString.nextString();

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void maximise(){
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
    }

    @Steps
    protected TextBoxSteps textBoxSteps;
    @Steps
    protected CheckBoxSteps checkBoxSteps;
    @Steps
    protected RadioButtonSteps radioButtonSteps;
    @Steps
    protected WebTablesSteps webTablesSteps;
    @Steps
    protected LinksSteps linksSteps;
    @Steps
    protected BrokenLinksSteps brokenLinksSteps;
    @Steps
    protected ButtonsSteps buttonsSteps;
    @Steps
    protected FormsSteps formSteps;
    @Steps
    protected AlertsFrameWindowsSteps alertsFrameWindowsSteps;
    @Steps
    protected WidgetsSteps widgetsSteps;
    @Steps
    protected SliderSteps sliderSteps;
    @Steps
    protected ProgressBarSteps progressBarSteps;
    @Steps
    protected ToolTipsSteps toolTipsSteps;
    @Steps
    protected MenuSteps menuSteps;
    @Steps
    protected SelectMenuSteps selectMenuSteps;
    @Steps
    protected AutoCompleteSteps autoCompleteSteps;
    @Steps
    protected InteractionsSteps interactionsSteps;
    @Steps
    protected BookStoreAppSteps bookStoreAppSteps;
}
