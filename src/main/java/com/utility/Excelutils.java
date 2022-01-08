package com.utility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class Excelutils {
	
static FileInputStream fis=null;
static Workbook wb=null;
static Sheet sh=null;
static WebDriver driver=null;


public static String getDataFromCell(String filepath,String sheetname,int row ,int col) {
	DataFormatter df=new DataFormatter();
	
	try {
		fis=new FileInputStream(filepath);
		wb=WorkbookFactory.create(fis);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	sh=wb.getSheet(sheetname);
	Cell c=sh.getRow(row).getCell(col);
	return df.formatCellValue(c);
	
}
public static int countRowFromExcel(String filepath,String sheetname) {
	
	try {
		fis=new FileInputStream(filepath);
		wb=WorkbookFactory.create(fis);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	sh=wb.getSheet(sheetname);
	int rows=sh.getLastRowNum();
	
	return rows ;
	
}
public static int countColfromExcel(String filepath,String sheetname,int row) {
	try {
		fis=new FileInputStream(filepath);
		wb=WorkbookFactory.create(fis);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	sh=wb.getSheet(sheetname);
	int cols=sh.getRow(row).getLastCellNum();
	return cols;
	
}

}
