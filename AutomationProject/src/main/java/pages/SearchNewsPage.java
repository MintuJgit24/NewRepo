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
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement searchBtnMain;
	@FindBy(xpath="//input[@placeholder='Title']")private WebElement newsTitle;
	@FindBy(xpath="//button[@name='Search']")private WebElement searchBtnSmall;
	
	public void clickSearchBtnMain() {
		searchBtnMain.click();
	}
	
	public void enterNewsTitle() {
		newsTitle.sendKeys("Admission started for new Selenium batch");
	}
	
	public void clickSearchBtnSmall() {
		searchBtnSmall.click();
	}
}
