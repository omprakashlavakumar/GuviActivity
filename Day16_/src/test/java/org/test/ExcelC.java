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

public class ExcelC {
	// Writing the Value in the existing Sheet and in the existing cell
	public static void main(String[] args) throws Exception {
		// 1. Create File Path of the Excel
		File f = new File ("C:\\Users\\Om Prakash\\eclipse-workspace\\Day16_\\Excel\\TestData.xlsx");
				
		// 2. Getting into the File
		FileInputStream fin = new FileInputStream (f);
				
		// 3. Getting into the Workbook
		Workbook w = new XSSFWorkbook(fin);
				
		// 4. Getting into the sheet
		Sheet s = w.getSheet("Sheet1");
				
		// 5. Getting into the Row
		Row r = s.getRow(0);
		
		// 6. Getting the Cell 
		Cell c = r.getCell(0);
				
		// 6. Create Cell
		// Cell c = r.createCell(2);
		
		// 7. Set the cell value
		//c.setCellValue("Testing");
		
		if (c.getStringCellValue().equals("One")) {
			c.setCellValue("TEN");
		}
		
		// 8. Writing in the File
		FileOutputStream fout = new FileOutputStream(f);
		
		// 9. Execute the writing
		w.write(fout);
		
		System.out.println("Writing in Excel is Done");
	}

}
