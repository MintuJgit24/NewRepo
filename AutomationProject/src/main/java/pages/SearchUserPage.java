package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class SearchUserPage {

	public WebDriver driver;
	
	PageUtility pageUtility=new PageUtility();
	
	public SearchUserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement searchBtnMain;
	@FindBy(xpath="//input[@id='un']")private WebElement username;
	@FindBy(xpath="//select[@id='ut']")private WebElement selectUserType;
	@FindBy(xpath="//button[@name='Search']")private WebElement searchBtn;
	
	
	//public SearchUserPage clickSearchBtnMain() {
		//searchBtnMain.click();
		//return this;
	//}
	
	public SearchUserPage enterUserName() {
		username.sendKeys("seleUser");
		return this;
	}
	
	public SearchUserPage selectUserType() {
		//Select select=new Select(selectUserType);
		//select.selectByIndex(1);
		pageUtility.selectByIndex(selectUserType, 1);
		return this;
	}
	
	public SearchUserPage clickSearchBtnSmall() {
		searchBtn.click();
		return this;
	}
}
