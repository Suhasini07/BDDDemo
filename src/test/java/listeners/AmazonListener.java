/**
This class  act as a testNG listener
 * 
 */
package listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.Utils;

/**
 * @author Suhasini Shinde
 */
public class AmazonListener implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) {
		// Logic to take screen shot on test case failure.
		String testCaseName=result.getName();
		
		System.out.println(testCaseName  +" failed");
		
		WebDriver driver = null;
		
	try {
		driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
	} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
	}
	File screenShotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File destFilePath=System.getProperty("user.dir")+"\\Screenshots\\ " +testCaseName + "jpg" ;
		try {
			FileUtils.copyFile(screenShotFile, new File(System.getProperty("user.dir") + "\\Screenshots\\abc.jpg"));
			//FileHandler.copy(screenShotFile, new File(System.getProperty("user.dir") + "\\Screenshots"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
