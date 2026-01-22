package com.apiuitest.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(tagName = "h1")
    private WebElement pageTitle;

    @FindBy(linkText = "A/B Testing")
    private WebElement abTestingLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return pageTitle.getText();
    }

    public ABTestingPage clickABTestingLink() {
        click(abTestingLink);
        return new ABTestingPage(driver);
    }
}