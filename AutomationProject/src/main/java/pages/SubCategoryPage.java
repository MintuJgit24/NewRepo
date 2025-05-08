package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import constant.Constant;
import utilities.FileUploadUtility;
import utilities.PageUtility;

public class SubCategoryPage {
	public WebDriver driver;

	PageUtility pageUtility = new PageUtility();

	public SubCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']")private
	// WebElement moreInfo;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement newBtn;
	@FindBy(xpath = "//select[@name='cat_id']")
	private WebElement selectCategory;
	@FindBy(xpath = "//input[@id='subcategory']")
	private WebElement subCategory;
	@FindBy(xpath = "//input[@name='main_img']")
	private WebElement chooseFile;
	@FindBy(xpath = "//button[@name='create']")
	private WebElement saveBtn;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	private WebElement seacrhBtnMain;
	@FindBy(xpath = "//select[@name='un']")
	private WebElement searchCategory;
	@FindBy(xpath = "//input[@name='ut']")
	private WebElement enterCategory;
	@FindBy(xpath = "//button[@name='Search']")
	private WebElement searchBtn;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement alertSuccess;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td[1]")private WebElement tableValue;

	// public SubCategoryPage clickMoreInfo() {
	// moreInfo.click();
	// return this;
	// }

	public SubCategoryPage clickNewBtn() {
		newBtn.click();
		return this;
	}

	public SubCategoryPage selectCategoryFromDropDown(String categry) {
		// Select select = new Select(selectCategory);
		// select.selectByContainsVisibleText("Electronics");
		pageUtility.selectByContainsVisibleText(selectCategory,categry);
		return this;
	}

	public SubCategoryPage enterSubCategory(String subCatgry) {
		subCategory.sendKeys(subCatgry);
		return this;
	}

	public SubCategoryPage chooseImage() {
		// chooseFile.sendKeys("C:\\Users\\mintu\\OneDrive\\Pictures\\028e0308-738c-4faa-a82f-23d17c19709a_2310x1300.jpg");
		FileUploadUtility fileUpload = new FileUploadUtility();
		fileUpload.sendKeysForFileUpload(chooseFile, Constant.IMGPATH);
		return this;
	}

	public SubCategoryPage clickSaveBtn() {
		saveBtn.click();
		return this;
	}

	public boolean succesAlertAfterAddingSubCategory() {
		return alertSuccess.isDisplayed();
	}

	public SubCategoryPage clickSearchBtnMain() {
		seacrhBtnMain.click();
		return this;

	}

	public SubCategoryPage selectSearchCategory(String categry) {
		// Select select = new Select(searchCategory);
		// select.selectByContainsVisibleText("Electronics");
		pageUtility.selectByContainsVisibleText(searchCategory, categry);
		return this;
	}

	public SubCategoryPage enterSearchSubCategory(String subCategry) {
		enterCategory.sendKeys(subCategry);
		return this;
	}

	public SubCategoryPage clickSearchBtnSmall() {
		searchBtn.click();
		return this;
	}
	
	public String getTableValue() {
		return tableValue.getText();
	}

}
