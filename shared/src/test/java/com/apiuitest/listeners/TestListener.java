package com.apiuitest.shared.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import com.apiuitest.shared.utils.LoggerUtil;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        LoggerUtil.info("Test started: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        LoggerUtil.info("Test passed: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        LoggerUtil.error("Test failed: " + result.getMethod().getMethodName());
        LoggerUtil.error("Failure reason: " + result.getThrowable().getMessage());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        LoggerUtil.warn("Test skipped: " + result.getMethod().getMethodName());
    }
}