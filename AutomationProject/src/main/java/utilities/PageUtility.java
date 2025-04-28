package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	public void dragAndDrop(WebElement element) {
		Actions action=new Actions(driver);
		action.dragAndDrop(element, element).build().perform();
	}
	
	public void scrollPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");//to scroll down the page
		js.executeScript("window.scrollBy(0,-500)", "");//to scroll up
	}
	
	public void searchElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);// argument considered as first element
		element.click();
	}

}
