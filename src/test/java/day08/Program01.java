package day08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// Read data from excel sheet

public class Program01 {

	public static void main(String[] args) {
		
		try {
			File src = new File(".\\src\\test\\resources\\Datasheet 28feb2023.xls"); //Reading the file location
			FileInputStream ip = new FileInputStream(src); // Converting into streamed data
			// surround with try catch exception
			XSSFWorkbook wb = new XSSFWorkbook(ip); // It is a library to concert into booklet format and pass streamed data
			XSSFSheet sh = wb.getSheetAt(0); // Converting workbook into sheet format
			DataFormatter format = new DataFormatter(); // The same format which we stored in excel that same format we get here 
			
			//To print row data 
			
			System.out.println(format.formatCellValue(sh.getRow(0).getCell(0))); 
			System.out.println(format.formatCellValue(sh.getRow(1).getCell(0)));
			System.out.println(format.formatCellValue(sh.getRow(2).getCell(0)));
			System.out.println(format.formatCellValue(sh.getRow(3).getCell(0)));
			
			// To print coloumn= cell data
			
			System.out.println(format.formatCellValue(sh.getRow(0).getCell(1))); 
			System.out.println(format.formatCellValue(sh.getRow(0).getCell(2)));
			System.out.println(format.formatCellValue(sh.getRow(0).getCell(3)));
			System.out.println(format.formatCellValue(sh.getRow(0).getCell(4)));
			
			// To print how much data presented in row wise on cell 
			// Starts index from 0
			System.out.println(sh.getLastRowNum());
			
			// To print on particular row how many cells i.e., coloumns are present
			// Starts index from 1
			System.out.println(sh.getRow(0).getLastCellNum());			
			
		} catch (Exception e) {	
			e.printStackTrace();
		}
}
}
