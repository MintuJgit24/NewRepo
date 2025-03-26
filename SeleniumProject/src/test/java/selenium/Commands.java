package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new EdgeDriver();//browser launch
		driver.get("https://www.google.com/");
		//driver.navigate().to("https://www.google.com/");//this command here will also hav a refresh effect
		//F5 of keyboard hav refresh function
		driver.manage().window().maximize();
		
		String title=driver.getTitle();		
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//navigation commands
		driver.navigate().to("https://www.amazon.in/");//most used
		//to navigate to a url
		
		//or
		//String url2="https://www.amazon.in/";
		//driver.navigate().to(url2);
		
		String title2=driver.getTitle();		
		System.out.println(title2);
		
		driver.navigate().back();//to navigate back page
		driver.navigate().refresh();//to refresh page
		driver.navigate().forward();//to navigate to next page
		

	}

}
