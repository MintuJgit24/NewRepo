package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserLaunch {

	
	public static void main(String[] args) {
		
		// to set property for those projects having selenium version below 4 dependencies
		//System.setProperty("webdriver.edge.driver","C://Users//mintu//Downloads//edgedriver_win64//msedgedriver.exe");
		WebDriver driver=new EdgeDriver();

	}
}
