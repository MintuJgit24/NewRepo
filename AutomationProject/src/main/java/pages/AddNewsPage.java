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
	
	//@FindBy(xpath="//p[text()='Manage News']")private WebElement manageNews;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement newBtn;
	@FindBy(xpath="//textarea[@id='news']")private WebElement enterNews;
	@FindBy(xpath="//button[text()='Save']")private WebElement saveBtn;
	
	@FindBy(xpath="//button[@data-dismiss='alert']")private WebElement alertMsg;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement searchBtnMain;

	
	
	//public AddNewsPage clickManageNews() {
		//manageNews.click();
		//return this;
	//}
	
	public AddNewsPage clickNewBtn() {
		newBtn.click();
		return this;
	}
	
	public AddNewsPage enterNews() {
		enterNews.sendKeys("testing news 1");
		return this;
	}
	
	public AddNewsPage clickSaveBtn() {
		saveBtn.click();
		return this;
	}
	
	public boolean isAlertCameonSaveNews() {
		return alertMsg.isDisplayed();
	}
	
	public SearchNewsPage clickSearchBtnMain() {
		searchBtnMain.click();
		return new SearchNewsPage(driver);
	}
}
