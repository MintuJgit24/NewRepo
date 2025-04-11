package demoPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;



public class Base {

	public WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.qabible.in/payrollapp/");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
		//driver.quit();
	}
	
}
