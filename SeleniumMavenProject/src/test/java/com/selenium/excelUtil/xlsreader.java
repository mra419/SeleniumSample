package com.selenium.excelUtil;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream.GetField;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlsreader {

	public String path;
	public FileInputStream fis = null;
	public FileOutputStream fos = null;

	public XSSFWorkbook workbook = null;
	public XSSFSheet sheet = null;
	public XSSFCell cell = null;
	public XSSFRow row = null;

	public xlsreader(String path) {

		this.path = path;

		try {

			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
			fis.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	
	
	public int getRowCount(String sheetName){
		
		sheet = workbook.getSheet(sheetName);
		
		System.out.println(sheet.getLastRowNum()+1);
		
		return sheet.getLastRowNum()+1;
		
				
	}
	
	
	public int getColcount(String sheetName){
		
		sheet = workbook.getSheet(sheetName);
		
		row = sheet.getRow(0);
		
		System.out.println(row.getLastCellNum());
		
		return row.getLastCellNum();
		
	}
	
	
	@SuppressWarnings("deprecation")
	public String getCellData(String sheetName, int colNum, int rowNum){
		
		
		sheet = workbook.getSheet(sheetName);
		
		row = sheet.getRow(rowNum-1);
		
		cell = row.getCell(colNum);
		
		double celltext = 0;
		if(cell.getCellType()==Cell.CELL_TYPE_STRING)
			return cell.getStringCellValue();
		else if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC || cell.getCellType()== Cell.CELL_TYPE_FORMULA)
			celltext =  cell.getNumericCellValue();
			String str = Double.toString(celltext);
			return str;
		
	
		
		
		
	}
	
	
	public Object[][] getData(String SheetName){
		
		int rows = getRowCount(SheetName); 
		int cols = getColcount(SheetName);
		
		Object [][] data = new Object[rows-1][cols];
		
		for(int rowNum= 2; rowNum<=rows;rowNum++){
			
			for(int colNum = 0;colNum< cols; colNum++){
				
				data[rowNum-2][colNum] = getCellData(SheetName, colNum, rowNum);	
				
				System.out.print(data[rowNum-2][colNum].toString());
				
				
			}
		}
		
		return data;
		
			
	}
	
	
	
}


