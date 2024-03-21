/**
 * This page will test Login Page functionality.
 */
package bdd.testcases;

import org.apache.log4j.Logger;
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
public class LoginPageTest extends BaseClass{
	
	LoginPage loginPage;
	IndexPage indexPage;
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
	
	Logger LOG=Logger.getLogger(LoginPageTest.class);
	
	@Test
	public void loginTest() {
		
		indexPage= new IndexPage();
		loginPage=indexPage.clickOnSignIn();
		
		homePage=loginPage.login();
		String url=homePage.getHomePageURL();
		String expectedURL="https://www.amazon.in/?ref_=nav_signin";
		Assert.assertEquals(url, expectedURL);
		LOG.info("Running Loging Page Test");

	}

}
