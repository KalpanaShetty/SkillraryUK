package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelTest {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis= new FileInputStream("./commonData/Book1.xlsx");
		//step1:- open workbook in read mode
		Workbook wb = WorkbookFactory.create(fis);
		//step2:- get the control of the sheet
		Sheet sh = wb.getSheet("Sheet1");
		//step3:- get the control of the row
		Row row = sh.getRow(1);
		//step4:-get control of cell and copy data
		Cell cel = row.getCell(1);
		String value = cel.getStringCellValue();
		System.out.println(value);
		//step5:-close the workbook
		wb.getClass();
		

	}

}
