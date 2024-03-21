/**
 * This Page will test Search Result Page functionality.
 */
package bdd.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import bdd.baseclass.BaseClass;
import bdd.pages.IndexPage;
import bdd.pages.ProductDetailPage;
import bdd.pages.SearchResultPage;
import listeners.AmazonListener;

/**
 * @author Suhasini Shinde
 */
@Listeners(AmazonListener.class)
public class SearchResultPageTest extends BaseClass {
	
	IndexPage indexPage;
	SearchResultPage serachResultPage;
	ProductDetailPage productDetailPage;
	
	
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
	public void productSearchTest() {
		indexPage=new IndexPage();
		serachResultPage=indexPage.searchProduct("samsung mobile");
		boolean result=serachResultPage.isProductAvailable();
		Assert.assertTrue(result);
		
	}
	
	
	
	
}
