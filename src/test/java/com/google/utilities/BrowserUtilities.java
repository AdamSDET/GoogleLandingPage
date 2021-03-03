package com.google.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtilities {

    public void waitForWebElementVisibility(WebElement element, int time) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), time);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
