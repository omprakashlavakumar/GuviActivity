package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelB {
	// Creating New Sheet and Writing the Value
	public static void main(String[] args) throws Exception {
		// 1. Create File Path of the Excel
		File f = new File ("C:\\Users\\Om Prakash\\eclipse-workspace\\Day16_\\Excel\\TestData.xlsx");
				
		// 2. Getting into the File
		FileInputStream fin = new FileInputStream (f);
				
		// 3. Getting into the Workbook
		Workbook w = new XSSFWorkbook(fin);
		
		// 4. Create Sheet
		Sheet createSheet = w.createSheet("Test");
		
		// 5. Create Row
		Row row = createSheet.createRow(1);
		
		// 6. Create Cell
		Cell cell = row.createCell(1);
		
		// 7. Set the cell value
		cell.setCellValue("Testing");
		
		// 8. Writing in the File
		FileOutputStream fout = new FileOutputStream(f);
		
		// 9. Execute the writing
		w.write(fout);
		
		System.out.println("Writing in Excel is Done");
	}

}
