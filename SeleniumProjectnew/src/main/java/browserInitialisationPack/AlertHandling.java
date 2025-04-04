package browserInitialisationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{

	// JS alert box
	public void handleAlerts() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickField1=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		clickField1.click();
		driver.switchTo().alert().accept();//to click ok of alert msg
		System.out.println(clickField1.isDisplayed());//to check if alert is displayed or not
	}
	
	//JS confirm box
	public void handleSecondAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickField2=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		clickField2.click();
		driver.switchTo().alert().dismiss();//to click cancel of alert msg
	}
	
	//JS prompt box
	public void handleThirdAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickField3=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		clickField3.click();
		driver.switchTo().alert().sendKeys("mintu");//to pass any comments
		driver.switchTo().alert().accept();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling objAlert=new AlertHandling();
		objAlert.intilialiseBrowser();
		objAlert.handleAlerts();
		//objAlert.handleSecondAlert();
		//objAlert.handleThirdAlert();
	}

}
