package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	// this concept is needed for all tests
	// constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;

		// page factory initialise
		// to inititialise elements of pageclass
		PageFactory.initElements(driver, this);

	}

	// to locate element in page class
	@FindBy(xpath = "//input[@id='loginform-username']")
	private WebElement userName;
	@FindBy(xpath = "//input[@id='loginform-password']")
	private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement button;

	// to perform action create method
	public void enterUserNameOnUserNameField(String username) {
		userName.sendKeys(username);
	}

	public void enterPasswordOnPasswordField(String pswd) {
		password.sendKeys(pswd);
	}

	public void clickLogin() {
		button.click();
	}

}
