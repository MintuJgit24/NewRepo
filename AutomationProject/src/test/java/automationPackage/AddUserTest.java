package automationPackage;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddUserPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AddUserTest extends Base {
	@Test(description="verify whether user is able to add new user")
	public void addNewUser() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickSignInButton();
		
		AddUserPage addUser=new AddUserPage(driver);
		addUser.clickAdminUsers();
		addUser.clickManagerUser();
		addUser.clickNew();
		addUser.selectUserType();
		addUser.clickSaveBtn();
		boolean isAlertDisplayed=addUser.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed, "Alert after adding user is not displayed.");
	}
}
