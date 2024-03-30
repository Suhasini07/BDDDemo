package StepDefinations;

import org.openqa.selenium.By;

import bdd.baseclass.BaseClass;
import bdd.pages.IndexPage;
import bdd.pages.SearchResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps extends BaseClass {

	IndexPage indexPage;
	SearchResultPage searchResultPage;

	@When("User enters text in serach box")
	public void user_enters_text_in_serach_box() {
		indexPage = new IndexPage();
		searchResultPage = indexPage.searchProduct(prop.getProperty("search"));
	}

//	@When("user clecks on search button")
//	public void user_clecks_on_search_button() {
//		searchResultPage.clickOnProduct1();
//
//	   }

	@Then("user is navigated to related search results.")
	public void user_is_navigated_to_related_search_results() {
		indexPage = new IndexPage();
		searchResultPage.clickOnProduct1();

	}

}
