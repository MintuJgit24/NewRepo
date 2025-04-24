package automationPackage;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AddUserTest extends Base {

	public HomePage homePage;
	public AddUserPage addUser;

	@Test(description = "verify whether user is able to add new user")
	public void addNewUser() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		homePage = login.clickSignInButton();
		// login.enterPasswordOnPasswordField(password);
		// login.clickSignInButton();

		// AddUserPage addUser=new AddUserPage(driver);
		// addUser.clickAdminUsers();
		// addUser.clickManagerUser();
		// addUser.clickNew();
		// addUser.selectUserType();
		// addUser.clickSaveBtn();
		addUser = homePage.clickAdminUsers();
		addUser.clickManagerUser().clickNew().selectUserType().clickSaveBtn();

		boolean isAlertDisplayed = addUser.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed, "Alert after adding user is not displayed.");
	}
}
