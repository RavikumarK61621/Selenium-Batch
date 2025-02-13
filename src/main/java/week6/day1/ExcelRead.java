package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead { //Read the excel file and get the data and print it in console

	public static void main(String[] args) throws IOException {
		

		//step 1 set path of the workbook
		  XSSFWorkbook wb=new XSSFWorkbook("./excelSheet/2020 car prices.xlsx");

		  //step 2 - get sheet value
		  //index - will start from '0'
		  XSSFSheet sheetValue = wb.getSheetAt(0);
		  
		  //step 3 count row value and read value from the row
		  int rowcount = sheetValue.getLastRowNum();
		  System.out.println("Row count :"+rowcount);
		  
		  //count all the row count include header
		  int physicalNumberOfRows = sheetValue.getPhysicalNumberOfRows();
		  System.out.println("Include header value :"+physicalNumberOfRows);
		  
		  //step 4 count cell value
		  short cellcount = sheetValue.getRow(1).getLastCellNum();
		  System.out.println("Cell count :"+cellcount);
		  
		  
		  //read the value
		  String stringCellValue = sheetValue.getRow(1).getCell(1).getStringCellValue();
		  System.out.println(stringCellValue);
		  
		  
		  //step 5 print all the value from excel sheet
		  //row value start from 1
		  for (int i = 1; i <=rowcount; i++) {
		   
		   //cell value start from 0
		   for (int j = 0; j < cellcount; j++) {
		    String stringCellValue2 = sheetValue.getRow(i).getCell(j).getStringCellValue();
		    System.out.println(stringCellValue2);
		   }
		  }
		  
		  
		  //step 6
		  wb.close();

		
		
	}

}
