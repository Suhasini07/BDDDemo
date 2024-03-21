package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	public static WebDriver driver=null;
	
	@Given("Browser is launched")
public void browser_is_launched()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
    }

@And("user is on login page")
public void user_is_on_login_page()
{
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	
   }

@When("user enter valid username and invalid password")
public void user_enter_valid_username_and_invalid_password()
{
	driver.findElement(By.cssSelector("input#ap_email")).sendKeys("suhasinishinde49@gmail.com");
	driver.findElement(By.cssSelector("input.a-button-input")).click();
	driver.findElement(By.cssSelector("input#ap_password")).sendKeys("hfghghfg");
    }

//@When("user enter valid username and valid password")
//public void user_enter_valid_username_and_valid_password() {
//	driver.findElement(By.cssSelector("input#ap_email")).sendKeys("suhasinishinde49@gmail.com");
//	driver.findElement(By.cssSelector("input.a-button-input")).click();
//driver.findElement(By.cssSelector("input#ap_password")).sendKeys("Hanuman@30");
//
//	
//    }


@And("user clicks on login button")
public void user_clicks_on_login_button() {
	driver.findElement(By.cssSelector("input#signInSubmit")).click();
    }


@Then("user logged in successfully")
public void user_logged_in_successfully()


{
	String msg=driver.findElement(By.cssSelector("span.a-list-item")).getText();
	
	System.out.println(msg);
	
   }

@Then("user gets logged out")
public void user_gets_logged_out() {
	
	driver.close();
  }


	
	

}
