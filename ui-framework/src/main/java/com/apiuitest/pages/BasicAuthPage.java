package com.apiuitest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicAuthPage extends BasePage {

    @FindBy(tagName = "p")
    private WebElement successMessage;

    public BasicAuthPage(WebDriver driver) {
        super(driver);
    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }
}