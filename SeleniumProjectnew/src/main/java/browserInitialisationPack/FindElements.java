package browserInitialisationPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements extends Base {
    //to check all checkboxes at a time do this
	//otherwise locate each checkbox and click it
	public void findMultipleElements() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> multipleField=driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for(WebElement element:multipleField) {
			element.click();
			System.out.println("clicked");
		}
		//WebElement selectAll=driver.findElement(By.xpath("//input[@value='Select All']"));
		//selectAll.click();
	}
	
	//assignment
	public void printHi() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> msgField=driver.findElements(By.xpath("//input[@class='form-control']"));
		for(WebElement element:msgField) {
			element.sendKeys("hi");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindElements obj=new FindElements();
		obj.intilialiseBrowser();
		obj.findMultipleElements();
		//obj.printHi();
	}
}
