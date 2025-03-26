package browserInitialisationPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserInitialisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriver driver=new ChromeDriver();
		
		WebDriver driver=new EdgeDriver();
		
		//no need of installing firefox, webdriver gets it
		//WebDriver driver=new FirefoxDriver();

	}
}
