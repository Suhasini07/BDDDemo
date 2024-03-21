/**
 * This page will will check functionality of taking screenshot
 */
package bdd.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import bdd.baseclass.BaseClass;
import bdd.pages.HomePage;
import bdd.pages.IndexPage;
import bdd.pages.LoginPage;
import listeners.AmazonListener;

/**
 * @author Suhasini Shinde
 */
@Listeners(AmazonListener.class)
public class ScreenshotTest extends BaseClass{
	
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeMethod
	public void setUp()
	{
		launchApp();
	}
	
	@AfterMethod
	public void teaDownIndex()
	{
		tearDown();
	}
	
	@Test
	public void takeScreenShot() {
		
		indexPage= new IndexPage();
		loginPage=indexPage.clickOnSignIn();
		
		homePage=loginPage.login();
		
		
		String actual="https://www.amazon.in/?ref_=nav_ya_signin";
		Assert.assertEquals(actual,driver.getCurrentUrl());

	}

}
