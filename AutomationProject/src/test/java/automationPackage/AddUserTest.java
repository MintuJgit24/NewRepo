package automationPackage;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AddUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AddUserTest extends Base {

	public HomePage homePage;
	public AddUserPage addUser;
	public FakerUtility fakerUtility = new FakerUtility();

	@Test(description = "verify whether user is able to add new user", retryAnalyzer = retryPackage.Retry.class)
	public void addNewUser() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homePage = login.clickSignInButton();
		// login.enterPasswordOnPasswordField(password);
		// login.clickSignInButton();

		String usrname = ExcelUtility.getStringData(0, 0, "AdminUsers");
		String pasword = ExcelUtility.getStringData(0, 1, "AdminUsers");
		String usertype = ExcelUtility.getStringData(0, 2, "AdminUsers");
		// AddUserPage addUser=new AddUserPage(driver);
		// addUser.clickAdminUsers();
		// addUser.clickManagerUser();
		// addUser.clickNew();
		// addUser.selectUserType();
		// addUser.clickSaveBtn();
		addUser = homePage.clickAdminUsers();
		addUser.clickManagerUser().clickNew().enterUsername(usrname).enterPasword(pasword).selectUserType(usertype)
				.clickSaveBtn();

		boolean isAlertDisplayed = addUser.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed, Constant.ERR_MSG_ALERT_AFTER_ADDING_USER);
	}

	// using fakerUtility
	@Test(description = "verify whether user is able to add new user", retryAnalyzer = retryPackage.Retry.class)
	public void addNewUserFake() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homePage = login.clickSignInButton();

		// using fake username instead of excel
		String fakeData = fakerUtility.getFakeFirstName();
		String pasword = ExcelUtility.getStringData(0, 1, "AdminUsers");
		String usertype = ExcelUtility.getStringData(0, 2, "AdminUsers");
		addUser = homePage.clickAdminUsers();
		addUser.clickManagerUser().clickNew().enterUsername(fakeData).enterPasword(pasword).selectUserType(usertype)
				.clickSaveBtn();

		boolean isAlertDisplayed = addUser.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed, Constant.ERR_MSG_ALERT_AFTER_ADDING_USER);
	}

	// using parameter here and in xml
    /*
	@Test(description = "verify whether user is able to add new user", retryAnalyzer = retryPackage.Retry.class)
	@Parameters({ "username", "password" })
	public void addNewUserParam(String usrname, String pasword) throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homePage = login.clickSignInButton();

		String usertype = ExcelUtility.getStringData(0, 2, "AdminUsers");
		addUser = homePage.clickAdminUsers();
		addUser.clickManagerUser().clickNew().enterUsername(usrname).enterPasword(pasword).selectUserType(usertype)
				.clickSaveBtn();
		boolean isAlertDisplayed = addUser.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed, Constant.ERR_MSG_ALERT_AFTER_ADDING_USER);
	}*/

}
