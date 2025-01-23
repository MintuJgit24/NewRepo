package excelPack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ParentClass {
	
	//these are inbuilt classes
	static FileInputStream f; //to take the input file 
	static XSSFWorkbook wb;   //to take workbook details of the file
	static XSSFSheet sh;      //to take the sheet of excel
	
	public static String getStringData(int a, int b) throws IOException {
		//a to take row value
		//b to take cell value
		f=new FileInputStream("C:\\Users\\mintu\\OneDrive\\Documents\\ExcelStudents.xlsx");
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");  //to take value from sheet getSheet() method used
		XSSFRow r=sh.getRow(a);    //XSSFRow class imported; getRow() method to take value from row
		XSSFCell c=r.getCell(b);   //XSSFCell class imported; getCell() method to take value from cell

		return c.getStringCellValue();
	
	}
	
	public static String getIntegerData(int a, int b) throws IOException{
		f=new FileInputStream("C:\\Users\\mintu\\OneDrive\\Documents\\ExcelStudents.xlsx");
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");
		XSSFRow r=sh.getRow(a);
		XSSFCell c=r.getCell(b);

		//c is integer
		//need type conversion
		int x=(int)c.getNumericCellValue();
		return String.valueOf(x);
				
	}
}
