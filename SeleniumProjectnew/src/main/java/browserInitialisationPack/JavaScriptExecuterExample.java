package browserInitialisationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterExample {

	public WebDriver driver;
	
	public void javaScript() {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//interface
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");//to scroll down the page
		js.executeScript("window.scrollBy(0,-500)", "");//to scroll up
		
		WebElement searchField=driver.findElement(By.xpath("//div[@class='nav-search-field ']"));//search 
		js.executeScript("arguments[0].click();",searchField);// argument considered as first element
		searchField.click();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaScriptExecuterExample objJava=new JavaScriptExecuterExample();
		objJava.javaScript();
	}

}
