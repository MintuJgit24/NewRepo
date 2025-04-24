package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	//to help pages
	public WebDriver driver;
	
	public void selectByVisibleText(WebElement element, String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void selectByIndex(WebElement element, int integer) {
		Select select=new Select(element);
		select.selectByIndex(integer);
	}
	
	public void selectByContainsVisibleText(WebElement element, String text) {
		Select select=new Select(element);
		select.selectByContainsVisibleText(text);
	}

	//create 5 methods and use it
}
