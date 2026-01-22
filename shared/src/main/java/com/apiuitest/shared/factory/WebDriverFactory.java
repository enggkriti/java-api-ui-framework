package com.apiuitest.shared.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import com.apiuitest.shared.config.ConfigReader;

public class WebDriverFactory {
    public static WebDriver createDriver() {
        String browser = ConfigReader.getBrowser();
        if (browser == null) {
            browser = "chrome"; // default
        }

        switch (browser.toLowerCase()) {
            case "firefox":
                return new FirefoxDriver();
            case "edge":
                return new EdgeDriver();
            case "chrome":
            default:
                return new ChromeDriver();
        }
    }

    public static void quitDriver(WebDriver driver) {
        if (driver != null) {
            driver.quit();
        }
    }
}