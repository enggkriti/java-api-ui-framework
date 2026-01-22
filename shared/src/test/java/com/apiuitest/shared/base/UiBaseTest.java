package com.apiuitest.shared.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.apiuitest.shared.factory.WebDriverFactory;
import com.apiuitest.shared.utils.LoggerUtil;

public class UiBaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.createDriver();
        LoggerUtil.info("Browser started: " + driver.toString());
    }

    @AfterMethod
    public void tearDown() {
        WebDriverFactory.quitDriver(driver);
        LoggerUtil.info("Browser closed");
    }
}