package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchUserPage {

	public WebDriver driver;
	
	public SearchUserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement searchBtnMain;
	@FindBy(xpath="//input[@id='un']")private WebElement username;
	@FindBy(xpath="//select[@id='ut']")private WebElement selectUserType;
	@FindBy(xpath="//button[@name='Search']")private WebElement searchBtn;
	
	
	public void clickSearchBtnMain() {
		searchBtnMain.click();
	}
	
	public void enterUserName() {
		username.sendKeys("seleUser");
	}
	
	public void selectUserType() {
		Select select=new Select(selectUserType);
		select.selectByIndex(1);
	}
	
	public void clickSearchBtnSmall() {
		searchBtn.click();
	}
}
