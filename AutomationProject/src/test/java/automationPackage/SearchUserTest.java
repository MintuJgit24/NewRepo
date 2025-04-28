package automationPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AddUserPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchUserPage;
import utilities.ExcelUtility;

public class SearchUserTest extends Base {

	public HomePage homePage;
	public AddUserPage addUser;
	public SearchUserPage search;

	@Test(description = "verify whether user is able to search user")
	public void searchUser() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homePage = login.clickSignInButton();
		// login.enterPasswordOnPasswordField(password);
		// login.clickSignInButton();

		// AddUserPage addUser = new AddUserPage(driver);
		// addUser.clickAdminUsers();
		// addUser.clickManagerUser();
		addUser = homePage.clickAdminUsers();
		addUser.clickManagerUser();
		search = addUser.clickSearchBtnMain();
		search.enterUserName().selectUserType().clickSearchBtnSmall();

		// SearchUserPage search = new SearchUserPage(driver);
		// search.clickSearchBtnMain();
		// search.enterUserName();
		// search.selectUserType();
		// search.clickSearchBtnSmall();

		String expected = ".........RESULT NOT FOUND.......";
		String actual = search.getTableValue();
		//System.out.println(actual);

		boolean showResults = true;
		if (actual.equals(expected)) {
			showResults = false;
			Assert.assertFalse(showResults, Constant.ERR_MSG_USER_FOUND);
		} else {
			Assert.assertTrue(showResults, Constant.ERR_MSG_USER_NOT_FOUND);
		}

	}
}
