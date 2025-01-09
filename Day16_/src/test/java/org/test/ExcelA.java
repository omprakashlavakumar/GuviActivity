package org.test;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelA {
	// Reading the Value from the Excel
	public static void main(String[] args) throws Exception {
		
	    // 1. Create File Path of the Excel
		File f = new File ("C:\\Users\\Om Prakash\\git\\repository2\\Day16_\\Excel\\TestData.xlsx");
		
		// 2. Getting into the File
		FileInputStream fin = new FileInputStream (f);
		
		// 3. Getting into the Workbook
		Workbook w = new XSSFWorkbook(fin); // xlsx Excel sheet
		
		// 4. Getting into the sheet
		Sheet s = w.getSheet("Sheet1");
		
		// 5. Getting into the Row
		Row r = s.getRow(0);
		
		// 6. Getting the Cell
		Cell c = r.getCell(0);
		Cell c1 = r.getCell(1);
		System.out.println("The Value From the Excel (0,0) : "+c);
		System.out.println("The Value From the Excel (0,1) : "+c1);
		
		// To get Number of Rows in the Excel
		int rows = s.getPhysicalNumberOfRows();
		System.out.println("No. of Rows - "+rows);
		
		// To get Number of Cells in the Row of that excel
		int cells = r.getPhysicalNumberOfCells();
		System.out.println("No. of Cells - "+cells);
		
		//Nested For Loop
		for (int i = 0; i < rows; i++) {
			Row row = s.getRow(i);
			for (int j = 0; j < cells; j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);	
			}
		}
		
		// Get the CellType
		CellType type = c.getCellType();
		System.out.println(type);
		
		CellType type1 = c1.getCellType();
		System.out.println(type1);
		
		// It will get only the Numeric Value
		double value1 = c1.getNumericCellValue();
		System.out.println(value1);
		
		// It will get only the String Value
		String value = c.getStringCellValue();
		System.out.println(value);
		
		
		
		
		
		
		
		
		
	}

}
