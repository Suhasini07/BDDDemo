package bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bdd.baseclass.BaseClass;

public class IndexPage extends BaseClass {
	
	@FindBy(css="span#nav-link-accountList-nav-line-1")
	WebElement signInBtn;
	
	@FindBy(css="a#nav-logo-sprites")
	WebElement amazonLogo;
	
	@FindBy(css="input#twotabsearchtextbox")
	WebElement searchBox;
	
	@FindBy(css="input#nav-search-submit-button")
	WebElement searchBtn;
	
	public IndexPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage clickOnSignIn()
	{
		signInBtn.click();
		return new LoginPage();
	}
	
	public boolean validateLogo()
	{
		return amazonLogo.isDisplayed();
	}
	
	public String getAmazonTitle()
	{
		//System.out.println("Title of this page is :   "+   driver.getTitle());
		
		return driver.getTitle();
	}
	
	public SearchResultPage searchProduct(String product)
	{
		searchBox.sendKeys(product);
		searchBtn.click();
		
		return new SearchResultPage();
	}
	
	

}
