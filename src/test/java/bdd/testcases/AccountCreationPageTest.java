/**
 * This will create new user user on Amazon if user is not already registered.
 */
package bdd.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import bdd.baseclass.BaseClass;
import bdd.pages.AccountCreationPage;
import bdd.pages.IndexPage;
import bdd.pages.LoginPage;
import listeners.AmazonListener;

/**
 * @author Suhasini Shinde.
 */
@Listeners(AmazonListener.class)
public class AccountCreationPageTest  extends BaseClass{
	
	AccountCreationPage accountCreationPage;
	IndexPage indexPage;
	LoginPage loginPage;
	
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
public void verifyCreateAccountPageTest() {
		
		indexPage=new IndexPage();
		loginPage=indexPage.clickOnSignIn();
		accountCreationPage=loginPage.clickOnAccountCreateLink();
		boolean formTitle=accountCreationPage.valiteFormTitle();
		Assert.assertTrue(formTitle);
		

}
	
	

}
