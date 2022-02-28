package org.features;

import org.junit.Test;

public class WidgetsTest extends BaseTest{

    @Test
    public void checkUserIsInWidgetsPage(){
        widgetsSteps.goToWidgetsPage();
        widgetsSteps.checkUserIsInWidgetsPage();
    }

    @Test
    public void dragSliderToRightAndLeft(){
        widgetsSteps.goToWidgetsPage();
        sliderSteps.goToSliderPage();
        sliderSteps.isSlideBarDisplayed();
        sliderSteps.moveSlideToRight();
        sliderSteps.moveSlideToLeft();
    }

    @Test
    public void dragSliderToEnd(){
        widgetsSteps.goToWidgetsPage();
        sliderSteps.goToSliderPage();
        sliderSteps.isSlideBarDisplayed();
        sliderSteps.moveSlideToEnd();
        sliderSteps.checkSliderRangeEqualsSliderOutput();
    }

    @Test
    public void checkProgressBar(){
        widgetsSteps.goToWidgetsPage();
        progressBarSteps.goToProgressBarPage();
        progressBarSteps.clickStartButton();
        progressBarSteps.checkProgressBarIsFullyCharged();
        progressBarSteps.resetProgressBar();
    }

    @Test
    public void checkToolTipButton(){
        widgetsSteps.goToWidgetsPage();
        toolTipsSteps.goToToolTipsPage();
        toolTipsSteps.checkToolTipButtonHoveredTextIsPresent();
    }

    @Test
    public void goToSubSubItem2ElementInMenu(){
        widgetsSteps.goToWidgetsPage();
        menuSteps.goToMenuPage();
        menuSteps.goToSubSubItem2ElementInMenu();
    }
}
