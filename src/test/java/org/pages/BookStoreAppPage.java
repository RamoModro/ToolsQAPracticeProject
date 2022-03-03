package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class BookStoreAppPage extends BasePage{

    @FindBy(className = "main-header")
    private WebElementFacade pageTitle;

    @FindBy(css = ".element-list.collapse.show #item-0")
    private WebElementFacade loginElement;

    @FindBy(css = "#newUser")
    private WebElementFacade newUserButton;

    @FindBy(css = "#login")
    private WebElementFacade loginButton;

    public boolean isUserInBookStoreAppPage(){
        return pageTitle.containsText("Book Store");
    }

    public boolean goToUserLogin(){
        scrollToPageBottom();
        clickOn(loginElement);
        return pageTitle.containsText("Login");
    }

    public boolean clickNewUserButton(){
        clickOn(newUserButton);
        return pageTitle.containsText("Register");
    }
}
