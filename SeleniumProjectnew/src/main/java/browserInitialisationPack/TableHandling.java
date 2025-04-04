package browserInitialisationPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {

	//to get full table
	public void fullTablereading() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tableField=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println("table: "+ tableField.getText() );//to get text contents
	}
	
	//to get single row
	public void selectParticularRow() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row1Field=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]"));
		System.out.println("****************************************************");
		System.out.println("first row: "+row1Field.getText());
	}
	
	//to get a data from table
	public void singleTableData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		//2nd row 3rd column
		WebElement dataField=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]/td[3]"));
		System.out.println("second row 3rd data is : "+dataField.getText());
	}
	
	//to get first column datas
	public void columnData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List <WebElement> coloumnField=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement element:coloumnField) {
			System.out.println("column data is: "+element.getText());
		}
		
	}
	
	//to check if data present or not
	public void checkDataFromTable() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String data="Garrett Winters";
		List<WebElement> checkColData=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement element:checkColData	 ) {
			if(element.getText().equals(data)) {
				System.out.println("column data is: "+element.getText());
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling objTable=new TableHandling();
		objTable.intilialiseBrowser();
		//objTable.fullTablereading();
		//objTable.selectParticularRow();
		//objTable.singleTableData();
		//objTable.columnData();
		objTable.checkDataFromTable();
		
	}

}
