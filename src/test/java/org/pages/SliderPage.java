package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SliderPage extends BasePage{

    @FindBy(css = ".range-slider")
    private WebElementFacade sliderLocator;

    @FindBy(className = "main-header")
    private WebElementFacade pageTitle;

    @FindBy(css = "#sliderValue")
    private WebElementFacade sliderOutput;

    @FindBy(css = ".range-slider__tooltip__label")
    private WebElementFacade rangeSliderButton;

    public void isUserInSliderPage(){
        pageTitle.shouldContainOnlyText("Slider");
    }

    public void isSlideBarDisplayed(){
        Assert.assertTrue(sliderLocator.isDisplayed());
    }

    public void moveSlideToRight(){
       // Dimension sliderSize = sliderLocator.getSize();
        //int sliderWidth = sliderSize.getWidth();
        //int xCoord = sliderLocator.getLocation().getX();
       // withAction().moveToElement(sliderLocator).click().dragAndDropBy(sliderLocator, xCoord+sliderWidth,0).build().perform();
        withAction().moveToElement(sliderLocator).clickAndHold().sendKeys(Keys.ARROW_RIGHT).build().perform();
    }

    public void moveSlideToLeft(){
        withAction().moveToElement(sliderLocator).clickAndHold().sendKeys(Keys.ARROW_LEFT).build().perform();
    }

    public void moveSlideToEnd(){
        for (int i = 25; i <= 99 ; i++) {
            sliderLocator.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public void getSliderRange(){
        withAction().moveToElement(rangeSliderButton).build().perform();
        System.out.println(element(By.cssSelector(".range-slider__tooltip__label")).getText());
    }

    public void getOutputValue(){
        sliderOutput.getText();
    }
}

