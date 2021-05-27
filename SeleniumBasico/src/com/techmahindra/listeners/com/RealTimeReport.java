package com.techmahindra.listeners.com;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class RealTimeReport implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(" Test Started-> " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(" Test passed-> " +result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(" Test failed-> "+ result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println(" Test skipped-> "+result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        //No ejecutamos nada sobre este método, pero debe estar presente no se borra
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println(" Test started-> "+context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println(" Test finished-> "+context.getName());
    }
}
