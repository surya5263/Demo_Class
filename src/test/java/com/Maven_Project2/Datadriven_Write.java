package com.Maven_Project2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Write {

	public static void write_Data() throws Exception {

		File f = new File("C:\\Users\\surya\\Desktop\\Selenium_Testing\\Maven_Project2\\SHEET 1.xlsx");

		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet Sheet = w.createSheet("data");

		Row Row = Sheet.createRow(0);

		Cell Cell = Row.createCell(0);
		Cell.setCellValue("10");

		w.getSheet("data").getRow(0).createCell(1).setCellValue("20");

		w.getSheet("data").getRow(0).createCell(2).setCellValue("30");

		w.getSheet("data").createRow(1).createCell(0).setCellValue("100");

		w.getSheet("data").getRow(1).createCell(1).setCellValue("200");

		w.getSheet("data").getRow(1).createCell(2).setCellValue("300");

		w.getSheet("data").createRow(2).createCell(0).setCellValue("1000");

		w.getSheet("data").getRow(2).createCell(1).setCellValue("2000");

		w.getSheet("data").getRow(2).createCell(2).setCellValue("3000");

		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);
		w.close();

	}

	public static void main(String[] args) throws Exception {

		write_Data();
	}

}
