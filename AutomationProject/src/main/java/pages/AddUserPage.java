package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddUserPage {
	
	public WebDriver driver;
	
	public AddUserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-users']")private WebElement adminUser;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']")private WebElement manageUser;
	@FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement newBtn;
	@FindBy(xpath="//input[@name='username']")private WebElement username;
	@FindBy(xpath="//input[@name='password']")private WebElement paswd;
	@FindBy(xpath="//select[@id='user_type']")private WebElement userTypeSelect;
	@FindBy(xpath="//button[@name='Create']")private WebElement saveBtn;
	
	@FindBy(xpath="//button[@data-dismiss='alert']")private WebElement alert;
	
	
	public void clickAdminUsers() {
		adminUser.click();
	}
	
	public void clickManagerUser() {
		manageUser.click();
	}
	
	public void clickNew() {
		newBtn.click();
		username.sendKeys("seleUser");
		paswd.sendKeys("test22");
	}
	
	public void selectUserType() {
		Select select=new Select(userTypeSelect);
		select.selectByIndex(1);
	}
	
	public void clickSaveBtn() {
		saveBtn.click();
	}
	
	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}

}
