package AppUtility;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/*
 * This class implement Interface 'ITestListener' which is a listener for test running
 * OnTestStart : Invoked each time before a test will be invoked.
 * OnTestSuccess : Invoked each time a test succeeds.
 */


public class TestNGListner implements ITestListener, ISuiteListener

{
	
	public void onTestStart(ITestResult result)
	{
		Log.info("==========================================");
		Log.info("TEST_CASE_START: "+ result.getName());
		Log.info("==========================================");
	}

	public void onFinish(ISuite arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		Log.info("==========================================");
		Log.info("RESULT: TEST_CASE_PASS "+ result.getName());
		Log.info("==========================================");
		Log.info("END_OF_TEST_CASE: "+ result.getName());
		Log.info("==========================================");
		
	}

}
