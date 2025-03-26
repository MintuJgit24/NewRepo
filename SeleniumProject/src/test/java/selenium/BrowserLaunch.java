package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserLaunch {

	
	public static void main(String[] args) {
		
		// to set property for those projects having selenium version below 4 dependencies
		
		//System.setProperty("webdriver.edge.driver","C://Users//mintu//Downloads//edgedriver_win64//msedgedriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new EdgeDriver();
		
		//BROWSER COMMANDS
		driver.get("https://www.obsqurazone.com/");//to load a url
		driver.manage().window().maximize();//to manage the window to maximize 
		//driver.manage().window().minimize();//to manage the window to minimize
		String title=driver.getTitle();//driver.getTitle() is returning string value, so assign to a string variable; to get title of the url page
		System.out.println(title);
		
		String url=driver.getCurrentUrl();//to get url of page
		System.out.println(url);
		
		
		
		//String sourceCode=driver.getPageSource();//to get the sourcecode of the url page
		//System.out.println(sourceCode);
		
		//to close the opened url pages give below command
		//driver.quit();to close multiple windows opened during execution
		//driver.close();to close single window opened during execution
		driver.close();
	}
}
