package bdd.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import bdd.baseclass.BaseClass;

public class ReadExelFile extends BaseClass {
	@DataProvider(name = "pincode_data")
	public String[][] pincodeData() throws IOException {
		// code to read excel file using Apache POI

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/resources/Excel TestData/Pincodes.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("pincodes");
		String pincodedata[][] = new String[sheet.getLastRowNum() - 1][1];

		for (int i = 1; i < sheet.getLastRowNum(); i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell = row.getCell(0);
			int pincode = (int) cell.getNumericCellValue();

			// insert pin codes into String array

			pincodedata[i - 1][0] = pincode + "";

		}

		return pincodedata;

	}

}
