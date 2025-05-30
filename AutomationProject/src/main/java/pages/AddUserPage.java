package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AddUserPage {

	public WebDriver driver;

	PageUtility pageUtility = new PageUtility();

	public AddUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// @FindBy(xpath="//i[@class='nav-icon fas fa-users']")private WebElement
	// adminUser;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']")
	private WebElement manageUser;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	private WebElement newBtn;
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement paswd;
	@FindBy(xpath = "//select[@id='user_type']")
	private WebElement userTypeSelect;
	@FindBy(xpath = "//button[@name='Create']")
	private WebElement saveBtn;

	@FindBy(xpath = "//button[@data-dismiss='alert']")
	private WebElement alert;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	private WebElement searchBtnMain;


	// public void clickAdminUsers() {
	// adminUser.click();
	// }

	public AddUserPage clickManagerUser() {
		manageUser.click();
		return this;
	}

	public AddUserPage clickNew() {
		newBtn.click();
		//username.sendKeys("NGuser9");
		//paswd.sendKeys("test23");
		return this;
	}
	
	public AddUserPage enterUsername(String user_name) {
		username.sendKeys(user_name);
		return this;
	}
	
	public AddUserPage enterPasword(String pswd) {
		paswd.sendKeys(pswd);
		return this;
	}

	public AddUserPage selectUserType(String user_type) {
		// pageUtility.selectByVisibleText(userTypeSelect, "Staff");
		// pageUtility.selectByIndex(userTypeSelect, 1);
		
		pageUtility.selectByContainsVisibleText(userTypeSelect, user_type);
		return this;
	}

	public AddUserPage clickSaveBtn() {
		saveBtn.click();
		return this;
	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}

	public SearchUserPage clickSearchBtnMain() {
		searchBtnMain.click();
		return new SearchUserPage(driver);
	}
	

}
