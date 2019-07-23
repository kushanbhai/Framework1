package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	HSSFWorkbook wb;

	public ExcelDataProvider() {

		try {
			File src = new File("./TestData/Data.xls");
			FileInputStream fis = new FileInputStream(src);
			wb = new HSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println("Unable to read excel file " + e.getMessage());
		}
	}

	public String getStringData(String sheetname, int rownum, int colnum) {
		return wb.getSheet(sheetname).getRow(rownum).getCell(colnum).getStringCellValue();

	}

	public double getNumericData(String sheetname, int rownum, int colnum) {
		return wb.getSheet(sheetname).getRow(rownum).getCell(colnum).getNumericCellValue();
	}

	public String getStringData(int sheetname, int rownum, int colnum) {
		return wb.getSheetAt(sheetname).getRow(rownum).getCell(colnum).getStringCellValue();

	}
}
