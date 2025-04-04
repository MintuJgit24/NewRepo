package browserInitialisationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends Base{

	public void dragDrop() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement field=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement field2=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		
		//Actions inbuilt class to do an action
		Actions action=new Actions(driver);
		//to mouse hover and drag and drop to the box
		action.moveToElement(field).click();
		action.doubleClick(field).perform(); //used when double click is required to automate
		
		action.moveToElement(field2).click();
		action.doubleClick(field2).perform();
		
		WebElement box=driver.findElement(By.id("mydropzone"));
		action.dragAndDrop(field, box).build().perform();
		action.dragAndDrop(field2, box).build().perform();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DragAndDrop dragObj=new DragAndDrop();
		dragObj.intilialiseBrowser();
		dragObj.dragDrop();

	}
}
