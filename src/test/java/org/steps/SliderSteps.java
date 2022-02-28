package org.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.junit.Assert.*;

public class SliderSteps extends BaseSteps {

    @Step
    public void goToSliderPage() {
        widgetsPage.goToSliderPage();
        sliderPage.isUserInSliderPage();
    }

    @Step
    public void isSlideBarDisplayed() {
        sliderPage.isSlideBarDisplayed();
    }

    @Step
    public void moveSlideToRight(){
        sliderPage.moveSlideToRight();
    }

    @Step
    public void moveSlideToLeft(){
        sliderPage.moveSlideToLeft();
    }

    @Step
    public void moveSlideToEnd(){
        sliderPage.moveSlideToEnd();
    }

    @Step
    public void checkSliderRangeEqualsSliderOutput(){
       sliderPage.getSliderRange();
       sliderPage.getOutputValue();
    }
}
