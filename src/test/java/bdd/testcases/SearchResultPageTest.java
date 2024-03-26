/**
 * This Page will test Search Result Page functionality.
 */
package bdd.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
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
	Logger LOG=Logger.getLogger(SearchResultPageTest.class);
	
	@Test
	public void productSearchTest() {
		LOG.info("This test checks whether product is available or not");
		indexPage=new IndexPage();
		serachResultPage=indexPage.searchProduct(prop.getProperty("search"));
		boolean result=serachResultPage.isProductAvailable();
		Assert.assertTrue(result);
		
	}
	
	
	
	
}
