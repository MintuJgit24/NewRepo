package browserInitialisationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputMessage extends Base{

	public void navigate() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement msgField=driver.findElement(By.id("single-input-field"));
		msgField.sendKeys("hi mintu");
		
		WebElement showMsgField=driver.findElement(By.id("button-one"));
		showMsgField.click();
		
		WebElement valueAField=driver.findElement(By.id("value-a"));
		valueAField.sendKeys("5");
		
		WebElement valueBField=driver.findElement(By.id("value-b"));
		valueBField.sendKeys("10");
		
		WebElement getTotalField=driver.findElement(By.id("button-two"));
		getTotalField.click();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputMessage inputobj=new InputMessage();
		inputobj.intilialiseBrowser();
		inputobj.navigate();
		//nputobj.closeAndQuit();

	}

}
