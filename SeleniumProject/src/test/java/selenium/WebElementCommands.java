package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElementCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		
		//to locate the message text box of this url page
		//By is a class
		//we used id tech to locate 
		WebElement messageTextBox=driver.findElement(By.id("single-input-field"));
		//to confirm we have located just typing some message, to interact with that web element
		messageTextBox.sendKeys("Hi");
		
		WebElement enterValueA=driver.findElement(By.id("value-a"));
		enterValueA.sendKeys("10");
		
		WebElement enterValueB=driver.findElement(By.id("value-b"));
		enterValueB.sendKeys("20");
		
		WebElement getTotal=driver.findElement(By.id("button-two"));
		getTotal.click();

	}
}
