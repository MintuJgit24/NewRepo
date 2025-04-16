package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

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

	public void enterUsernameOnUsernameField(String username) {
		userName.sendKeys(username);

	}

	public void enterPasswordOnPasswordField(String password) {
		pswd.sendKeys(password);
	}

	public void clickSignInButton() {
		signIn.click();
	}

}
