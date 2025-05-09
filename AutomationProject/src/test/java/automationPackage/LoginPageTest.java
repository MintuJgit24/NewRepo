package automationPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginPageTest extends Base {

	public HomePage homePage;

	@Test(priority = 1, description = "verify whether user is able to login with valid credentials", groups = {
			"SmokeTest" })
	public void verifyUserLoginWithValidCredentials() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");

		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homePage = login.clickSignInButton();
		boolean isHomePageDisplayed = login.isDashboardDisplayed();
		Assert.assertTrue(isHomePageDisplayed, Constant.ERR_MSG_FOR_LOGIN_CLICK);

	}

	//using @DataProvider
	/*@Test(description = "verify whether user is able to login with valid credentials", groups = {
			"SmokeTest" }, dataProvider = "credentials")
	public void verifyUserLoginWithValidCredentials(String usrnme, String pswd) throws IOException {
		
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(usrnme).enterPasswordOnPasswordField(pswd);
		homePage = login.clickSignInButton();
		boolean isHomePageDisplayed = login.isDashboardDisplayed();
		Assert.assertTrue(isHomePageDisplayed, Constant.ERR_MSG_FOR_LOGIN_CLICK);

	}*/

	@Test(priority = 2, description = "verify whether user is able to login with invalid username and valid password", groups = {
			"SmokeTest" }, retryAnalyzer = retryPackage.Retry.class)
	public void verifyUserLoginWithInvalidUserNameAndValidPassword() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");

		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homePage = login.clickSignInButton();
		boolean isLoginBoxDisplayed = login.isLoginBoxDisplayed();
		Assert.assertTrue(isLoginBoxDisplayed, Constant.ERR_MSG_FOR_INVALID_LOGIN);
	}

	@Test(priority = 3, description = "verify whether user is able to login with valid username and invalid password", retryAnalyzer = retryPackage.Retry.class)
	public void verifyUserLoginWithValidUserNameAndInvalidPassword() throws IOException {
		String username = ExcelUtility.getStringData(2, 0, "LoginPage");
		String password = ExcelUtility.getStringData(2, 1, "LoginPage");

		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homePage = login.clickSignInButton();
		boolean isLoginBoxDisplayed = login.isLoginBoxDisplayed();
		Assert.assertTrue(isLoginBoxDisplayed, Constant.ERR_MSG_FOR_INVALID_LOGIN);

	}

	@Test(priority = 4, description = "verify whether user is able to login with invalid username and invalid password", retryAnalyzer = retryPackage.Retry.class)
	public void verifyUserLoginWithInvalidUserNameAndInvalidPassword() throws IOException {
		String username = ExcelUtility.getStringData(3, 0, "LoginPage");
		String password = ExcelUtility.getStringData(3, 1, "LoginPage");

		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homePage = login.clickSignInButton();
		boolean isLoginBoxDisplayed = login.isLoginBoxDisplayed();
		Assert.assertTrue(isLoginBoxDisplayed, Constant.ERR_MSG_FOR_INVALID_LOGIN);

	}

	//using @DataProvider used for checking one TC with diff sets of credentials
	@DataProvider(name = "credentials")
	public Object[][] testData() {
		Object data[][] = { { "admin", "admin" }, { "admin", "test" } };
		return data;
	}
}
