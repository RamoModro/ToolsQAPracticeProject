package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SortablePage extends BasePage{

    @FindBy(css = "#demo-tab-list")
    private WebElementFacade listTab;

    @FindBy(css = "#demo-tab-grid")
    private WebElementFacade gridTab;

    @FindBy(css = ".vertical-list-container .list-group-item")
    private List<WebElementFacade> listTabElements;

    @FindBy(css = ".grid-container .list-group-item")
    private List<WebElementFacade> gridTabElements;

    public void clickListTab(){
        clickOn(listTab);
    }

    public void clickGridTab(){
        clickOn(gridTab);
    }

//    public boolean sortElementsInList(String number){
//        for (WebElementFacade element : listTabElements) {
//            if (element.getText().equals(number)) {
//                withAction().clickAndHold(element).sendKeys(Keys.ARROW_DOWN).build().perform();
//                waitABit(2000);
//                //withAction().sendKeys(Keys.ENTER);
//                return true;
//            }
//        }
//        return false;
//    }

    public void moveElementToListBottom(){
        WebElement target = listTabElements.get(0);
        WebElement dest = listTabElements.get(5);
        withAction().click(target).clickAndHold().moveToElement(dest).moveByOffset(0, 10).release().build().perform();
    }

    public boolean checkElementWasMovedInListAsIndicated(){
        WebElement target = listTabElements.get(0);
        WebElement dest = listTabElements.get(5);
        return dest.getLocation().equals(target.getLocation());
    }

    public void moveElementInGrid(){
        WebElement target = gridTabElements.get(0);
        WebElement dest = gridTabElements.get(8);
        withAction().click(target).clickAndHold().moveToElement(dest).moveByOffset(2, 2).release().build().perform();
    }
    }




