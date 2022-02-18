package org.pages;

import net.bytebuddy.utility.RandomString;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class BasePage extends PageObject {

    RandomString randomString = new RandomString();
    String random = randomString.nextString();

    @Override
    protected void waitABit(long timeInMilliseconds) {
        super.waitABit(timeInMilliseconds);
    }

    public void scrollToPageTop() {
        ((JavascriptExecutor)getDriver()).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    }

    public void scrollToPageBottom() {
        ((JavascriptExecutor)getDriver()).executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void switchToNewWindow(){
        String currentWindow = getDriver().getWindowHandle();
        Set<String> allWindows = getDriver().getWindowHandles();
        for(String window : allWindows){
            if(!window.contentEquals(currentWindow)){
                getDriver().switchTo().window(window);
                break;
            }
        }
    }
    }

