package com.apiuitest.ui;

import org.testng.annotations.Test;
import com.apiuitest.base.UiBaseTest;
import com.apiuitest.ui.pages.HomePage;
import com.apiuitest.utils.ScreenshotUtil;

public class WebUiTest extends UiBaseTest {

    @Test
    public void testHomePage() {
        driver.get("https://the-internet.herokuapp.com/");
        HomePage homePage = new HomePage(driver);

        // Take screenshot
        ScreenshotUtil.takeScreenshot(driver, "home_page");

        // Verify page title
        assert homePage.getPageTitle().contains("The Internet");
    }

    @Test
    public void testABTestingPage() {
        driver.get("https://the-internet.herokuapp.com/");
        HomePage homePage = new HomePage(driver);

        // Navigate to A/B Testing page
        homePage.clickABTestingLink();

        // Take screenshot
        ScreenshotUtil.takeScreenshot(driver, "ab_testing_page");
    }
}