package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-users']")private WebElement adminUser;
	@FindBy(xpath="//li[@class='nav-item dropdown']")private WebElement userNameLink;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']")private WebElement logout;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']")private WebElement moreInfo;
	
	public HomePage clickUserNameLink() {
		userNameLink.click();
		return this;
	}
	
	public HomePage clickLogout() {
		logout.click();
		return this;
	}
	
	public AddUserPage clickAdminUsers() {
			adminUser.click();
			return new AddUserPage(driver);
		}
	
	public SubCategoryPage clickMoreInfo() {
		moreInfo.click();
		return new SubCategoryPage(driver);
	} 
	

}
