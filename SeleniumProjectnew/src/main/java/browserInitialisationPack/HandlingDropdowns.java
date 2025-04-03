package browserInitialisationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns extends Base {

	public void dropDown() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		//to select a color from dropdowns
		WebElement fieldColor=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		//select is a class
		Select select=new Select(fieldColor);
		//to select by index
		//select.selectByIndex(2);
		//to select by value
		//select.selectByValue("Green");
		//to select by visible text
		select.selectByVisibleText("Yellow");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropdowns obj=new HandlingDropdowns();
		obj.intilialiseBrowser();
		obj.dropDown();

	}

}
