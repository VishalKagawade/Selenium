package excelreadwrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWriteUtility {
	
	public void excelWrite(int sheetno, int RowValue, int CellValue, String data) throws IOException {
		
		//load excel 
		FileInputStream load = new FileInputStream("C:\\Users\\visha\\Desktop\\TEST_CASES\\ExcelReadWritePracticeFile.xlsx");
		
		//get workbook
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		
		//get sheet
		XSSFSheet sheet = workbook.getSheetAt(sheetno);
		
		// perform output action on output stream
		FileOutputStream writeout =new FileOutputStream("C:\\Users\\visha\\Desktop\\TEST_CASES\\ExcelReadWritePracticeFile.xlsx");
		sheet.createRow(RowValue).createCell(CellValue).setCellValue(data);
		workbook.write(writeout);
	}
	
	
	public void excelRead(int sheetno, int RowValue, int CellValue) throws IOException {
		
		//load excel
		FileInputStream load = new FileInputStream("C:\\Users\\visha\\Desktop\\TEST_CASES\\ExcelReadWritePracticeFile.xlsx");
		
		//load workbook
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		
		//get sheet
		XSSFSheet sheet1 = workbook.getSheetAt(sheetno);
		
		//read
		
		String readvalue = sheet1.getRow(RowValue).getCell(CellValue).getStringCellValue();
		System.out.println(readvalue);
		
	}
	
	public static void main(String[] args) throws IOException {
		ExcelReadWriteUtility ob =new ExcelReadWriteUtility();
		ob.excelWrite(0,4,4,"Practice");
		ob.excelRead(0,3,3);
	}
	
	

}
