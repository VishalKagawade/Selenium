package excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String[] args) throws IOException { // IOException is parent of FileNotFoundException so it will be replaced after adding IOE
		
		// get path of excel  
		File path = new File ("C:\\Users\\visha\\Desktop\\Mannual\\Test case formate.xlsx");
		
		//load excel file
		FileInputStream load = new FileInputStream(path);
		
		//workbook of excel
		XSSFWorkbook workbook= new XSSFWorkbook(load);
		
		//get sheet from workbook
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		// read cell
		String data = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		
		// close the excel sheet before running if it is already open
		
	}

}
