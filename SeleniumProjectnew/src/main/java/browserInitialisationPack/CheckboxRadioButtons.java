package browserInitialisationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxRadioButtons extends Base {

	public void checkBox() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkBox1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		checkBox1.click();
		System.out.println(checkBox1.isSelected());//to check if checkbox is selected or not
	}
	
	public void radioButtons() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radioButton1=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		radioButton1.click();
		WebElement showSelectfield=driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectfield.click();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckboxRadioButtons obj=new CheckboxRadioButtons();
		obj.intilialiseBrowser();
		obj.checkBox();
		//obj.radioButtons();

	}

}
