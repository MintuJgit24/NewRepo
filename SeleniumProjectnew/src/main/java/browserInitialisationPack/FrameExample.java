package browserInitialisationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public WebDriver driver;
	
	public void framesExample() {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		//FRAME
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		//frame.click();//this will also work
		driver.switchTo().frame(frame);
		//after switiching to that frame only give below code and click
		WebElement field1=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		field1.click();//this alone wont work, so after giving frame xpath and switchTo().frame give this click
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrameExample objFrame=new FrameExample();
		objFrame.framesExample();
	}

}
