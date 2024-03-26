package bdd.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import bdd.baseclass.BaseClass;
import bdd.pages.IndexPage;
import bdd.pages.SearchResultPage;
import listeners.AmazonListener;

/**
 * @author Suhasini Shinde
 */



@Listeners(AmazonListener.class)
public class IndexPageTest extends BaseClass {
	
	IndexPage indexPage;
	SearchResultPage searchResultPage;
    Logger LOG=Logger.getLogger(IndexPageTest.class);
	
	
	
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
		LOG.info("Running test to check Title of Amazon title");
	}
	
	@Test
	
	public void navigatingToSearchResultPage() {
		indexPage=new IndexPage();
		searchResultPage=indexPage.searchProduct(prop.getProperty("search"));
		//return searchResultPage;
		String title=driver.getTitle();
		System.out.println("Title of navigated page is : " + title);
		Assert.assertEquals(title, "Amazon.in : samsung mobile");
	}

}
