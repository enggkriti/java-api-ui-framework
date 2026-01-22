package com.apiuitest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ABTestingPage extends BasePage {

    @FindBy(tagName = "h3")
    private WebElement pageHeader;

    @FindBy(tagName = "p")
    private WebElement pageDescription;

    public ABTestingPage(WebDriver driver) {
        super(driver);
    }

    public String getHeaderText() {
        return pageHeader.getText();
    }

    public String getDescriptionText() {
        return pageDescription.getText();
    }
}