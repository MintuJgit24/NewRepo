package browserInitialisationPack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public WebDriver driver;

	public void fileUpload() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();

		WebElement choose = driver.findElement(By.id("file-upload"));
		choose.sendKeys("C:\\Users\\mintu\\OneDrive\\Desktop\\SampleExcel.xlsx");

		WebElement upload = driver.findElement(By.id("file-submit"));
		upload.click();
	}

	public void fileUploadGlobal() throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();

		WebElement word = driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		word.click();

		// ROBOT CLASS-will work everywhere, using instead of sendKeys
		StringSelection selection = new StringSelection(
				"C:\\Users\\mintu\\OneDrive\\Desktop\\Jenkins.pdf");
		// to copy give below code
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);// copy to clipboard
		// to paste
		Robot robot = new Robot();
		robot.delay(1500);
		robot.keyPress(KeyEvent.VK_CONTROL);// vk=virtual keys
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		FileUpload objFile = new FileUpload();
		// objFile.fileUpload();
		objFile.fileUploadGlobal();
	}

}
