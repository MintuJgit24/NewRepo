package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchNewsPage {

	public WebDriver driver;

	public SearchNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement searchBtnMain;
	@FindBy(xpath="//input[@placeholder='Title']")private WebElement newsTitle;
	@FindBy(xpath="//button[@name='Search']")private WebElement searchBtnSmall;
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td[1]")private WebElement tableValue;
	
	//public SearchNewsPage clickSearchBtnMain() {
		//searchBtnMain.click();
		//return this;
	//}
	
	public SearchNewsPage enterNewsTitle() {
		newsTitle.sendKeys("testing news 60");
		return this;
	}
	
	public SearchNewsPage clickSearchBtnSmall() {
		searchBtnSmall.click();
		return this;
	}
	
	public String getTableValue() {
		return tableValue.getText();
	}
}
