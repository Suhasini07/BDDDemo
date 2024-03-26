/**
 * This is Parent class named as BaseClass.
 */

package bdd.baseclass;

/**
 * @author Suhasini Shinde.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BaseClass {
	
	public static WebDriver driver=null;
	public static Properties prop;
	
	static Logger LOG=Logger.getLogger(BaseClass.class);
	
	public BaseClass()
	{
		
	prop=new Properties();
	try {
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\bdd\\config\\config.properties" );
		prop.load(fis);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
	@BeforeMethod
	public static void launchApp()
	{
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			try {
				LOG.info("Launching Chrome browser");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			try {
				LOG.info("Launching Firefox browser");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(browserName.equalsIgnoreCase("Internet Explorer"))
		{
			driver=new InternetExplorerDriver();
			try {
				LOG.info("Launching Internet Explorer browser");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else
		{
			LOG.info("Invalid browser name");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		
	}
	
	@AfterMethod
	public static  void tearDown() {
		
		driver.close();

	}

}
