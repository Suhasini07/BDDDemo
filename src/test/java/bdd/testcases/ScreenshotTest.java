/**
 * This page will will check functionality of taking screenshot
 */
package bdd.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
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
public class ScreenshotTest extends BaseClass {

	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	Logger LOG = Logger.getLogger(ScreenshotTest.class);

	@Test
	public void checkScreenShot() {
		LOG.info("This test case is checking whether screenshot gets captured after test case getting fail");

		indexPage = new IndexPage();
		loginPage = indexPage.clickOnSignIn();

		homePage = loginPage.login();

		String actual = "https://www.amazon.in/?ref_=nav_ya_signin123";
		Assert.assertEquals(actual, driver.getCurrentUrl());

	}

}
