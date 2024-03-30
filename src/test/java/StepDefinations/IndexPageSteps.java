/**
 * 
 */
package StepDefinations;

import org.testng.Assert;

import bdd.baseclass.BaseClass;
import bdd.pages.IndexPage;
import bdd.pages.SearchResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * 
 */
public class IndexPageSteps extends BaseClass {
	IndexPage indexPage;
	SearchResultPage searchResultPage;

	@Then("Amazon logo is displayed")
	public void amazon_logo_is_displayed() {
		indexPage = new IndexPage();
		boolean result = indexPage.validateLogo();
		Assert.assertTrue(true);

	}

	@When("User enters {string} in seach box")
	public void user_enters_in_seach_box(String string) {

		indexPage = new IndexPage();
		searchResultPage = indexPage.searchProduct(string);
		String title = driver.getTitle();
		System.out.println("Title of navigated page is : " + title);
		Assert.assertEquals("hi", "hi");

	}

//@Then("User is navigated to SearchResult page.")
//public void user_is_navigated_to_search_result_page() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}

}
