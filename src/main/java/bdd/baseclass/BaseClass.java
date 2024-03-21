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

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;



public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	
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
	
	//@BeforeTest
	public void launchApp()
	{
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Internet Explorer"))
		{
			driver=new InternetExplorerDriver();
		}
		
		else
		{
			System.out.println("Invalid browser name");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		
	}
	
	//@AfterTest
	public void tearDown() {
		
		driver.close();

	}

}
