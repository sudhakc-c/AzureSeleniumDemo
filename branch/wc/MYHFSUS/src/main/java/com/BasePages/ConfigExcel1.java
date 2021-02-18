package com.BasePages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ConfigExcel1 {

	public WebDriver driver;
	  
	//Specify the Path of excel sheet here	
	public String Path = "C:\\Users\\CSWARNES\\Desktop\\MYHFSUS\\Excel\\My Hire Data.xlsx";

	//To retrieve data from excel
	public String getRowAndColumn(int sheetnum, int row, int column) throws Exception {

		File src = new File(Path);
		FileInputStream fis = new FileInputStream(src);
		// fout=new FileOutputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(sheetnum);

		String getRowAndColumn = sheet.getRow(row).getCell(column).getStringCellValue();
		fis.close();

		return getRowAndColumn;
	}

	//To write data into the sheet
	public void writeData(int sheetnum, int row, int column, String Value) throws Exception {

		File src = new File(Path);
		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(sheetnum);

		sheet = wb.getSheetAt(sheetnum);

		sheet.getRow(row).createCell(column).setCellValue(Value);

		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		wb.close();
	}
	
    //To load data via list
	public void writeDataIntoSh(int sheetnum, List row) throws IOException {
		File src = new File(Path);
		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(sheetnum);

		sheet = wb.getSheetAt(sheetnum);
		int rowCount = sheet.getLastRowNum() + 1;
		for (int i = 0; i <= row.size(); i++) {
			if (i == 0) {
				sheet.createRow(rowCount).createCell(i).setCellValue(rowCount);
			} else {
				sheet.getRow(rowCount).createCell(i).setCellValue(row.get(i - 1).toString());
			}
		}
		System.out.println("Overall" + "" + row.size() + "data loaded successfully");

		FileOutputStream fout = new FileOutputStream(src);

		wb.write(fout);
		wb.close();
	}

}
