package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;

public class AutoCompletePage extends BasePage{

    @FindBy(className = "main-header")
    private WebElementFacade pageTitle;

    @FindBy(id = "autoCompleteMultipleInput") //.auto-complete__input
    private WebElementFacade multipleColorsField;

    public void setMultipleColorsField(){
       multipleColorsField.sendKeys("Blue");
       multipleColorsField.sendKeys(Keys.ENTER);
       multipleColorsField.sendKeys("White");
       multipleColorsField.sendKeys(Keys.ENTER);
    }

    public boolean isUserInAutoCompletePage(){
        return pageTitle.containsText("Auto Complete");
    }

}
