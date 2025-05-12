package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constant.Constant;

public class ExcelUtility {
	
	static FileInputStream f; //to take the input file 
	static XSSFWorkbook wb;   //to take workbook details of the file
	static XSSFSheet sh;      //to take the sheet of excel
	
	public static String getStringData(int a, int b,String sheet) throws IOException {
		//a to take row value
		//b to take cell value
		String excelPath="C:\\Users\\mintu\\git\\NewRepo\\AutomationProject";
		//f=new FileInputStream("C:\\Users\\mintu\\git\\NewRepo\\AutomationProject\\src\\test\\resources\\TestData.xlsx");
		f=new FileInputStream(excelPath+Constant.EXCELPATH);
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet(sheet);  //to take value from sheet getSheet() method used
		XSSFRow r=sh.getRow(a);    //XSSFRow class imported; getRow() method to take value from row
		XSSFCell c=r.getCell(b);   //XSSFCell class imported; getCell() method to take value from cell

		return c.getStringCellValue();
	
	}
	
	public static String getIntegerData(int a, int b,String sheet) throws IOException{
		//f=new FileInputStream("C:\\Users\\mintu\\git\\NewRepo\\AutomationProject\\src\\test\\resources\\TestData.xlsx");
		String excelPath="C:\\Users\\mintu\\git\\NewRepo\\AutomationProject";
		f=new FileInputStream(excelPath+Constant.EXCELPATH);
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet(sheet);
		XSSFRow r=sh.getRow(a);
		XSSFCell c=r.getCell(b);

		//c is integer
		//need type conversion
		int x=(int)c.getNumericCellValue();
		return String.valueOf(x);
				
	}
}
