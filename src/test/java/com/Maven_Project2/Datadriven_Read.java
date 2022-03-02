package com.Maven_Project2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Read {

	public static void Read_Particular_Data() throws IOException {
System.out.println("Read_Particular_Data");
		File f = new File("C:\\Users\\surya\\Desktop\\Selenium_Testing\\Maven_Project2\\SHEET 1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet sheeta = w.getSheetAt(0);

		Row row = sheeta.getRow(2);

		Cell cell = row.getCell(1);

		CellType celltype = cell.getCellType();

		if (celltype.equals(celltype.STRING)) {
			String Value = cell.getStringCellValue();
			System.out.println(Value);
		}

		else if (celltype.equals(celltype.NUMERIC)) {
			double Value1 = cell.getNumericCellValue();
			int n = (int) Value1;
			System.out.println(Value1);
		}

	}

	public static void read_All_Data() throws Throwable {
System.out.println("read_All_Data");
		File f = new File("C:\\Users\\surya\\Desktop\\Selenium_Testing\\Maven_Project2\\SHEET 1.xlsx");

		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);

		int noOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < noOfRows; i++) {
			Row row = sheetAt.getRow(i);

			int noOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < noOfCells; j++) {
				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				} else if (cellType.equals(cellType.NUMERIC)) {
					double Value1 = cell.getNumericCellValue();
					int n = (int) Value1;
					System.out.println(Value1);
				}

			}
		}
	}

// read particular row data 
	public static  void read_particular_row_data() throws Throwable {
System.out.println("read particular row data ");
		File f = new File("C:\\Users\\surya\\Desktop\\Selenium_Testing\\Maven_Project2\\SHEET 1.xlsx");

		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);

		int noOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < noOfRows; i++) {
			Row row = sheetAt.getRow(i);
			Cell cell = row.getCell(0);

			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				String value = cell.getStringCellValue();
				System.out.println(value);
			} else if (cellType.equals(cellType.NUMERIC)) {
				double Value1 = cell.getNumericCellValue();
				int n = (int) Value1;
				System.out.println(Value1);
			}
		}
	}

	public static  void read_particular_column_data() throws Exception {
		System.out.println("read_particular_column_data");
		
		File f = new File("C:\\Users\\surya\\Desktop\\Selenium_Testing\\Maven_Project2\\SHEET 1.xlsx");

		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(1);

		int noOfCells = row.getPhysicalNumberOfCells();
		for (int j = 0; j < noOfCells; j++) {
			Cell cell = row.getCell(j);
			

			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
				
			 else if (cellType.equals(cellType.NUMERIC)) {
				double Value1 = cell.getNumericCellValue();
				int n = (int) Value1;
				System.out.println(Value1);
			}

		}
	}

	public static void main(String[] args) throws Throwable {
		Read_Particular_Data();
		read_All_Data();
		read_particular_row_data();
		read_particular_column_data();
	}
}
