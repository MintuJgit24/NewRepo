package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SubCategoryPage {
public WebDriver driver;
	
	public SubCategoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']")private WebElement moreInfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement newBtn;
	@FindBy(xpath="//select[@name='cat_id']")private WebElement selectCategory;
	@FindBy(xpath="//input[@id='subcategory']")private WebElement subCategory;
	@FindBy(xpath="//input[@name='main_img']")private WebElement chooseFile;
	@FindBy(xpath="//button[@name='create']")private WebElement saveBtn;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement seacrhBtnMain;
	@FindBy(xpath="//select[@name='un']")private WebElement searchCategory;
	@FindBy(xpath="//input[@name='ut']")private WebElement enterCategory;
	@FindBy(xpath="//button[@name='Search']")private WebElement searchBtn;
	
	
	//public SubCategoryPage clickMoreInfo() {
		//moreInfo.click();
		//return this;
	//}
	
	public SubCategoryPage clickNewBtn() {
		newBtn.click();
		return this;
	}
	
	public SubCategoryPage selectCategoryFromDropDown() {
		Select select=new Select(selectCategory);
		select.selectByContainsVisibleText("Electronics");
		return this;
	}
	
	public SubCategoryPage enterSubCategory() {
		subCategory.sendKeys("I-phone");
		return this;
	}
	
	public SubCategoryPage chooseImage() {
		chooseFile.sendKeys("C:\\Users\\mintu\\OneDrive\\Pictures\\028e0308-738c-4faa-a82f-23d17c19709a_2310x1300.jpg");
		return this;
	}
	
	public SubCategoryPage clickSaveBtn() {
		saveBtn.click();
		return this;
	}
	
	public SubCategoryPage clickSearchBtnMain() {
		seacrhBtnMain.click();
		return this;
		
	}
	
	public SubCategoryPage selectSearchCategory() {
		Select select=new Select(searchCategory);
		select.selectByContainsVisibleText("Electronics");
		return this;
	}
	
	public SubCategoryPage enterSearchSubCategory() {
		enterCategory.sendKeys("I-phone");
		return this;
	}
	
	public SubCategoryPage clickSearchBtnSmall() {
		searchBtn.click();
		return this;
	}

}
