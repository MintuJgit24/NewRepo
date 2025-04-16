package automationPackage;


import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Base {
  
  public WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
	  driver.get("https://groceryapp.uniqassosiates.com/admin/login");
	  driver.manage().window().maximize();
	  // https://groceryapp.uniqassosiates.com/admin/login
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.close();
	  //driver.quit();
  }

}
