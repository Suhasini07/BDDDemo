/**
 * This will create new user user on Amazon if user is not already registered.
 */
package bdd.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
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
public class AccountCreationPageTest extends BaseClass {

	AccountCreationPage accountCreationPage = new AccountCreationPage();
	IndexPage indexPage;
	LoginPage loginPage = new LoginPage() ;
	Logger LOG = Logger.getLogger(AccountCreationPageTest.class);

	@Test
	public void verifyCreateAccountPageTest() {
		LOG.info("Running verifying Account creation page test ");
		indexPage = new IndexPage();
		loginPage = indexPage.clickOnSignIn();
		accountCreationPage = loginPage.clickOnAccountCreateLink();
		boolean formTitle = accountCreationPage.valiteFormTitle();
		Assert.assertTrue(formTitle);
		LOG.info("End of VerifyingCreateAccountTest");

	}

}
