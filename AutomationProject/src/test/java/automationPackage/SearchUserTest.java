package automationPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AddUserPage;
import pages.LoginPage;
import pages.SearchUserPage;
import utilities.ExcelUtility;

public class SearchUserTest extends Base {
	@Test(description="verify whether user is able to search user")
	public void searchUser() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickSignInButton();

		AddUserPage addUser = new AddUserPage(driver);
		addUser.clickAdminUsers();
		addUser.clickManagerUser();

		SearchUserPage search = new SearchUserPage(driver);
		search.clickSearchBtnMain();
		search.enterUserName();
		search.selectUserType();
		search.clickSearchBtnSmall();
	}
}
