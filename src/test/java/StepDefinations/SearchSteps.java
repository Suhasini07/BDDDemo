package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import bdd.baseclass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps extends BaseClass {
	
	//WebDriver driver=null;
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
		
		System.out.println(">> User is on home page");
		driver.get("");
		
	   }

	@When("User enters text in serach box")
	public void user_enters_text_in_serach_box() {
		System.out.println(">>  User enters text in serach box ");

		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("samsung mobile");
	   }

	@When("user clecks on search button")
	public void user_clecks_on_search_button() {
		System.out.println(">> user clecks on search button");

		driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
	   }

	@Then("user is navigated to related search results.")
	public void user_is_navigated_to_related_search_results() {
		System.out.println(">> user is navigated to related search results.");

		
		driver.navigate().to("https://www.amazon.in/s?k=samsung+mobile&crid=PVJUSLYP214&sprefix=samsung%2Caps%2C2949&ref=nb_sb_noss_1");
	   }


}
