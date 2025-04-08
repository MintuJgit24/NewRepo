package browserInitialisationPack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public WebDriver driver;
	
	public void multipleWindow() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://webdriveruniversity.com/");
		driver.manage().window().maximize();

		WebElement field1 = driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		field1.click();

		WebElement field2 = driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		field2.click();

		// to handle parent window
		String parentWindow = driver.getWindowHandle();
		System.out.println("parent window: " + parentWindow);

		// childwindow
		// windows id is printed
		Set<String> childWindow = driver.getWindowHandles();// handle all windows
		System.out.println("child windows: " + childWindow);
		String title = "";

		for (String temp : childWindow) {
			if (!temp.equals(parentWindow)) {
				System.out.println("------------------");
				System.out.println(temp);
				driver.switchTo().window(temp);
				// System.out.println(driver.getTitle());
				title = driver.getTitle();
			}

			if (title.equals("WebDriver | Login Portal")) {
				WebElement login = driver.findElement(By.xpath("//input[@id='text']"));
				login.sendKeys("Admin");
				WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
				password.sendKeys("123");
			}

			if (title.equals("WebDriver | Contact Us")) {
				WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
				firstname.sendKeys("neena");
				WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
				lastname.sendKeys("davis");
				WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
				email.sendKeys("neena@gmail.com");
				WebElement comments = driver.findElement(By.xpath("//textarea[@name='message']"));
				comments.sendKeys("hello page");
			}
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleWindowHandling objWindow=new MultipleWindowHandling();
		objWindow.multipleWindow();
	}

}
