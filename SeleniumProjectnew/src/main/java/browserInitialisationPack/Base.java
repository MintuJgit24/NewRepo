package browserInitialisationPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base=new Base();
		base.intilialiseBrowser();
		base.closeAndQuit();
	}
	
	public void intilialiseBrowser() {
		driver=new ChromeDriver();
		//abstract method get
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();//to maximise
		
	}
	
	public void closeAndQuit() {
		driver.close();//close last opened site
		//driver.quit();close all sites opened
	}
}
