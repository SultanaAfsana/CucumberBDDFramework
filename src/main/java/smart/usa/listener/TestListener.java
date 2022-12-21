package smart.usa.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import smart.usa.Base.BaseClass;
import smart.usa.Utility.CommonUtility;

//how do you know your test case status(pass/fail/skip)?
//With the help of unit testing framework there has ITestListener interface
//which help us to listen the test case status
//What is ITestListener? - It is an interface that contains 100% abstract method

public class TestListener extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("OnTest starts: "+result.getName());
		System.out.println("OnTest starts: "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("OnTest success: "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		CommonUtility.captureScreenshot(driver, "Falied Test");
		System.out.println(result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(context.getName());
	}
	
}