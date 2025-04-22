package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewsPage {

	public WebDriver driver;
	
	public AddNewsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='Manage News']")private WebElement manageNews;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement newBtn;
	@FindBy(xpath="//textarea[@id='news']")private WebElement enterNews;
	@FindBy(xpath="//button[text()='Save']")private WebElement saveBtn;
	
	
	public void clickManageNews() {
		manageNews.click();
	}
	
	public void clickNewBtn() {
		newBtn.click();
	}
	
	public void enterNews() {
		enterNews.sendKeys("Admission started for new Selenium batch");
	}
	
	public void clickSaveBtn() {
		saveBtn.click();
	}
}
