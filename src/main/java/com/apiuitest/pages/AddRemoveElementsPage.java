package com.apiuitest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRemoveElementsPage extends BasePage {

    @FindBy(tagName = "h3")
    private WebElement pageHeader;

    @FindBy(xpath = "//button[text()='Add Element']")
    private WebElement addElementButton;

    @FindBy(xpath = "//button[text()='Delete']")
    private WebElement deleteButton;

    public AddRemoveElementsPage(WebDriver driver) {
        super(driver);
    }

    public String getHeaderText() {
        return pageHeader.getText();
    }

    public void clickAddElement() {
        click(addElementButton);
    }

    public void clickDeleteButton() {
        click(deleteButton);
    }

    public boolean isDeleteButtonDisplayed() {
        try {
            return deleteButton.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}