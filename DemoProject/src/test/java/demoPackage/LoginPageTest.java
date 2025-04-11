package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class LoginPageTest extends Base{
	
	
  @Test
  public void verifyEnterUsernamePassword() {
	  WebElement userName=driver.findElement(By.xpath("//input[@id='loginform-username']"));
	  userName.sendKeys("carol");
	  
	  WebElement password=driver.findElement(By.xpath("//input[@id='loginform-password']"));
	  password.sendKeys("1q2w3e4r");
	  
	  WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
	  login.click();
  }
  
}
