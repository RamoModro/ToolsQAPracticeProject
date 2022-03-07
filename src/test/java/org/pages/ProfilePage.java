package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProfilePage extends BasePage{

    @FindBy(className = "main-header")
    private WebElementFacade pageTitle;

    @FindBy(css = "#submit:nth-child(3)")
    private WebElementFacade logOutButton;

    @FindBy(css = "#searchBox")
    private WebElementFacade searchField;

    @FindBy(css = "#basic-addon2")
    private WebElementFacade searchButton;

    @FindBy(xpath = "//button [text()='Delete Account']")
    private WebElementFacade deleteAccountButton;

    @FindBy(css = ".button.di")
    private WebElementFacade deleteAllBooksButton;

    @FindBy(css = "#gotoStore")
    private WebElementFacade goToStoreButton;

    public boolean isUserInProfilePage(){
        return pageTitle.containsText("Profile");
    }
}
