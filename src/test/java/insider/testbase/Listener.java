package insider.testbase;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import insider.utils.CommonMethods;

public class Listener implements ITestListener {
	
	public void onStart(ITestContext context) 
	{
		//this prints on the console
	    System.out.println("Functionality test started!");
	    
	}
	
	public void onFinish(ITestContext context) 
	{
	    System.out.println("Functionality test Finished!");
	}
	
	public void onTestStart(ITestResult result) 
	{
	   //prints on the console
		System.out.println(result.getName() + " test is starting!");
	   
		//create a test and add it in the report 
		BaseClass.test = BaseClass.report.createTest(result.getName());
	   
	}
	
	public void onTestSuccess(ITestResult result) 
	{
		//prints on the console
		System.out.println(result.getName() + " test just passed!");
	
		//print the result of the test if the test passed
		BaseClass.test.pass("Test Passed: " + result.getName());
		
		//take a screenshot when a test passes 
		String successImg = CommonMethods.takeScreenshot("passed/"+result.getName());
		BaseClass.test.addScreenCaptureFromPath(successImg);
	
	}
	
	public void onTestFailure(ITestResult result) 
	{
		//prints on the console
		System.out.println(result.getName() + " test just failed!");
		
		//prints the result of the test if it fails
		BaseClass.test.fail("Test failed: "+result.getName());
		
		//take a screenshot when the test fails
		String failImg = CommonMethods.takeScreenshot("failed/"+result.getName());
		BaseClass.test.addScreenCaptureFromPath(failImg);
		
	}
	
	
}
