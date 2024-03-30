/**
 * This file reads data from Excel file
 * 
 */
package utilityTestCases;

import org.apache.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import bdd.utility.ReadExelFile;
import listeners.AmazonListener;

/**
 * @author Suhasini Shinde
 * 
 */
@Listeners(AmazonListener.class)
public class ExcelTest {

	Logger LOG = Logger.getLogger(ExcelTest.class);

	@Test(dataProvider = "pincode_data", dataProviderClass = ReadExelFile.class)

	public void verifyErrorMessageIsAbsentForValidPincodes(String pincode) {
		LOG.info(pincode);
	}

}
