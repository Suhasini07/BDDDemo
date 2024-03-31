/**
 * This class will add screenshot of failed testcases into an Allure Report.
 */
package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;


/**
 * @author Suhasini Shinde.
 */
public class AllureReportListener implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) {
	}

}
