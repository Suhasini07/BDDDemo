package bdd.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import bdd.baseclass.BaseClass;
import bdd.pages.IndexPage;
import listeners.AmazonListener;

/**
 * @author Suhasini Shinde
 */



@Listeners(AmazonListener.class)
class IndexPageTest extends BaseClass {
	
	IndexPage indexPage=new IndexPage();

	
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
	
	org.apache.log4j.Logger LOG=org.apache.log4j.LogManager.getLogger(IndexPageTest.class);
	
	
	@Test
	public void verifyLogo()
	{
		boolean result=indexPage.validateLogo();
		Assert.assertTrue(result);
		LOG.info("Verifying Amazon Logo");
	}
	
	
	
	@Test
	
	public void veryTitle()
	{
		String amazonTitle=indexPage.getAmazonTitle();
		Assert.assertEquals(amazonTitle, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		LOG.info("Title of Amazon title");
	}

}
