package automationPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginPageTest extends Base {

	public HomePage homePage;

	@Test(priority = 1, description = "verify whether user is able to login with valid credentials")
	public void verifyUserLoginWithValidCredentials() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");

		LoginPage login = new LoginPage(driver);
		// chaining of methods
		login.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		// login.enterPasswordOnPasswordField(password);
		homePage = login.clickSignInButton();
		boolean isHomePageDisplayed = login.isDashboardDisplayed();
		// to verify tc passes, this comes if tc passes
		Assert.assertTrue(isHomePageDisplayed,Constant.ERR_MSG_FOR_LOGIN_CLICK);
		// if home page not loaded this msg displays and TC failed
		// Assert.assertFalse(isHomePageDisplayed, "Home page is loaded");
	}

	@Test(priority = 2, description = "verify whether user is able to login with invalid username and valid password")
	public void verifyUserLoginWithInvalidUserNameAndValidPassword() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");

		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickSignInButton();
		// boolean isLoginBoxDisplayed = login.isLoginBoxDisplayed();
		//boolean isHomePageDisplayed = login.isDashboardDisplayed();
		//Assert.assertFalse(isHomePageDisplayed, "Login success");
	}

	@Test(priority = 3, description = "verify whether user is able to login with valid username and invalid password")
	public void verifyUserLoginWithValidUserNameAndInvalidPassword() throws IOException {
		String username = ExcelUtility.getStringData(2, 0, "LoginPage");
		String password = ExcelUtility.getStringData(2, 1, "LoginPage");

		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickSignInButton();
		// boolean isLoginBoxDisplayed = login.isLoginBoxDisplayed();
		//boolean isHomePageDisplayed = login.isDashboardDisplayed();
		//Assert.assertTrue(isHomePageDisplayed, "Login success");
	}

	@Test(priority = 4, description = "verify whether user is able to login with invalid username and invalid password")
	public void verifyUserLoginWithInvalidUserNameAndInvalidPassword() throws IOException {
		String username = ExcelUtility.getStringData(3, 0, "LoginPage");
		String password = ExcelUtility.getStringData(3, 1, "LoginPage");

		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickSignInButton();
		// boolean isLoginBoxDisplayed = login.isLoginBoxDisplayed();
		//boolean isHomePageDisplayed = login.isDashboardDisplayed();
		//Assert.assertTrue(isHomePageDisplayed, "Login success");
	}
}
