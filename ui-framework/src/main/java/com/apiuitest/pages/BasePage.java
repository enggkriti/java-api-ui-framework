package com.apiuitest.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.apiuitest.config.ConfigReader;
import com.apiuitest.utils.LoggerUtil;
import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(ConfigReader.getTimeout()));
        PageFactory.initElements(driver, this);
    }

    protected void waitForElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void click(WebElement element) {
        waitForElement(element);
        element.click();
        LoggerUtil.info("Clicked on element: " + element.toString());
    }

    protected void type(WebElement element, String text) {
        waitForElement(element);
        element.clear();
        element.sendKeys(text);
        LoggerUtil.info("Typed text into element: " + text);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}