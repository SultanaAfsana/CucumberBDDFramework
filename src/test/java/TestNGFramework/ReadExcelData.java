package TestNGFramework;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelData {
	static String filePath = "/Applications/CucumberBDD_Framework/TestData/TestData.xlsx";

	@Test
	public static void getReadData() throws IOException {
		// FileInputStream (it's a java class) to identify the location of the file
		// FileOutputStream (it's a java class) to write the data

		FileInputStream data = new FileInputStream(filePath);
//I have to use XSSFWorkbook class from ApachePOI to create the object and pass the parameter
//FileInputStream object

		XSSFWorkbook workbook = new XSSFWorkbook(data);
//I have to use XSSFSheet object = WorkBook object to call the getSheet method
//and passing the sheet name inside the parameter - it takes control of all the sheet data

		XSSFSheet sheet = workbook.getSheet("testData"); // <-- sheet name according to my excel file

//Iterator (coming from java util) - to go throw all the excel sheet
//<Row> (coming from Apache POI) 

//I go through the iterator creating object to go through all the sheet value and 
//ignore the header using next method
		Iterator<Row> rowIterator = sheet.iterator();
		rowIterator.next();
//Now I have to create a list of object to take control of all the data

		ArrayList<String> list = new ArrayList<String>();

//Now I have to use any loop, but better to use while loop and passing the condition
//iterator object to call the HasNext method and I can take control of all the sheet data value

		while (rowIterator.hasNext()) {

//Finally, help with the Array-list object, all the add method 	and using getCell value
//I read the data from excel
			list.add(rowIterator.next().getCell(1).getStringCellValue());
			System.out.println(list);
		}
	}

}
