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
	Logger LOG = Logger.getLogger(SearchResultPageTest.class);
	String URL = "https://www.amazon.in/Samsung-Storage-MediaTek-Octa-core-Processor/dp/B0BMGC6LHP/ref=sr_1_4?crid=2THKF1TZGD1KI&dib=eyJ2IjoiMSJ9.hY-jgMjCgqElTsAnfK0ZSBmD21qpbgMLl4APEg77_9sfOJkr0nV4yWDNiCRygGJOI9vhgVoH0sYTjXliS296xCwUfOMsrdzHLm9NWScGLMxODIyBJdhFRviRtxCSHx8OxLQ5tct8jletdxLSdBKcSug2VSoktV87xfs6uIGR3KeWYkp8vdJ9h5BrxR1Xd8afeKWZt-UxSL4nJN77oCBl-_oALJQa6E2Pjf1F-SIdGHU.SptrCOqFYGWIAol-nFwaNrfSAlKh7UFSanf9nPXoc7o&dib_tag=se&keywords=samsung+mobile&qid=1711547030&sprefix=samsu%2Caps%2C283&sr=8-4";

	@Test
	public void productSearchTest() {
		LOG.info("This test checks whether product is available or not");
		indexPage = new IndexPage();
		serachResultPage = indexPage.searchProduct(prop.getProperty("search"));
		boolean result = serachResultPage.isProductAvailable();
		Assert.assertTrue(result);
	}

	@Test
	public void checkSearchedProductInNewWindow() {
		indexPage = new IndexPage();
		serachResultPage = indexPage.searchProduct(prop.getProperty("search"));
		serachResultPage.clickOnProduct1();
		Assert.assertEquals(driver.getCurrentUrl(), URL);

	}

}
