package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class LoginPage {

	public WebDriver driver;
	
	WaitUtility wait=new WaitUtility();

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text']")
	private WebElement userName;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pswd;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement signIn;

	@FindBy(xpath = "//span[text()='7rmart supermarket']")
	private WebElement homeTitle;
	
	@FindBy(xpath="//div[@class='login-box']")private WebElement loginBox;

	//chaining of methods
	public LoginPage enterUsernameOnUsernameField(String username) {
		userName.sendKeys(username);
		return this;//same class
	}

	public LoginPage enterPasswordOnPasswordField(String password) {
		pswd.sendKeys(password);
		return this;
	}

	public HomePage clickSignInButton() {
		wait.waitForElementClick(driver, signIn);
		signIn.click();
		return new HomePage(driver);//different class so do like this
	}

	// to check if dashboard is displayed or not
	public boolean isDashboardDisplayed() {
		return homeTitle.isDisplayed();
	}
	
	//to see loginbox for invalid credentials
	public boolean isLoginBoxDisplayed() {
		return loginBox.isDisplayed();
	}

}
