/**
This class  act as a testNG listener
 * 
 */
package listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import bdd.baseclass.BaseClass;

/**
 * @author Suhasini Shinde
 */
public class AmazonListener extends BaseClass implements ITestListener {

	 Logger LOG=Logger.getLogger(AmazonListener.class);
	@Override
	public void onTestFailure(ITestResult result) {
		LOG.info("Taking screenshot of failed testcases");
		// Logic to take screen shot on test case failure.
		String testCaseName = result.getName();
		// LOG.info(testCaseName + " failed");
		File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShotFile,
					new File(System.getProperty("user.dir") + "\\Screenshots\\" + testCaseName + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
        LOG.info("End of taking screenshot Test");
	}
}
