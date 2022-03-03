package org.pages;

import com.ibm.icu.impl.UResource;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.bcel.generic.Select;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;


public class SelectMenuPage extends BasePage {

    @FindBy(className = "main-header")
    private WebElementFacade pageTitle;

    @FindBy(id = "withOptGroup")
    private WebElementFacade firstDrop_DownButton;

    @FindBy(css = "div[id*='option']")
    private List<WebElementFacade> firstDrop_DownValueList;

    @FindBy(id = "selectOne")
    private WebElementFacade titleDrop_DownButton;

    @FindBy(css = "div[id*='option']")
    private List<WebElementFacade> titleDrop_DownList;

    @FindBy(css = "#oldSelectMenu")
    private WebElementFacade oldStyleDrop_DownButton;

    @FindBy(css = "#selectMenuContainer > div:nth-child(7) > div > div > div")
    private WebElementFacade multiselectDrop_Down;

    @FindBy(css = "#cars")
    private WebElementFacade standardMultiSelectOption;

    @FindBy(css = "#cars option")
    private List<WebElementFacade> standardMultiSelectValue;

    @FindBy(css = "div[id*='option']")
    private WebElementFacade multiselectDropdownValue;

    @FindBy(xpath = "//div[text()='Select...']")           //div[class*='container']:nth-child(4)
    private WebElementFacade multiselectDropdownField;


    public void isUserInSelectMenuPage() {
        pageTitle.shouldContainOnlyText("Select Menu");
    }

    public void setTheFirstDropDownValue(String value) { //div[text()='Group 2, option 1']
        clickOn(firstDrop_DownButton);
//        find(By.xpath("//div[text()='" + value + "']")).click();
//        List<WebElementFacade> dropDownList = findAll(By.cssSelector("div[id*='option']"));
        for (WebElement element : firstDrop_DownValueList) {
            if (element.getText().equalsIgnoreCase(value)) {
                clickOn(element);
                break;
            }
        }
    }

    public void setTitleDrop_Down(String title) {
        clickOn(titleDrop_DownButton);
        for (WebElement element : titleDrop_DownList) {
            if (element.getText().equalsIgnoreCase(title)) {
                clickOn(element);
                break;
            }
        }
    }

    public void selectValueFromOldStyle(String option) {
        oldStyleDrop_DownButton.selectByVisibleText(option);
    }

    public void selectValueFromMultiselectDropdown(String option) {
        multiselectDrop_Down.selectByVisibleText(option);
    }

    public void selectValueFromStandardMultiselect(String car1, String car2) {
       scrollToPageBottom();
           clickOn(standardMultiSelectOption);
           for (WebElement element : standardMultiSelectValue) {
                if (element.getText().equalsIgnoreCase(car1)) {
                    clickOn(element);
                    if (element.getText().equalsIgnoreCase(car2)) {
                        clickOn(element);
                   break;
               }
            }}
}

    public void setMultiselectDropdownValue(){
        scrollToPageBottom();
        clickOn(multiselectDropdownField);
        withAction().keyDown(Keys.CONTROL).click(multiselectDropdownValue).build().perform();
        withAction().keyDown(Keys.CONTROL).click(multiselectDropdownValue).build().perform();
        withAction().keyDown(Keys.CONTROL).click(multiselectDropdownValue).build().perform();
        withAction().keyDown(Keys.CONTROL).click(multiselectDropdownValue).build().perform();
            }}


