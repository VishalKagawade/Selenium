package excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	
	public static void main(String[] args) throws IOException {
		
		//get excel path
		
		File path= new File("C:\\Users\\visha\\Desktop\\TEST_CASES\\Copy of Test case on the cart(1).xlsx");
		
		//load excel
		FileInputStream load = new FileInputStream(path);
		
		//load workbook 
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		
		//get sheet from workbbok
		XSSFSheet sheet3= workbook.getSheetAt(2);
		
		//perform output action on out stream
		FileOutputStream writeout = new FileOutputStream(path);
		sheet3.createRow(3).createCell(3).setCellValue("velocity");
		workbook.write(writeout);
		
		
		
		
	}

}
