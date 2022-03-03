package org.steps;

import net.thucydides.core.annotations.Step;

public class SelectMenuSteps extends BaseSteps {

    @Step
    public void goToSelectMenuPage() {
        widgetsPage.goToSelectMenuPage();
        selectMenuPage.isUserInSelectMenuPage();
    }

    @Step
    public void selectFirstDropDownValue(String value) {
        selectMenuPage.setTheFirstDropDownValue(value);
    }

    @Step
    public void setTitleFromDropDown(String title) {
        selectMenuPage.setTitleDrop_Down(title);
    }

    @Step
    public void setOldStyleSelectDropDown(String colour) {
        selectMenuPage.selectValueFromOldStyle(colour);
    }

    @Step
    public void setStandardMultiSelect(String car1, String car2) {
        selectMenuPage.selectValueFromStandardMultiselect(car1, car2);
    }


    @Step
    public void setMultiselectDropdownColor() {
        selectMenuPage.setMultiselectDropdownValue();
    }
}
